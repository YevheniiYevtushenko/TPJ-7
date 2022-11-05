import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("2) Введіть кількість цифр: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Random r = new Random();
        int sum = 0;
        int dob = 1;
        System.out.print("Масив: ");
        for(int i = 0; i<n; i++) {
            int s = r.nextInt(10 - (-10))+(-10);
            System.out.print(s+" ");
            if(s >= 0) { sum += s; }
            else { dob *= s; }
        }
        System.out.println("\nСума додатних значень: " + sum);
        System.out.println("Добуток від'ємних значень: " + dob);
        System.out.println("3) Введіть кількість точок: ");
        n = scan.nextInt();
        int[][] xy = new int[n][2];
        int x, y, num = 1000;
        float res = 1000;
        for(int i = 0; i<n; i++) {
            System.out.print("" + (i+1) + " точка: \nx = ");
            x = scan.nextInt(); System.out.print("y = "); y = scan.nextInt();
            xy[i] = new int[]{ x, y };
            if (res > Math.sqrt(Math.pow(x,2) + Math.pow(y,2)))
            {
                res = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                num = i+1;
            }
        }
        scan.close();
        System.out.println("Номер точки, що знаходиться найближче до початку координат: " + num);
    }
}