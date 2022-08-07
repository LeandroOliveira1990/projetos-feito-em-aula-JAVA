/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class Order {
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;
    
    private Client client;
    
    List<OrderItem> items = new ArrayList<>();

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    

    public Order() {
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

   

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

   public void addItem(OrderItem item){
       items.add(item);
       
   }
   
   public void removeItem(OrderItem item){
       items.remove(item);
       
   }
   
   public Double total(){
       double sum =0;
       for (OrderItem item : items) {
           
           sum += item.subTotal();
           
       }
       
       return sum;
   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + moment.format(formatter));
        sb.append("\nOrder status: " + status.toString());
        sb.append("\nClient: " + client.getName() + " (" + sdf.format(client.getBirthDate()) +
                ") - " + client.getEmail() );
        sb.append("\nOrder items:\n");
        for (OrderItem item : items) {
            sb.append(item.getProducts().getName() +
                    ", $" + String.format("%.2f",item.getPrice()) +", Quantity: " +  item.getQuantity() +
                    ", Subtotal: $" + String.format("%.2f",item.subTotal()) + "\n");
            
        }
        sb.append("\nTotal price: " + String.format("%.2f", total()));
               
        
        
        return sb.toString();
                    
            
        
    }
   
   
    
    
    
}
