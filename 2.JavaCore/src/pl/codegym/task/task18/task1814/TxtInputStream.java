package pl.codegym.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {

        super(fileName);
        String[] s = fileName.split("\\.");

        if (!s[s.length-1].equals("txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

