package Arrays.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotation {
    private static final Scanner scanner;

    public Left_Rotation() {
    }

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int currentIndex;
        int newIndex;
        for(currentIndex = 0; currentIndex < n; ++currentIndex) {
            newIndex = Integer.parseInt(aItems[currentIndex]);
            a[currentIndex] = newIndex;
        }

        scanner.close();
        currentIndex = 0;
        newIndex = 0;
        int[] newA = new int[n];
        int[] var9 = a;
        int var10 = a.length;

        for(int var11 = 0; var11 < var10; ++var11) {
            int var10000 = var9[var11];
            newIndex = (currentIndex + (n - d)) % n;
            newA[newIndex] = a[currentIndex];
            ++currentIndex;
        }

        a = Arrays.copyOf(newA, n);

        for(int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}
