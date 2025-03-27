/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        ManagerEastAsiaCountries input = new ManagerEastAsiaCountries();
        Scanner sc = new Scanner(System.in);
        EastAsiaCountries country = input.enterCountry(sc);
        String url = "jdbc:sqlserver://localhost:1433;databaseName=MyDatabase;encrypt=true;trustServerCertificate=true";
        String name = "sa";
        String password = "Dongl@m2025";
        String insertSQL = "INSERT INTO EastAsiaCountries (CountryCode, CountryName, TotalArea, CountryTerrain) "
                + "VALUES (?, ?, ?, ?)";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url, name, password); PreparedStatement stmt = conn.prepareStatement(insertSQL)) {

                stmt.setString(1, country.getCountryCode());
                stmt.setString(2, country.getCountryName());
                stmt.setFloat(3, country.getTotalArea());
                stmt.setString(4, country.getCountryTerrain());

                int rowsAffected = stmt.executeUpdate();
                System.out.println(rowsAffected + " rows inserted.");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
