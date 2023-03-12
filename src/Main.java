import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, kalan;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        number = input.nextInt();
        kalan = number % 2;
        if (kalan ==1){
            System.out.println(number +" Sayısı Asal Sayıdır");
        }else{
            System.out.println(number +" Sayısı Asal Sayı Değildir !!");
        }

    }
}