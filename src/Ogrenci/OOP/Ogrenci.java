package Ogrenci.OOP;
public class Ogrenci {

    private String ad;
    private String bolum;
    private String ogrenciNo;
    private int girisYili;
    private double gano;
    private int bolumKodu;
    private String girisSirasi;
    private int dersSayisi;
    private int uzatilanYil;

    public Ogrenci(String ad, String bolum, int girisYili, double gano, int bolumKodu,String girisSirasi, int dersSayisi, int uzatilanYil) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.ogrenciNo = ogrenciNoBul(girisYili,bolumKodu,girisSirasi);
        this.girisSirasi=girisSirasi;
        this.dersSayisi = dersSayisi;
        this.uzatilanYil = uzatilanYil;

    }
    public Ogrenci(String ad, String bolum,String girisSirasi) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano=0.0;
        this.girisYili=0;
        this.bolumKodu=0;
        this.girisSirasi=girisSirasi;

    }
    public String getGirisSirasi() {
        return girisSirasi;
    }
    public void setGirisSirasi(String girisSirasi) {
        this.girisSirasi = girisSirasi;
    }

    public int getDersSayisi() {return dersSayisi;}

    public void setDersSayisi(int dersSayisi) {dersSayisi = dersSayisi;}

    public int getUzama() {return uzatilanYil;}

    public void setUzama(int uzama) {uzatilanYil = uzatilanYil;}

    public String getAd() {
        return ad;
    }

    public String getBolum() {
        return bolum;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public double getGano() {
        return gano;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }
    public void ganoKontrol(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Ganosu 0 ile 4 arasında olmalı!");
        }
    }

    public String ogrenciNoBul(int girisYili, int bolumKodu,String girisSirasi){
        return  "" +girisYili + bolumKodu+girisSirasi ;
    }

    public double harcHesapla(int dersSayisi, int uzatilanYil){
        double harc = (dersSayisi*100) + (uzatilanYil*80);
        return harc;
    }

    public double harcHesaplama(int dersSayisi){
        double harc = dersSayisi*100;
        return harc;
    }
}
