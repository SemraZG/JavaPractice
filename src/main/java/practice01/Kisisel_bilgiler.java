package practice01;

public class Kisisel_bilgiler {
    public static void main(String[] args) {
        /*
        isim, soyisim, yaş, boy ve kiko değişkenleri konsola yazdıran bir kod yazın
        İsim:...
        Soyisim:..
        Yaş...
        Boy:..
        Kilo:..
        Bir adet System.out.println(); kullanınız.--->\n
         */
        String isim="Ali";
        String soyisim="Can";
        int yaş=18;
        double boy=1.83;
        double kilo=72.3;
        System.out.println("İsim: "+isim+ "\nSoyisim: "+soyisim+ "\nYaş: "+yaş+"\nBoy: "+boy+"\nKilo: "+kilo);

        /*yas, boy ve kiloyu girintili yazdırın-->\n\t
        İsim: Ali
        Soyisim: Can
	        Yaş: 18
	        Boy: 1.83
	        Kilo: 72.3
        */
        System.out.println("İsim: "+isim+ "\nSoyisim: "+soyisim+ "\n\tYaş: "+yaş+"\n\tBoy: "+boy+"\n\tKilo: "+kilo);

    }
}
