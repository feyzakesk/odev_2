import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        double a;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            a = inp.nextDouble();
            if (a % 2 == 0) {
                if (a%4==0){
                    toplam += a;
                }
            }else
                System.out.println("Lütfen tek sayı girişi yapmayınız.");
            System.out.println("Toplam :" +toplam);
        }
        while ((a % 2 == 0));
        
    }
}