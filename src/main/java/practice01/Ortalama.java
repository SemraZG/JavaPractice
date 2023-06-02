package practice01;

import java.text.DecimalFormat;

public class Ortalama {
    public static void main(String[] args) {
        /*
        double sayı1= 23.4;
        double sayı2= 24.0;
        double sayı3= 12;
        double sayı4= 450.3;
        double sayı5= 23000;
        bu sayıların ortalamasını hesaplayan bir kod yazın
         */
        double sayı1= 23.4;
        double sayı2= 24.0;
        double sayı3= 12;
        double sayı4= 450.3;
        double sayı5= 23000;
        double toplam=sayı1+sayı2+sayı3+sayı4+sayı5;
        double ortalama=toplam/5;
        System.out.println(ortalama);//4701.9400000000005

        DecimalFormat decimalFormat=new DecimalFormat("0.00");// .dan sonra iki basamağı ver demiş olduk
        decimalFormat.format(ortalama);
        System.out.println(decimalFormat.format(ortalama));//4701.94
    }
}
