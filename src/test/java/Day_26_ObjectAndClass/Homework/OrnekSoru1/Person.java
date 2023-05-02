package Day_26_ObjectAndClass.Homework.OrnekSoru1;
public class Person {
    String name;
    String surname;
    int age;
    int id;
public void getBirthYear()
{
    int simdikiYil=2023;
    int simdikiYasi=age;
    System.out.println(name+" Dogum yili : "+(simdikiYil-simdikiYasi));
}
 public void getVerifyId(){
//    int sonBasamak = id%10;
//    int ilkBasamak= id/100000;
     int num=id;
     int sonBasamak = num%10 ;
     int ilkBasamak =0;
     while (num>=10) {
         num = num / 10;
         ilkBasamak = num;
     }
     if(ilkBasamak==sonBasamak){
         System.out.println(name+"\'nin" + " Id numarasi ilk ve son basamaklari birbirine esittir.");
     }else {
         System.out.println(name+ "\'nin" +" Id numarasi ilk ve son basamaklari birbirine esit degildir.");
     }
}
public void kisiBilgileri(){

    System.out.println("Adi : "+name+"\nSoyadi : "+surname+"\nYasi: "+age+"\nId NO :"+id);
}

}
