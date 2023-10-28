package com.marek21.file.imagefile;



public class GIfImageFIle extends AbstractImageFile {

    String name;
    int size;



    public GIfImageFIle(String name, int size) {
      super(name, size);

    }


    public void displayImage(){
        System.out.println("displaying gif");
    }
}




