package Arrays.HackerRank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Hour_Glass {
    private static final Scanner scanner;

    public Array_Hour_Glass() {
    }

    static int hourglassSum(int[][] arr) {
        int[][] intArray = new int[][]{{-9, -9, -9, 1, 1, 1}, {0, -9, 0, 4, 3, 2}, {-9, -9, -9, 1, 2, 3}, {0, 0, 8, 6, 6, 0}, {0, 0, 0, -2, 0, 0}, {0, 0, 1, 2, 4, 0}};
        int[] sumArray = new int[16];
        int currentSum;
        int cycleID = 0;

        while(cycleID < 16) {
            for(int moveRight = 0; moveRight < 4; ++moveRight) {
                for(int moveDown = 0; moveDown < 4; ++cycleID) {
                    currentSum = 0;

                    for(int lineID = moveDown; lineID < moveDown + 3; ++lineID) {
                        for(int columnID = moveRight; columnID < moveRight + 3; ++columnID) {
                            currentSum += intArray[lineID][columnID];
                        }
                    }

                    currentSum -= intArray[moveDown + 1][moveRight] + intArray[moveDown + 1][moveRight + 2];
                    sumArray[cycleID] = currentSum;
                    ++moveDown;
                }
            }
        }

        Arrays.sort(sumArray);
        return sumArray[15];
    }

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[6][6];
        int result = hourglassSum(arr);
        System.out.println(result);
    }

    static {
        scanner = new Scanner(System.in);
    }
}
