package com.company;

public class Barberia extends Thread{

    public Barbero getBarbero() {
        return barbero;
    }

    private Barbero barbero;

    public Barberia(){
        this.barbero = new Barbero(this);
    }

    @Override
    public void run() {
        barbero.start();
        while (true);
    }
}
