package Ogrenci.OOP;

public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenci = new Ogrenci[]{
                new Ogrenci(null, null, 1973, 0.0, 104,"001",0,0),
                new Ogrenci("Gokhan", "Bilgisayar Muhendisligi", 1985, 0.0, 104,"001",0,0),
                new Ogrenci("Ayşe", "Makine Muhendisligi", 1985, 0.0, 104,"001",4,1),
                new Ogrenci("Elif", "Elektrik-Elektronik Muhendisligi", 2020, 1.98, 104,"001",8,2),
        };
        System.out.println("Ogrencilerin Bilgileri");
        for (int i = 0; i < ogrenci.length ; i++) {
            System.out.println("OGR-" + (i+1) + " " +ogrenci[i].getAd() + " " + ogrenci[i].getBolum() + " " + ogrenci[i].getOgrenciNo() + " " + ogrenci[i].getGano());
        }
        for (int i = 2; i < ogrenci.length; i++) {
            System.out.println((i+1) + ". Ogrencinin Odeyecegi Harc: " + ogrenci[i].harcHesapla(ogrenci[i].getDersSayisi(),ogrenci[i].getUzama()));
        }
        for (int i=0;i< ogrenci.length;i++){
            try{
                ogrenci[i].ganoKontrol(ogrenci[i].getGano());

            }catch (IllegalArgumentException e){
                System.out.println("HATA: " + (i+1) + ". Öğrencinin " +e.getMessage());
            }
        }
    }
}
