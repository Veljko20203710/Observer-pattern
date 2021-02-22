package fon.silab.observerdesingpattern.progressbar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;

/**
 *
 * @author Veljko
 */
public class ProgressBar extends JFrame {

    private JProgressBar progressBar;
    private int progress;
    private String name;

    public ProgressBar(String name) {
        setProgressBarName(name);
        prepareView();
    }

    private void setProgressBarName(String name) {
        this.name = name;
    }

    private void prepareView() {
        this.setTitle(name);
        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(40, 40, 260, 30);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        add(progressBar);
        setSize(350, 150);
        setLayout(null);
    }

    public void update(int progress) throws InterruptedException {
        this.progress = progress;
        progressBar.setValue(this.progress);
        if (progress == 100) {
            Thread.sleep(400);
            this.dispose();
        }
    }
}
