package com.marek21.file.musicfile;

import com.marek21.file.AbstractFile;
import com.marek21.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected String title;

    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);


        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {

        return FileType.MUSIC;
    }
}
