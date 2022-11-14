package com.marek21;

import com.marek21.drive.HDDDrive;
import com.marek21.drive.SSDDrive;


public class Main {

    public static void main(String[] args) {

        Monitor monitor = new Monitor();

       // HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();


        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("marek21.jpg"));
        drive.listFiles();




    }
}
