package practice01;

import java.util.Scanner;

public class Hipotenus_Method {
    public static void main(String[] args) {
         /*
        kullanıcıdan veri alarak Hipotenus hesaplayan bir method yazın--Karakök(a*a + b*b)--Math.sqrt()-->karakök alır

         */
        Scanner input=new Scanner(System.in);
        System.out.println("a kenarının uzunluğunu girin..");
        double a=input.nextDouble();
        System.out.println("b kenarının uzunluğunu girin..");
        double b=input.nextDouble();
        System.out.println("hipotenus = " + hipotenusHesapla(a, b));
    }

        public static double hipotenusHesapla(double a, double b){
        double hipotenus=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return hipotenus;
        }
}
