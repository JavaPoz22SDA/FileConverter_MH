package pl.sda.fileconverter;

import java.io.IOException;

/**
 * @author  Marek Hetman
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Converter converter = new Converter();
        String sourceFilePath = "test.json";
        String outputFilePath = "test.xlsx";
        converter.convert(sourceFilePath, outputFilePath);
    }
}
