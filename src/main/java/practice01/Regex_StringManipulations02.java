package practice01;

import java.util.Scanner;

public class Regex_StringManipulations02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin
        Ardından ikinci adın ve soyadın ilk karakterlerini yazdırın Semra Zengin Gökalp-->ZG
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Adınızı, ikinci adınızı ve soyadınızı giriniz");
        String fullName=input.nextLine();
        char ikinciAd=fullName.split(" ")[1].charAt(0);
        char soyAd=fullName.split(" ")[2].charAt(0);
        System.out.println(""+ikinciAd+soyAd);//"" bunu koymazsak char ın sayısal değerini alır
        //or
        char ikinciAd2=fullName.charAt(fullName.indexOf(" ")+1);
        char soyAd2=fullName.charAt(fullName.lastIndexOf(" ")+1);
        System.out.println(""+ikinciAd2+soyAd2);

    }
}
