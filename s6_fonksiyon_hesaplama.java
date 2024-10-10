import java.util.Scanner;
public class s6_fonksiyon_hesaplama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Gerçek x değeri giriniz: ");
        double x = scn.nextDouble();
        double sonuc = 0;
        if(x<=0)
        sonuc = x*x;
        if(0<x && x<10)
        sonuc = 2*x+1;
        if(x>=10)
        sonuc = x*x*x - x;
        System.out.println("f(" +x+ ")=" +sonuc);
    }
}
