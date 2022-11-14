package com.marek21.usbdevice;

public class MemoryStick implements USBDevice  {
    private String  name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected Memoryu Stick");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("Please eject Memory Stick");
            return  false;

        }else {
            System.out.println("Memory stick disconneted");
            return true;

        }
    }

    public void eject(){
        System.out.println("Ejecting Memory Stick");
        ejected = true;


    }

    @Override
    public String getName() {
        return name;
    }
}
