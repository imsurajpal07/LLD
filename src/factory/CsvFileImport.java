package factory;

public class CsvFileImport implements ImportFile {
    @Override
    public void importFile() {
        System.out.println("CSV file imported.");
    }
}
