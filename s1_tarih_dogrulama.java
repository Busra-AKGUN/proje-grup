import java.util.Scanner;
public class s1_tarih_dogrulama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Gün giriniz: ");
        int gun = scn.nextInt();
        System.out.print("Ay giriniz: ");
        int ay = scn.nextInt();
        System.out.print("Yıl giriniz: ");
        int yil = scn.nextInt();
        int maxGun = 0;
        int artikYil = 0;
        if(1<=ay && ay<=12)
        {
            if(ay==1 || ay==3 || ay==5 || ay==7 || ay==8 || ay==10 || ay==12)
            {
                maxGun = 31; 
                if(gun<=maxGun) System.out.println("Geçerli bir tarih girdiniz");
                else System.out.println("Geçersiz gün girişi");
            }
            else if(ay==4 || ay==6 || ay==9 || ay==11)
            {
                maxGun = 30;
                if(gun<=maxGun) System.out.println("Geçerli bir tarih girdiniz");
                else System.out.println("Geçersiz gün girişi");
            }
            else if(ay==2)
            {
                if((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0)
                artikYil = 1;
                if(artikYil==1)
                {
                    maxGun = 29;
                    if(gun<=maxGun) System.out.println("Geçerli bir tarih girdiniz");
                    else System.out.println("Geçersiz gün girişi");
                }
                else
                {
                    maxGun = 28;
                    if(gun<=maxGun) System.out.println("Geçerli bir tarih girdiniz");
                    else System.out.println("Geçersiz gün girişi");
                }
            }
        }
        else
        System.out.println("Geçersiz ay girişi");
    }
}
