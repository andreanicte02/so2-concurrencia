package com.company;



public class Hilo extends Thread{

    String name;
    Contador c;


    public Hilo (String name, Contador c){
        this.name = name;
        this.c = c;
    }

    @Override
    public void run() {
        for (int x =0; x<100000;x++){

            //System.out.println(name+"->"+x);
            c.aumento();

        }
    }
}
