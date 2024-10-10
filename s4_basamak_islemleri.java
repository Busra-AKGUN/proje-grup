import java.util.Scanner;
public class s4_basamak_islemleri {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Dört basamaklı bir tam sayı giriniz: ");
        int sayi = scn.nextInt();
        if(999<sayi && sayi<10000)
        {
            int binler = (sayi%10000)/1000;
            int yuzler = (sayi%1000)/100;
            int onlar = (sayi%100)/10;
            int birler = sayi%10;
            int toplam = binler+yuzler+onlar+birler;
            System.out.println("Basanakların toplamı: " +toplam);
            int carpim = binler*yuzler*onlar*birler;
            System.out.println("Basanakların çarpımı: " +carpim);
            if(toplam==carpim)
            System.out.println("Toplam ve çarpım eşittir");
            else if(toplam>carpim)
            System.out.println("Toplam çarpımdan daha büyüktür");
            else if(toplam<carpim)
            System.out.println("Çarpım toplamdan daha büyüktür");
        }
        else  
        System.out.println("Dört basamaklı bir sayı girmediniz");
    }
}
