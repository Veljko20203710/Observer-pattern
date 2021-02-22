/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.observerdesingpattern.news;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Veljko
 */
public class Publisher {

    private String name;
    private List<Subscriber> subsribers;

    public Publisher(String name) {
        this.name = name;
        subsribers = new LinkedList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subsribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subsribers.remove(subscriber);
    }

    public void addNews(String news) {
        notifyAllSubscribers(news);
    }

    private void notifyAllSubscribers(String news) {
        for (Subscriber subsriber : subsribers) {
            subsriber.update(news);
        }
    }

}
