package pl.sda.fileconverter;

public class ReaderFactory {

    public Reader produce(String filePath){
        if(filePath.endsWith(".json")) return new JSONReader();;
        return null;
    }
}
