package kalıtım;
// kalıtımda ogrenecegimiz şey claslarda lortak olan ozellikleri baska bir classta tanımlamak.
public class Kisi {
    private String adı;
    private String soyadı;
    private String dogumYılı;

    public Kisi(){}
    public Kisi(String adı, String soyadı, String dogumYılı){
        this.adı=adı;
        this.soyadı= soyadı;
        this.dogumYılı= dogumYılı;
    }
    public String getAdı(){
        return adı;
    }
    public void setAdı(String adı) {
        this.adı = adı;
    }
    public String getSoyadı(){
        return soyadı;
    }
    public void setSoyadı(String soyadı) {
        this.soyadı = soyadı;
    }
    public void setDogumYılı(String dogumYılı) {
        this.dogumYılı = dogumYılı;
    }
    public String getDogumYılı() {
        return dogumYılı;
    }

    public String toString() {
        return "Kisi{" +
                "adı='" + adı + '\'' +
                ", soyadı='" + soyadı + '\'' +
                ", dogumYılı='" + dogumYılı + '\'' +
                '}';
    }
}
