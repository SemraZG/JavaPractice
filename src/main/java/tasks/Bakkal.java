package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Bakkal {

    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *              for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *              ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *              for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *              ortalama kazançtan aşağıysa o günleri return yap.
     * */
    public static void main(String[] args) {
        Bakkal bakkal=new Bakkal();
        bakkal.gunlukKazancEkleme();
        System.out.println("0rtalama: "+bakkal.getOrtalamaKazanc());
        System.out.println("getOrtalamaninAltındaKalanKazancGünleri: = " + bakkal.getOrtalamaninAltındaKalanKazancGünleri());
        System.out.println("getOrtalamaninUstundeKazancGünleri: = " + bakkal.getOrtalamaninUstundeKazancGünleri());
    }


    String days[] = {"Pazartesi", "Salı", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};

    double gunlukKazanclar[] = new double[7];

    Scanner input = new Scanner(System.in);
    double ortalama=0;
    String [] ortalamanınUstundeKazancGunleri;
    String[] ortalamanınAltındaKalanKazancGunleri;

    public void gunlukKazancEkleme(){
        int i=1;
        while (i<8){
            System.out.println(i+". günün kazancını giriniz");
            gunlukKazanclar[i-1]=input.nextDouble();
            i++;
        }
        System.out.println(Arrays.toString(gunlukKazanclar));
    }

    public double getOrtalamaKazanc(){
        double toplam=0;

        for (double w: gunlukKazanclar){
            toplam+=w;
        }
        ortalama=toplam/gunlukKazanclar.length;
        return ortalama;
    }

    public String[] getOrtalamaninUstundeKazancGünleri(){

        int idx=0;
        for (double w: gunlukKazanclar){
            if (w>getOrtalamaKazanc()){
                String [] ortalamanınUstundeKazancGunleri=new String[7];
                ortalamanınUstundeKazancGunleri[idx]= String.valueOf(w);
                idx++;
            }
        }
        System.out.println(Arrays.toString(ortalamanınUstundeKazancGunleri));
        return ortalamanınUstundeKazancGunleri;
     }



    public String[] getOrtalamaninAltındaKalanKazancGünleri() {

        int idx = 0;
        for (double w : gunlukKazanclar) {
            if (w < getOrtalamaKazanc()) {
                String[] ortalamanınAltındaKalanKazancGunleri=new String[7];
                ortalamanınAltındaKalanKazancGunleri[idx] = String.valueOf(w);
                idx++;
            }
        }
        return ortalamanınAltındaKalanKazancGunleri;

        }

    }


