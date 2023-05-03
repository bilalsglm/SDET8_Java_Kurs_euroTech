package Day_53_Interface.Soru1;

public class Bus extends Vehicle implements IDeisel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String chanceDeisel() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
