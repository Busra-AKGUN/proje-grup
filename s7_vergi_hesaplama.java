import java.util.Scanner;
public class s7_vergi_hesaplama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        System.out.print("Yıllık gelirinizi giriniz: ");
        double gelir = scn.nextDouble();
        System.out.print("Medeni durumunuzu giriniz: ");
        String medeniHal = scn2.nextLine();
        double odeme = 0;
        double vergi = 0;
        if(medeniHal.compareTo("evli") == 0)
        {
            odeme = gelir-1000;
            System.out.print("Aile reisi misiniz? : ");
            String aileReisi = scn2.nextLine();
            if(aileReisi.compareTo("evet") == 0)
            odeme = gelir-1000; //üstten ilk 1000 çıkarıldı
        }
        
        if(gelir <= 0)
        {
            System.out.println("Hatalı");
            return;
        }

        if(gelir<=10000)
        {
            System.out.println("Yıllık gelir: " +gelir+ "$");
            System.out.println("Medeni durum: " +medeniHal);
            System.out.println("Hesaplanan vergi: " +vergi+ "$");
        }
        if(10000<gelir && gelir<=30000)
        {
            System.out.println("Yıllık gelir: " +odeme+ "$");
            System.out.println("Medeni durum: " +medeniHal);
            vergi = gelir*10.0/100.0;
            System.out.println("Hesaplanan vergi: " +vergi+ "$");
        }
        if(30000<gelir && gelir<=70000)
        {
            System.out.println("Yıllık gelir: " +odeme+ "$");
            System.out.println("Medeni durum: " +medeniHal);
            vergi = 2000 + (gelir*20.0/100.0);
            System.out.println("Hesaplanan vergi: " +vergi+ "$");
        }
        if(70000<gelir)
        {
            System.out.println("Yıllık gelir: " +odeme+ "$");
            System.out.println("Medeni durum: " +medeniHal);
            vergi = 10000 + (gelir*30.0/100.0);
            System.out.println("Hesaplanan vergi: " +vergi+ "$");
        }
        
    }
}
