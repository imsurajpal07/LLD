package Creational.factory;

public class FileImportFactory {

    public static ImportFile createImportFile(String fileType) {
        return switch (fileType) {
            case "XLS" -> new XlsFileImport();
            case "CSV" -> new CsvFileImport();
            case "PDF" -> new PdfFileImport();
            default -> throw new IllegalArgumentException("Invalid file type %s".formatted(fileType));
        };
    }
}
