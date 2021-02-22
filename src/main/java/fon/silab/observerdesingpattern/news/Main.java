/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.observerdesingpattern.news;

/**
 *
 * @author Veljko
 */
public class Main {
    
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Publisher1");
        
        Subscriber subscriber1 = new Subscriber("Subscriber1");
        publisher.subscribe(subscriber1);
        
        Subscriber subscriber2 = new Subscriber("Subscriber2");
        publisher.subscribe(subscriber2);
        
        publisher.addNews("News number 1");
    }
}
