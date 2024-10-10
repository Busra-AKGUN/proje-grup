import java.util.Scanner;
public class s3_sayi_siralama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Üç basamaklı bir tam sayı giriniz: ");
        int sayi = scn.nextInt();
        if(99<sayi && sayi<1000)
        {
            int yuzler = (sayi%1000)/100;
            int onlar = (sayi%100)/10;
            int birler = sayi%10;
            int buyukSayi = 0;
            int ortaSayi = 0;
            int kucukSayi = 0;
            if(yuzler>onlar && yuzler>birler)
            {
                buyukSayi = yuzler;
                if(onlar>birler)
                {
                    ortaSayi = onlar; 
                    kucukSayi = birler;
                }
                else
                {
                    ortaSayi = birler;
                    kucukSayi = onlar;
                }
            }
            if(onlar>yuzler && onlar>birler)
            {
                buyukSayi = onlar;
                if(yuzler>birler)
                {
                    ortaSayi = yuzler; 
                    kucukSayi = birler;
                }
                else
                {
                    ortaSayi = birler;
                    kucukSayi = yuzler;
                }
            }
            if(birler>yuzler && birler>onlar)
            {
                buyukSayi = birler;
                if(yuzler>onlar)
                {
                    ortaSayi = yuzler; 
                    kucukSayi = onlar;
                }
                else
                {
                    ortaSayi = onlar;
                    kucukSayi = yuzler;
                }
            }
            System.out.println("En büyükten en küçüğe sıralama: " +buyukSayi+ " " +ortaSayi+ " " +kucukSayi);
            System.out.println("En küçükten en büyüğe sıralama: " +kucukSayi+ " " +ortaSayi+ " " +buyukSayi);
        }
        else  
        System.out.println("Üç basamaklı bir sayı girmediniz");
    }
