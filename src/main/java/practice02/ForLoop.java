package practice02;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        //kullanıcıdan 5 adet sayı alın, 5 ile 10 arsındakiler hariç, diğerlerinin toplamını bulun
        Scanner input=new Scanner(System.in);
        System.out.println("5 adet sayı giriniz");
        int [] nums= new int[5];

        nums[0]=input.nextInt();
        nums[1]=input.nextInt();
        nums[2]=input.nextInt();
        nums[3]=input.nextInt();
        nums[4]=input.nextInt();
        int sum=0;
        for (int w: nums){
            if (w>=5&&w<=10){
                continue;
            }else{
                sum=sum+w;
            }
        }
        System.out.println(sum);

        //2.yol
        int toplam=0;
        for (int i = 1; i < 6; i++) {
            System.out.println(i+".  tamsayıyı giriniz");
            int sayı=input.nextInt();
            if (!(sayı>5&&sayı<10)){
                toplam=toplam+sayı;
            }else{
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında oşduğu için toplama dahil edilmeyecektir.");
                continue;
            }
        }
        System.out.println(toplam);
    }
}
