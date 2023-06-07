package practice02;

import java.util.Arrays;

public class EuroDolarToplamı {
    public static void main(String[] args) {
        /*
        String str= "$1 +$ £3 £9 $10 $60";--> dolar ve euroları ayrı ayrı toplayın
         */
        String str= "$1 $7 £3 £9 $10 $60";

        String newStr[]=str.split(" ");
        System.out.println(Arrays.toString(newStr));//[$1, $7, £3, £9, $10, $60]
        int euroToplam=0;
        int dolarToplam=0;
        for (String w: newStr){
            if (w.startsWith("£")){
                int euroDeger= Integer.parseInt(w.substring(1));
                euroToplam+=euroDeger;
            }else if (w.startsWith("$")){
                int dolarDeger= Integer.parseInt(w.substring(1));
                dolarToplam+=dolarDeger;
            }
        }
        System.out.println("euroToplam = " + euroToplam);
        System.out.println("dolarToplam = " + dolarToplam);
    }
}
