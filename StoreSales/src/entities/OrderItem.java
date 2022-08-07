/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Leandro
 */
public class OrderItem {
    
    private Integer quantity;
    private Double price;
    
    private Product products;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product products) {
        this.quantity = quantity;
        this.price = price;
        this.products = products;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }
    
    
    
    public Double subTotal(){
        return this.getQuantity() * this.getPrice();
    }
    
}
