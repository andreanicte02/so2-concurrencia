package com.company;

public class Cliente extends Thread{

    Barberia barberia;

    public Cliente(Barberia barberia, String name){
        this.barberia = barberia;
        this.setName(name);
    }

    @Override
    public void run() {
        while (true){

            if(barberia.getBarbero().isAsSleep()){
                barberia.getBarbero().despertar();
                try {
                    barberia.getBarbero().cortarPelo(getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }

        }

    }
}
