package com.marek21.drive;

import com.marek21.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(String  name);


}
