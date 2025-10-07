package utils;

import java.sql.*;

public class DBValidator {
    public static boolean validateTransaction(String fromAcc, String toAcc, String amount) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM transactions WHERE from_account = '" + fromAcc + "' AND to_account = '" + toAcc + "' AND amount = '" + amount + "'");
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
