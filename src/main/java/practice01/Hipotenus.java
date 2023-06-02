package practice01;

import java.text.DecimalFormat;

public class Hipotenus {
    public static void main(String[] args) {
        /*
        Hipotenus hesaplayan kodu yazın--Karakök(a*a + b*b)--Math.sqrt()-->karakök alır
         */
        double a=8;
        double b=5;

        double hipotenus=Math.sqrt(a*a + b*b);
        System.out.println(hipotenus);//9.433981132056603
        DecimalFormat decimalFormat=new DecimalFormat("0.0");
        System.out.println(decimalFormat.format(hipotenus));//9.4

        //2.yol
        double hipotenus2=Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));//Math.pow(a,x)== a'yı x kere a ile çarp demek
        System.out.println(hipotenus2);//9.433981132056603


    }
}
