package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Cuenta {

    //la cuenta bancaria va tener un saldo inicial


    public int getSaldo() {
        return saldo;
    }

    private int saldo = 50;

    public void retiro(int valorRetiro){


        saldo = saldo - valorRetiro;


    }

}
