package factory;

public class XlsFileImport implements ImportFile {
    @Override
    public void importFile() {
        System.out.println("XLS file imported.");
    }
}
