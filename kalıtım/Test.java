package kalıtım;

public class Test {
    public static void main(String[] args) {
        Ogretmen ogeretmen1= new Ogretmen();
        ogeretmen1.setBrans("matematik");
        ogeretmen1.setAdı("ferhat");
        ogeretmen1.setDogumYılı("2001");
        ogeretmen1.setSoyadı("zorlu");

        System.out.println(ogeretmen1);

        Ogrenci ogrenci1= new Ogrenci("yusuf","zorlu","3452","23");
        // to string olmadan get aracılıgıyla da output alabiliriz.
        System.out.println(ogrenci1.getSınıfı());
        System.out.println(ogrenci1.getAdı());

        // to string olunca boyle yazman yeterli
        System.out.println(ogrenci1);

        Ogrenci ogrenci2= new Ogrenci("yusuf","zorlu","4758");
        // burada 3 lu parametreye nesne gonderdigimiz için sonradan sınıfı ekledik ayrıca
        ogrenci2.setSınıfı("12");
        System.out.println(ogrenci2);

    }
}
