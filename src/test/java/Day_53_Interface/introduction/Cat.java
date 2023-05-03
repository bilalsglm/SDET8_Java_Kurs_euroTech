package Day_53_Interface.introduction;

import Day_53_Interface.introduction.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cat implements Animal {//implement keyword ile interface class, normal class tarafindan
                                    //inherit edildi.
                                    //Interface class,normal CAT classi tarafindan uygulandi
                                    //interface kurallar cercevesi ifade eder
                                    //implement eden class bu kurallari uygular.
    @Override
    public String food() {
        return "Sut icer";
    }

    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
    }
}
