package com.company;

public class Cajero implements Runnable {


    Cuenta cuenta = new Cuenta();


    public Cajero(){

    }
    @Override
    public void run() {
        for (int i =0; i<5;i++){

            retirarBaras(10);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //solamente un hilo puede acceder a este metodo
    private  void retirarBaras(int retiro) {

        if(cuenta.getSaldo()>=retiro){


            System.out.println("1. saldo actual: " + cuenta.getSaldo()+" Nombre: " +Thread.currentThread().getName() + " va realizar una transaccion");
            cuenta.retiro(retiro);
            System.out.println("2. Saldo actual: " + cuenta.getSaldo() + " Nombre: " +Thread.currentThread().getName() + " va realizar una transaccion");

        }else
        {
            System.out.println(Thread.currentThread().getName()+ " no hay saldo" + cuenta.getSaldo());
        }





    }
}
