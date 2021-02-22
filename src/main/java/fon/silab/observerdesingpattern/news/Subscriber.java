/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.observerdesingpattern.news;

import fon.silab.observerdesingpattern.news.Publisher;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Veljko
 */
public class Subscriber {
    String name;
    List<Publisher> publishers;

    public Subscriber(String name) {
        this.name = name;
        publishers = new LinkedList<>();
    }

    public void update(String news) {
        System.out.println("Subscriber with name:"+name+" received news:"+news);
    }
    
    
    
}
