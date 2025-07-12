package Creational.factory;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        ImportFile xlsImport = FileImportFactory.createImportFile("XLS");
        xlsImport.importFile();
        ImportFile pdfImport = FileImportFactory.createImportFile("PDF");
        pdfImport.importFile();
        ImportFile csvImport = FileImportFactory.createImportFile("CSV");
        csvImport.importFile();
    }
}
