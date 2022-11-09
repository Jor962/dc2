package org.example;

public class NewThread extends Thread{
    private final int id;

    public NewThread(int id) {
        this.id = id;
    }

    public void run(){
        System.out.println("Hello, I am worker #" + id);
    }
}
