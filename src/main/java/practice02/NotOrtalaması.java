package practice02;

import java.text.DecimalFormat;

public class NotOrtalaması {
    public static void main(String[] args) {
        //not ortalamasını hesaplayan kodu yazın
        int notlar[]={84,91,75,85,98};
        int sum=0;
        for (int w: notlar){
            sum+=w;
        }
        double ortalama=(double) sum/ notlar.length;
        System.out.println(ortalama);
    }
}
