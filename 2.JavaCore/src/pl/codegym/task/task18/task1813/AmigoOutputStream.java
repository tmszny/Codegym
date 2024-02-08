package pl.codegym.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream component;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(FileOutputStream component) throws FileNotFoundException {
        super(fileName);
        this.component = component;

    }

    public void write(int i) throws IOException {
        component.write(i);
    }

    public void write(byte[] bytes) throws IOException {
        component.write(bytes);
    }

    public void write(byte[] bytes, int i, int j) throws IOException {
        component.write(bytes, i, j);
    }

    public void write(int i, boolean b) throws IOException {
        component.write(i);
    }

    public void flush() throws IOException {
        component.flush();
    }

    public void close() throws IOException {
        component.flush();
        String s = "CodeGym © All rights reserved.";
        component.write(s.getBytes());
        component.close();
    }

}
