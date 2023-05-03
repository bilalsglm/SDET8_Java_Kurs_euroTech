package Day_53_Interface.HomeWork;

public class EXEFile implements ReadFile{
    @Override
    public String open() { return "opening.exe"; }
    @Override
    public String read() {
        return "reading.exe";
    }

    @Override
    public String save() {
        return "saving.exe";
    }

    @Override
    public String closed() {
        return "closing.exe";
    }
}
