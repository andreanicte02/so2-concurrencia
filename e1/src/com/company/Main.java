package com.company;

public class Main {

    //la programacion concurrente no es de to do determinista
    //son conurrentes por que los hilos estan coexistiendo al mismo tiempo
    //programacion concurrente no es secuencial
    //no sabemos si son paralelos, eso va depender del sistema operativo
    //el sistema operativo es el que se encarga que tarea se procesa primero
    //join, dice al hilo principal que se espere a que se complete el hilo a


    public static void main(String[] args) throws InterruptedException {


        Contador c = new Contador(0);


       /* Runnable tarea1 = () -> {

            for (int x =0; x<200;x++){
                System.out.println("hilo1-->"+x);
            }
        };

        Runnable tarea2=() ->{

            for (int x =0; x<200;x++){
                System.out.println("hilo2<**"+x);
            }

        };*/

        //Thread hilo1 = new Thread(tarea1);
        //hilo1.start();
        //Thread hilo2 = new Thread(tarea2);
        //hilo2.start();

        Hilo h1 = new Hilo("hilo1", c);

        Hilo h2 = new Hilo("hilo2", c);

        h1.start();
        h2.start();
        h1.join();
        h2.join();
        //h2.start();


        System.out.println(c.getC());



    }
}
