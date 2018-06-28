package com.example.redoan.harmonyfinal;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Redoan on 8/8/2016.
 */
public class Mp3Filter implements FilenameFilter {
    @Override
    public boolean accept(File file, String name) {
        return name.endsWith(".mp3");
    }
}
