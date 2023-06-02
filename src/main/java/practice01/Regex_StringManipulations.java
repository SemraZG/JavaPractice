package practice01;

import java.util.Locale;
import java.util.Scanner;

public class Regex_StringManipulations {
    public static void main(String[] args) {
        /*
        Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı iki ayrı kelimeye ayırınız
        ali can or ALİ CAN ==>  Ad: Ali
                                Soyad: Can
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Full name giriniz");
        String fullName=input.nextLine();
        String ad=fullName.split(" ")[0];
        String Soyad=fullName.split(" ")[1];
        System.out.println("Ad: " + ad.substring(0,1).toUpperCase()+ ad.substring(1)+
                "\nSoyad: "+ Soyad.substring(0,1).toUpperCase()+ad.substring(1));

    }
}
