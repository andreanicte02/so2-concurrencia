package com.company;

public class Main {

    public static  int id=0;

    public static void main(String[] args) {

        Barberia barberia = new Barberia();
        barberia.start();

        Runnable tarea1 = () ->{

            while (true){

                try {

                    Thread.sleep(15000);
                    System.out.println("ingreso un nuevo cliente");
                    Cliente c = new Cliente(barberia, id+"");
                    c.start();
                    id++;

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread hiloLlegada= new Thread(tarea1);
        hiloLlegada.start();






    }
}
