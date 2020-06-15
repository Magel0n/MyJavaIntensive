import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


class Main {
    static char[][] map = new char[20][100];
    static int score = 0;
    static int px = 10;
    static int py = 50;
    public static void prnt() {
        System.out.println("Score: " + score);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        };
    }

    public static void inint() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 100; j++) {
                map[i][j] = (char) (r.nextInt(9) + 1 + '0');
            }
        }
        map[10][50] = 'Y';
    }

    public static void main(String[] args) {
        inint();
        Scanner sc = new Scanner(System.in);
        prnt();
        String movement = sc.nextLine();

    }
}