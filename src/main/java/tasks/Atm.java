package tasks;

import java.util.Scanner;

public class Atm {

        /*
        Bakiye(baslangıc bakıyesi 1000tl) ögrenme, para yatırma, cekme, cıkıs işlemlerinin yapıldığı bir atm app methodu create ediniz
         */
        public static void main(String[] args) {
            Atm atm=new Atm();
            atm.sifreGir();
            atm.start();
        }
    double bakiye=1000;
    double para;
    Scanner input=new Scanner(System.in);
    int secenek;
    String pwd="123a";
    String userPwd;

    public void sifreGir() {
        System.out.println("Sifrenizi giriniz");
        userPwd = input.nextLine();
        int countYanlısSifre = 0;

            if (userPwd.equalsIgnoreCase(pwd)){
                System.out.println("giris basarılı");
            }else {
                System.out.println("yanlıs gris tekrar deneyiniz");
                countYanlısSifre++;
            }
        if (countYanlısSifre == 3) {
            System.out.println("Hesabiniz bloke olmustur");
            cikis();
        }else{
            sifreGir();
            }

        }



    public void bakiyeOgren(){
        System.out.println("Mevcut bakiyeniz: "+bakiye);
        start();
    }

    public double paraYatirma(){
        System.out.println("yatırmak istediğiniz miiktarı giriniz");
        para=input.nextDouble();
        bakiye+=para;
        bakiyeOgren();
        start();
        return bakiye;
    }

    public double paraCek(){
        System.out.println("Cekmek istediğiniz miktatı giriniz");
        para=input.nextDouble();
        if (bakiye>=para){
            bakiye-=para;
            bakiyeOgren();
            start();
        }else{
            System.out.println("bakiyeniz yetersiz");
            paraCek();
        }
         return bakiye;
    }

    public void cikis(){
        System.out.println("bizi tercih ettiğiniz için tesekkur ederiz");
    }

    public void start(){
        System.out.println( "Para yatırmak icin     1\n"+
                            "para cekmek için       2\n"+
                            "bakiye ögrenmek için   3\n"+
                            "cıkıs için             4\n"+
                            "tuslayınız");
        secenek=input.nextInt();
        switch (secenek){
            case 1:
                paraYatirma();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                bakiyeOgren();
                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("hatalı numara tusladınız, lutfen uygun numaralardan biribi giriniz");
        }
    }


}
