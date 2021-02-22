package fon.silab.observerdesingpattern.progressbar;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Veljko
 */
public class ServerPublisher {

    private List<ProgressBar> subscribers;

    public ServerPublisher() {
        createSubscribers();
    }

    private void createSubscribers() {
        this.subscribers = new LinkedList<>();
    }

    public void subscribe(ProgressBar subscriber) {
        subscribers.add(subscriber);
    }

    public void changeProgressValue() throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            notifyAll(i);
            Thread.sleep(random.nextInt(400));
        }
    }

    private void notifyAll(int i) throws InterruptedException {
        for (ProgressBar subscriber : subscribers) {
            subscriber.update(i);
        }
    }
}
