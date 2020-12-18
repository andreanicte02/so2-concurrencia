package com.company;

public class Main {

    public static void main(String[] args) {

        //tarea del cajero
        Cajero cajero= new Cajero();
        Thread h1 = new Thread(cajero,"juan");
        Thread h2 = new Thread(cajero,"broly");

        h1.start();
        h2.start();

    }
}
