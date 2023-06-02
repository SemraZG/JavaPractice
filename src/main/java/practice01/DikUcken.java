package practice01;

import java.util.Scanner;

public class DikUcken {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 3 adet sayı alın ve dik üçgenin uzunlukları olup olmadığını hesaplayan kodu yazın
        a^2+b^2=c^2-->diküçgen formulü
         */
        Scanner input=new Scanner(System.in);
        System.out.println("3 sayı giriniz");
        double sayı1=input.nextDouble();
        double sayı2=input.nextDouble();
        double sayı3=input.nextDouble();
        dikUcgenMi(sayı1,sayı2,sayı3);
    }
    public static void dikUcgenMi(double a, double b, double c){
        if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
            System.out.println("Dik Ucgen");
        }else{
            System.out.println("Dik Ucgen değil");
        }
    }
}
