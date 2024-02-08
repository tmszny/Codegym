package pl.codegym.task.task16.task1631;

import pl.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type) {

        ImageReader reader = null;
    try {

        if (type.equals(ImageTypes.BMP)) {
            reader = new BmpReader();
        } else if (type.equals(ImageTypes.JPG)) {
            reader = new JpgReader();
        } else if (type.equals(ImageTypes.PNG)) {
            reader = new PngReader();
        } else {
            throw new IllegalArgumentException();
        }

        return reader;
    } catch (NullPointerException e) {
        throw new IllegalArgumentException();
    }

    }
}
