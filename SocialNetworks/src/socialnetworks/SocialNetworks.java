/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socialnetworks;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Leandro
 */
public class SocialNetworks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelin to New Zealand",
                "I'm going to visit this wonderful country!", 12);
        
        p1.addComment(c1);
        p1.addComment(c2);
        
        
        System.out.println(p1);
        
        
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys",
                "See you tomorrow", 5);
        
        p2.addComment(c3);
        p2.addComment(c4);
        
        
        System.out.println(p2);
       
    }
    
}
