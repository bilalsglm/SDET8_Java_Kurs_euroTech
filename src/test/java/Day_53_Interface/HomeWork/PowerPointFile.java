package Day_53_Interface.HomeWork;

public class PowerPointFile implements ReadFile {

    @Override
    public String open() {
        return "opening.ppt";
    }

    @Override
    public String read() {
        return "reading.ppt";
    }

    @Override
    public String save() {
        return "saving.ppt";
    }

    @Override
    public String closed() {
        return "closing.ppt";
    }
}
