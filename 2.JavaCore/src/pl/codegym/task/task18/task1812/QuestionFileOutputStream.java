package pl.codegym.task.task18.task1812;

import java.io.*;

/* 
Rozszerzanie AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream component;
    public QuestionFileOutputStream(AmigoOutputStream component) {
        this.component = component;
    }


    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);

    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Czy naprawdę chcesz zamknąć strumień? T/N");
        String answer = reader.readLine();

        if (answer.equals("T")) {
            component.close();
        }

    }
}

