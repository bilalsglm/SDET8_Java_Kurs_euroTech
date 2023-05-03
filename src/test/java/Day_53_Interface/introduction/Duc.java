package Day_53_Interface.introduction;

public class Duc implements Animal, Flying {
    //Birden fazla interface (kurallari yazan siniflar olarak da ifade edilir)
    //classa implement edilebilir, burada oldugu gibi
    @Override
    public String food() {
        return null;
    }
}
