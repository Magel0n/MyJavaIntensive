import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("V = " + a * b * c);
        System.out.println("S = " + 2 * (a * b + a * c + b * c));
    }
}