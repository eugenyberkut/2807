import java.util.Scanner;

/**
 * Created by Yevhen on 28.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int[] a = new int[h];
        for (int i=0; i<a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i=0; i<a.length; i++) {
            if (a[i]>=0) a[i] = a[i] + 2;
        }
        System.out.print(a[0]);
        for (int i=1; i<a.length; i++) {
            System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
