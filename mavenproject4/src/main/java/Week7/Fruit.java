/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7;

/**
 *
 * @author ASUS
 */
public class Fruit {

    private String id, name, origin;
    private Double price;
    private int quantity;

    public Fruit(String id, String name, Double price, int quantity, String origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }
    
     public Fruit( String name, Double price, int quantity) {
        this.id = "";
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.origin = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    @Override
    public String toString() {
        return String.format("%-5s %-10s %-10.2f %-5d %-15s", id, name, price, quantity, origin);
    }

}
