package practice01;

import java.util.Scanner;

public class StringManipulations_IfElse {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği Stringin son üç karakterini alarak bunları stringin başına ve sonuna ekleyen kodu yazınız
         */
        Scanner input=new Scanner(System.in);
        System.out.println("en az üç karakterli string giriniz");
        String str=input.next();
        if (str.length()>2){
            str=str.substring(str.length()-3)+str+str.substring(str.length()-3);
            System.out.println(str);
        }else{
            System.out.println("lutfen en az 3 karakterli bir string giriniz");
        }
    }
}
