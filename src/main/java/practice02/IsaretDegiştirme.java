package practice02;

import java.util.Arrays;

public class IsaretDegiştirme {
    public static void main(String[] args) {

        //Array içindeki elemanların işaretlerini değiştiren kodu yazın-->input=1,2,-3,4,-5,-6 output=-1,-2,3,-4,5,6

        int arr[]={1,2,-3,4,-5,-6};
        for (int i=0; i< arr.length; i++){
            arr[i]*=-1;
        }
        System.out.println(Arrays.toString(arr));//[-1, -2, 3, -4, 5, 6]
    }
}
