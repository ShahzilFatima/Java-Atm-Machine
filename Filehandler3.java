package bank.management.system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Filehandler3 {
    static String cardR = "";
    static String pinR = "";

    public static void datacard(ArrayList<String> cardNumbers) {
        try {
            PrintWriter inputcard = new PrintWriter(new FileOutputStream("card_data.txt", true));
            for (String i : cardNumbers) {
                inputcard.printf(i + ",");
            }
            inputcard.close();
            System.out.println("Card data written successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing card data: " + e.getMessage());
        }
    }

    public static String cardM(int i) {
        Scanner read;
        try {

            read = new Scanner(new FileInputStream("card_data.txt"));
            while (read.hasNextLine()) {
                cardR += read.nextLine();
            }
            read.close();
            String[] arr = cardR.split(",");
            // Convert the array into arraylist
            ArrayList<String> cardL = new ArrayList<>(Arrays.asList(arr));
            return cardL.get(i);

        } catch (Exception e) {
            System.out.println("An error occurred while reading card data: " + e.getMessage());
            return null;
        }
    }

    public static void datapin(ArrayList<String> pins) {
        try {
            PrintWriter inputpin = new PrintWriter(new FileOutputStream("pin_data.txt", true));
            for (String i : pins) {
                inputpin.printf(i + ",");
            }
            inputpin.close();
            System.out.println("PIN data written successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing PIN data: " + e.getMessage());

        }
    }

    public static String pinM(int i) {
        Scanner read2;

        try {

            read2 = new Scanner(new FileInputStream("pin_data.txt"));
            while (read2.hasNextLine()) {
                pinR += read2.nextLine();
            }
            read2.close();
            String[] arr = pinR.split(",");

            ArrayList<String> pinL = new ArrayList<>(Arrays.asList(arr));
            return pinL.get(i);

        } catch (Exception e) {
            System.out.println("An error occurred while reading PIN data: " + e.getMessage());
            return null;

        }

    }
}
