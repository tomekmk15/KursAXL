package com.marek21;

import java.util.ArrayList;
import java.util.List;

public class Computer {

   private Monitor monitor;
   private  Drive drive;
   private  Headphones headphones;


   List<USBdevices> USBDevices = new ArrayList<>();


    public Computer(Monitor monitor, Drive drive){



        this.monitor = monitor;
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBdevices> getUSBDevices() {
        return USBDevices;
    }
}
