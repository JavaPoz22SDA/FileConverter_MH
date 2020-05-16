package pl.sda.fileconverter;

import java.io.IOException;

public class Converter {

    public void convert(String sourceFilePath, String outputFilePath) throws IOException {

        ReaderFactory readerFactory = new ReaderFactory();
        Reader reader = readerFactory.produce(sourceFilePath);
        reader.read(sourceFilePath);
        if (reader instanceof JSONReader) {
            System.out.println("Dziala, mam obiekt JSONReader");
            System.out.println(reader.read(sourceFilePath).toString());
        }

    }

}

