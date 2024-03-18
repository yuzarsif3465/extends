package kalıtım;
// not: burada extends(genisletmek) aracılıgıyla ortak ozelliklere ulasabiliyoruz.
public class Ogrenci extends Kisi {
    private String sınıfı;

    public Ogrenci(){}
    public Ogrenci(String adı, String soyadı, String dogumYılı, String sınıfı){
        // super aracılıgıyla kisi class ında ki ozellikleri thisleriz. oncelik ortak ozelliklerde olmalı.
        // super yerine setAdi(adi) kullanabilirsin
        super(adı,soyadı,dogumYılı);
        this.sınıfı=sınıfı;
    }
    // unutma farklı metodlar yazabilirsin ama burda yazdıgın ortak classda da olmalı. 3 ozellikli yazmak istiyorsa 3 ozelligin oldugu bir metot yazmak gerekir.
    public Ogrenci(String adı, String soyadı, String dogumYılı){
        super(adı, soyadı, dogumYılı);
    }

    public String getSınıfı() {
        return sınıfı;
    }

    public void setSınıfı(String sınıfı) {
        this.sınıfı = sınıfı;
    }

    // to stringde ortak ozellikler icin get metodunu kullanmalıyız.
    public String toString() {
        return "Ogrenci{" +
                "sınıfı='" + sınıfı + '\'' +
                "adı: "+getAdı()+'}';
    }
}
