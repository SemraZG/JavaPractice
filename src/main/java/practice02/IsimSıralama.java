package practice02;

import java.util.Arrays;

public class IsimSıralama {
    public static void main(String[] args) {
        //Arraydeki isimleri sıralayın
        String names[]={"Ali", "Zeynep", "Mehmet", "Ayse"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//[Ali, Ayse, Mehmet, Zeynep]
    }
}
