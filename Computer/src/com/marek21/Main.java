package com.marek21;

import com.marek21.drive.SSDDrive;
import com.marek21.file.File;
import com.marek21.file.imagefile.GIfImageFIle;
import com.marek21.file.imagefile.JPGImageFile;
import com.marek21.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
        // write your code here
        GIfImageFIle gif1 = new GIfImageFIle("test1", 10);
        JPGImageFile jpg1 = new JPGImageFile("test2", 102, 10);
        MP3MusicFile mp3 = new MP3MusicFile("test3", 10, "ryuu", "tgjdg", 10);

        SSDDrive drive = new SSDDrive();

        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3);

  //      drive.listFiles();
        File file = drive.findFile("test2");
        System.out.println(file.getSize());



    }

}
