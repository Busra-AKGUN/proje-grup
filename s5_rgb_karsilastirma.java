import java.util.Scanner;
public class s5_rgb_karsilastirma {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kırmızı (R) değeri giriniz (0-255): ");
        int r = scn.nextInt();
        System.out.print("Yeşil (G) değeri giriniz (0-255): ");
        int g = scn.nextInt();
        System.out.print("Mavi (B) değeri giriniz (0-255): ");
        int b = scn.nextInt();
        if(0<=r && r<=255 && 0<=g && g<=255 && 0<=b && b<=255)
        {
            if(r>g && r>b)
            System.out.println("Baskın renk Kırmızıdır");
            if(g>r && g>b)
            System.out.println("Baskın renk Yeşildir");
            if(b>r && b>g)
            System.out.println("Baskın renk Mavidir");
            if(r==g && g==b && b!=255)
            System.out.println("Renkler yoğunlukta eşittir");
            if( (r==g && g!=b) || (r==b  && b!=g) || (g==b && b!=r) || (r==g && g==b) )
            System.out.println("Baskın renk yok, iki veya daha fazla renk eşit ve en yüksektir.");
        }
        else
        System.out.print("Yanlış aralıkta değer girdiniz");
    }
}
