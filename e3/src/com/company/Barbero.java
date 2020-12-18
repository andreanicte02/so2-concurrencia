package com.company;

public class Barbero extends Thread{

    private Barberia barberia;

    public boolean isAsSleep() {
        return isAsSleep;
    }

    private boolean isAsSleep = false;

    public Barbero(Barberia barberia){

        this.barberia = barberia;

    }

    @Override
    public void run() {
        try {
            System.out.println("inicia durmiendo");
            dormir();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true){
            System.out.println(".");
            if(!isAsSleep){
                try {
                    System.out.println("se manda a dormir");
                    dormir();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public synchronized void dormir() throws InterruptedException {


        isAsSleep = true;
        wait();
    }

    public synchronized void despertar(){
        System.out.println("se desperto");
        isAsSleep=false;
        notify();
    }

    public synchronized void cortarPelo(String name) throws InterruptedException {
        System.out.println("....cortando el pelo cliente no." + name);
        Thread.sleep(5000);
        System.out.println("....se termino de cortar el pelo no. "+ name);

    }
}
