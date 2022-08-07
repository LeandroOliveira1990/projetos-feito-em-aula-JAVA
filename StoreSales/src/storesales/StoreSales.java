/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package storesales;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class StoreSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Scanner digite = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = digite.nextLine();
        System.out.print("Email: ");
        String email = digite.nextLine();
        System.out.print("Birth date (DD/MM/YYYY:) ") ;
        Date birthDate = sdf.parse(digite.nextLine());
        Client client = new Client(name, email, birthDate);
        System.out.println("");
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String statu = digite.nextLine();
        Order status = new Order(OrderStatus.valueOf(statu), client);
        
        System.out.print("How many items to this order? ");
        int orderNumber = digite.nextInt();
        System.out.println("");
        
       
        
        for (int i = 1; i <= orderNumber; i++) {
            digite.nextLine();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String namePro = digite.nextLine();
            System.out.print("Product price: ");
            double price = digite.nextInt();
            System.out.print("Quantity: ");
            int quantity = digite.nextInt();
            Product product = new Product(namePro, price);
            OrderItem order = new OrderItem(quantity, product.getPrice(), product);
            status.addItem(order);
            
        }
        System.out.println("");
        System.out.println("ORDER SUMMARY:");
        System.out.println(status);
        
        
        
        
        
        
        
        
        digite.close();
    }
    
}
