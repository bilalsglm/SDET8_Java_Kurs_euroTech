package Day_41_Encapsulation.ornek3;

public class Kisi {
  private String name;
  private String surName;
  private int yas=24;

//  public Kisi() {
//    System.out.println("Nesne olustu");
//  }


  public Kisi(String name) {
    this.setName(name);//this.name = name;
  }

  public int getYas() {
    return yas;
  }

  public void setYas(int yas) {
    if(yas<18)
    this.yas = Math.abs(yas);
  }


//  public void setYas(int yas) {
//    this.yas = yas;
//  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  @Override
  public String toString() {
    return "Kisi{" +
            "name='" + name + '\'' +
            ", surName='" + surName + '\'' +
            ", yas=" + yas +
            '}';
  }
}
