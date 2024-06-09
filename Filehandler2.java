package bank.management.system;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Filehandler2 {
    public static void saveData2(String reli, String cate, String inc, String edu, String occ, String phone,
            String Cnic, String scitizen, String eAccount) {
        PrintWriter input;

        String q = "Religion: " + reli + "\n" +
                "Category: " + cate + "\n" +
                "Income: " + inc + "\n" +
                "Education: " + edu + "\n" +
                "Occupation: " + occ + "\n" +
                "Phone : " + phone + "\n" +
                "Cnic: " + Cnic + "\n" +
                "Senior Citizen: " + scitizen + "\n" +
                "Existing Account: " + eAccount + "\n\n";
        try {
            input = new PrintWriter(new FileOutputStream("additional_data.txt", true));
            input.printf(q);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
