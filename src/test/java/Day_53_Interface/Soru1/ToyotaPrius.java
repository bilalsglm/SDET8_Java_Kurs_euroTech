package Day_53_Interface.Soru1;

public class ToyotaPrius extends Vehicle implements IElectric,IGas{
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String chanceBatary() {
        return null;
    }

    @Override
    public String chanceOil() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
