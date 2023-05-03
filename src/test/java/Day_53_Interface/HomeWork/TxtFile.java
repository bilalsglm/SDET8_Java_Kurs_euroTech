package Day_53_Interface.HomeWork;

public class TxtFile implements ReadFile {

    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String closed() {
        return "closing.txt";
    }
}
