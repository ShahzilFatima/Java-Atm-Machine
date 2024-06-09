package bank.management.system;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileHandler {
    public static void saveData(String name, String fname,
            String pincode, String gender, String email,
            String marital, String address, String city) {
        PrintWriter input;

        String q = "Name:" + name + " " +
                "Father Name:" + fname + " " +
                "Pincode:" + pincode + "" +
                "Gender:" + gender + "" +
                "Email:" + email + " " +
                "Marital Status:" + marital + " " +
                "Address:" + address + " " +
                "City:" + city + "\n";

        try {
            input = new PrintWriter(new FileOutputStream("personal_data.txt", true));
            input.printf(q);
            input.close(); // Close the PrintWriter after writing data
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}
