import java.util.Scanner;

public class Main {

    static int power ( int u, int t){
        int total = 1;
        if(u == 0){
            return 1;
        }
        int result = power(u-1,t) * t;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Üs olacak sayı: ");
        int us = sc.nextInt();
        System.out.print("Taban Olacak Sayı: ");
        int taban = sc.nextInt();

        System.out.print("Cevap: " + power(us,taban));
    }
}