import java.util.Scanner;

class notmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n == 4) || (n == 5) || (n == 13) || (n == 14) || (n == 22) || (n == 23) || (n == 31) || (n == 33) ||
                (n == 40) || (n == 41) || (n == 49) || (n == 50) || (n == 58) || (n == 59) || (n == 67) || (n == 68) ||
                (n == 76) || (n == 77) || (n == 85) || (n == 86) || (n == 94) || (n == 95)) {
            System.out.println("Невозможно");
        } else {
            System.out.println("Найдено");
        }
    }
}
