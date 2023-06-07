package practice02;

public class ETicaret {
    public static void main(String[] args) {
        //bir kullanıcının sepetindeki ürünlerde belirlli ürün olup olmadığını kontrol eden kodu yazın-->klavye var mı
        String [] urunler= {"telefon", "bilgisayar", "klavye", "mouse"};
        String arananUrun="klavye";
        for (String w: urunler){
           if (w.equalsIgnoreCase(arananUrun)){
               System.out.println(arananUrun+" sepette var");
               break;
           }
        }
    }
}
