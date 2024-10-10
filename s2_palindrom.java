import java.util.Scanner;
public class s2_palindrom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Beş basamaklı bir sayı giriniz: ");
        int sayi = scn.nextInt();
        if(9999<sayi && sayi<100000)
        {
            String sayi2 = String.valueOf(sayi); //valueOf(): Diğer değişken türlerini String türüne çeviriyor.
            if( sayi2.charAt(0) == sayi2.charAt(4) )
            {
                if( sayi2.charAt(1) == sayi2.charAt(3) )
                System.out.print("Palindrom sayıdır");
                else 
                System.out.print("Palindrom sayı değildir");
            }
            else 
            System.out.print("Palindrom sayı değildir");
        }
        else  
        System.out.println("Beş basamaklı bir sayı girmediniz");
    }

    
}
