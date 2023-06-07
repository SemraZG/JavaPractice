package practice02;

import java.util.Arrays;

public class OturmaPlanı {
    public static void main(String[] args) {
        /*
        10 kişilik masa bosken bos sandalyeler null olrak görünürken Reserve değil olarak değiştirin nulları
         */
        String [] oturmaPlanı=new String[10];
        System.out.println(Arrays.toString(oturmaPlanı));//[null, null, null, null, null, null, null, null, null, null]
        String yeniDeger="Reserce değil";
        Arrays.fill(oturmaPlanı, yeniDeger);
        System.out.println(Arrays.toString(oturmaPlanı));//[Reserce değil, Reserce değil, Reserce değil, Reserce değil, Reserce değil, Reserce değil, Reserce değil, Reserce değil, Reserce değil, Reserce değil]
    }
}
