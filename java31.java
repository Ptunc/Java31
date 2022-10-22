package java31;

import java.util.Scanner;

public class java31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, ebob=0, i=1;
        System.out.print("a sayısı: ");
        a = input.nextInt();
        System.out.print("b sayısı: ");
        b = input.nextInt();

        int sonuc = a > b ? a : b;
        while(i<=sonuc){
            if(a%i == 0 && b%i == 0) ebob = i;
            i++;
        }
        System.out.println("ebob: " + ebob);
        System.out.println("ekok: " + (a*b)/ebob);
    }
}
