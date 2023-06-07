package practice02;

import java.util.Scanner;

public class NedtedForCarpımTablosu {
    public static void main(String[] args) {
        /*
        2 boyutlu tablo olarak çarpım tablosu yapan kody ayzınız
         1 2 3
         2 4 6
         3 6 9
         ...    cıktı 3x3 boyutların agöre verilmiştir
         */
        Scanner input=new Scanner(System.in);
        System.out.println( "Carpım tablosu boyutunu tamsayı olarak giriniz");
        int boyut=input.nextInt();
        for (int i=1; i<=boyut; i++){
            for (int k =1; k<=boyut; k++){
                System.out.print(k*i+"\t");
            }
            System.out.println();
        }
    }
}
