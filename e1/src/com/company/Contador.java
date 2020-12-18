package com.company;

import java.util.concurrent.locks.ReentrantLock;

//contador + contador
//contador++
public class Contador {


    private ReentrantLock candado = new ReentrantLock();



    public Integer getC() {
        return c;
    }

    private Integer c;

    public Contador(Integer c){

        this.c = c;

    }

    public void aumento(){
        //this.candado.lock();
        this.c = this.c + 1;
        //this.candado.unlock();
    }



}
