package Day_26_ObjectAndClass;

public class BMW {
    String marka="BMW";// Her yerde bu markanin ifade ettigi class ismini de bu markayi tanimladigi icin
                        // degeri atadi
    String model;
    double price;
    boolean aracElektrikliMi;

    public void showPrice(){
        switch (model){
            case "330i":price=55000;break;
            case "740i":price=75000;break;
            case "x1":price=43000;break;
            case "x2":price=48000;break;
            case "x3":price=51000;break;
            case "x5":price=53000;break;
            default:
                System.out.println(marka+" is not availabel ");
                price=0.00;
        }
        System.out.println("This model`s price is "+price);

    }

}
