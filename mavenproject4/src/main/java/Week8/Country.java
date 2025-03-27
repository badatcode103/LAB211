/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8;

/**
 *
 * @author ASUS
 */
public class Country {

    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }
    
    public Country() {
       
    }

    @Override
    public String toString() {
        return String.format("%-10s %-30S %-10.2f", countryCode, countryName, totalArea);
    }
    
    
}
