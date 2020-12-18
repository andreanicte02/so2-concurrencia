package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class People extends Thread{


    Cuenta cuenta;



    public People(Cuenta cuenta){

        this.cuenta = cuenta;
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
    private void retirarBaras(int retiro) {


        if(cuenta.getSaldo()>=retiro){


            System.out.println("1. saldo actual: " + cuenta.getSaldo()+" Nombre: " +Thread.currentThread().getName() + " va realizar una transaccion");
            cuenta.retiro(retiro);
            System.out.println("se realizo na transsacion");
            System.out.println("saldo: " + cuenta.getSaldo());


        }else
        {
            System.out.println(Thread.currentThread().getName()+ " no hay saldo" + cuenta.getSaldo());
        }





    }

}
