package Arrays.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sparse_Arrays {
    private static final Scanner scanner;

    public Sparse_Arrays() {
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] n = new int[queries.length];

        for(int i = 0; i < queries.length; ++i) {
            for(int j = 0; j < strings.length; ++j) {
                if (queries[i].equals(strings[j])) {
                    int var10002 = n[i]++;
                }
            }
        }

        return n;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/antonaleksandrov/Docs/Coding/Hackerrank_tasks/src/Arrays/Sparse_Arrays.txt"));
        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] strings = new String[stringsCount];

        int queriesCount;
        for(queriesCount = 0; queriesCount < stringsCount; ++queriesCount) {
            String stringsItem = scanner.nextLine();
            strings[queriesCount] = stringsItem;
        }

        queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] queries = new String[queriesCount];

        for(int i = 0; i < queriesCount; ++i) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        matchingStrings(strings, queries);
        int[] res = matchingStrings(strings, queries);

        for(int i = 0; i < res.length; ++i) {
            bufferedWriter.write(String.valueOf(res[i]));
            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }

    static {
        scanner = new Scanner(System.in);
    }
}