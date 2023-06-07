package tasks;

import java.util.Scanner;

public class PizzaMakinası {
    public static void main(String[] args) {
        /*
        1-Boyut secimi:
        Kuulanıcıya boyut seceneklerini ve ucretlerini sunun kucuk=25, orta=30, buyuk=35
        2-Hamur secimi:
        ince=5
        orta=7;
        3-Malzeme ekeleme:
        max 3 malzeme akleyebilir
        extsucuk=8 etxkasar=5 mantar=6 ilaveli halinin ucretini kullabıcı görsun
        4-Fiyat hsaplama:
        toplam fiyatı hesaplayın- bilgileri ve secimleri gösterin
         */

        PizzaMakinası pm=new PizzaMakinası();
        pm.boyutSec();
        pm.hamurTipiSec();
        pm.malzemeEkle();
        pm.odemeYap();

    }
    Scanner input = new Scanner(System.in);
    int secenek;
    int kucukBoy=25;
    int buyukBoy=30;
    int ortaBoy=35;
    int boyutFiyat;
    String pizzaBoyut;
    int inceHamurFiyat=5;
    int ortaHamurFiyat=7;
    int hamurTipiFiyat;
    String hamurTipi;
    int extraSucuk=8;
    int extraKasar=6;
    int mantar=5;
    int sayac;
    int toplamMalzemeFiyatı;
    public void boyutSec(){
        System.out.println("Lutfen pizza boyutunu seciniz."+
                        "\nKucuk boy için = 1 i tuslayınız==> 25 tl"+
                        "\nOrta boy için = 2 i tuslayınız==> 30 tl"+
                        "\nBuyuk boy için =  3 i tuslayınız==> 35 tl");
        secenek=input.nextInt();
        switch (secenek){
            case 1:
                boyutFiyat=kucukBoy;
                pizzaBoyut="Kucuk Boy";
                break;
            case 2:
                boyutFiyat=ortaBoy;
                pizzaBoyut="Orta Boy";
                break;
            case 3:
                boyutFiyat=buyukBoy;
                pizzaBoyut="Buyuk Boy";
                break;
            default:
                System.out.println("Gecerli bir tuslama yapınız");
                boyutSec();
        }
        System.out.println("Seciminiz==>"+pizzaBoyut+"="+boyutFiyat);
    }

    public void hamurTipiSec(){
        System.out.println("Lutfen hamur tipini seciniz."+
                "\nInce hamur için = 1 i tuslayınız==> 5 tl"+
                "\nOrta kalınlıkta hamur için = 2 i tuslayınız==> 7 tl");
        secenek=input.nextInt();
        if (secenek==1){
            hamurTipi="Ince Hamur";
            hamurTipiFiyat=inceHamurFiyat;
        }else if (secenek==2){
            hamurTipi="Orta Hamur";
            hamurTipiFiyat=inceHamurFiyat;
        }else{
            System.out.println("Gecerli bir tuslama yapınız");
           hamurTipiSec();
        }
        System.out.println("Seciminiz==> "+hamurTipi+"="+hamurTipiFiyat);
    }

    public void malzemeEkle(){
        System.out.println("Malzeme listesi:"+
                "\nExtra Sucuk için = 1 i tuslayınız==> 8 tl"+
                "\nExtra Kasar için = 2 i tuslayınız==> 6 tl"+
                "\nMantar için =  3 i tuslayınız==> 5 tl"+
                "\nSiparisi tamamlamak için = 4 i tuslayınız.");

        do {
            System.out.println("Seciminizi yapınız");
           secenek= input.nextInt();
           switch (secenek){
               case 1:
                   toplamMalzemeFiyatı+=extraSucuk;
                   sayac++;
                   break;
               case 2:
                   toplamMalzemeFiyatı+=extraKasar;
                   sayac++;
                   break;
               case 3:
                   toplamMalzemeFiyatı+=mantar;
                   sayac++;
                   break;
               case 4:
                   sayac=3;
                   break;
               default:
                   System.out.println("Gecerli bir tuslama yapınız");
           }
        }while (sayac<3);
        System.out.println("Eklenen malzeme toplam fiyatı==>"+toplamMalzemeFiyatı);
    }

    public void odemeYap(){
        System.out.println("Toplam odenecek tutar: "+(boyutFiyat+hamurTipiFiyat+toplamMalzemeFiyatı));
        System.out.println("Onaylıyorsanız==>1\n"+
                "Cıkıs için==>0\n giriniz");
        secenek=input.nextInt();
        switch (secenek){
            case 1:
                System.out.println("Odemenız tammalandı, Afiyet olsun");
                cıkıs();
                break;
            case 0:
                cıkıs();
                break;
            default:
                System.out.println("Hatalı tuslama yaptınız");
                break;
        }
    }

    public void cıkıs(){
        System.out.println("Bizi tercih ettiğiniz için tesekkur edriz.");
    }


}
