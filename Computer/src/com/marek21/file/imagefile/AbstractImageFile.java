package com.marek21.file.imagefile;

import com.marek21.file.AbstractFile;
import com.marek21.file.FileType;

public abstract class AbstractImageFile extends AbstractFile{

    protected String name;
    protected int size;



    public AbstractImageFile(String name, int size) {
     super(name, size);

    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }






}
