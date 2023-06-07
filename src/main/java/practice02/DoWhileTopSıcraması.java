package practice02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DoWhileTopSıcraması {
    public static void main(String[] args) {
        /*
        Kuualınıcıdan topun atılacağı yuksekliği al,
        atıldıktan sonra yukseklığının 3/4 kadar yerden zıplamaktadır,
        top zıplama yukseklıgı 1 mtnın altına inince durmaktadır
        bu ama kadar aldığı toplam yolu ve yere vurma sayısını bulan kodu yazınız
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Yukseklık giriniz");
        double yukseklik=input.nextDouble();
        double toplamYol=0;
        int vurmaSayısı=0;

        do {
            vurmaSayısı++;
            toplamYol+=yukseklik;
            yukseklik*=0.75;
            toplamYol+=yukseklik;
        } while (yukseklik>1);
        toplamYol+=yukseklik;
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println(toplamYol);
        System.out.println(vurmaSayısı);

    }
}
