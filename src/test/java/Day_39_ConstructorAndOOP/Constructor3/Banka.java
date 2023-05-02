package Day_39_ConstructorAndOOP.Constructor3;

public class Banka {

    String adi;
    int subeSayisi;
    int kurulusYili;
    int balance;
    String userName;

    public Banka(String adi, int subeSayisi, int kurulusYili, int balance, String userName) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
        this.balance = balance;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                ", balance=" + balance +
                ", userName='" + userName + '\'' +
                '}';
    }
}
