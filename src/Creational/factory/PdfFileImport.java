package Creational.factory;

public class PdfFileImport implements ImportFile {
    @Override
    public void importFile() {
        System.out.println("Pdf file imported");
    }
}
