package Arrays.HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Dynamic_Array {
    public Dynamic_Array() {
    }

    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0;
        List<List<Integer>> seqList = new ArrayList();
        List<Integer> result = new ArrayList();

        for(int i = 0; i < n; ++i) {
            seqList.add(i, new ArrayList());
        }

        Iterator var9 = queries.iterator();

        while(var9.hasNext()) {
            List<Integer> iterator = (List)var9.next();
            int seqId;
            if ((Integer)iterator.get(0) == 1) {
                seqId = ((Integer)iterator.get(1) ^ lastAnswer) % n;
                ((List)seqList.get(seqId)).add((Integer)iterator.get(2));
            } else if ((Integer)iterator.get(0) == 2) {
                seqId = ((Integer)iterator.get(1) ^ lastAnswer) % n;
                int index = (Integer)iterator.get(2) % ((List)seqList.get(seqId)).size();
                lastAnswer = (Integer)((List)seqList.get(seqId)).get(index);
                result.add(lastAnswer);
            } else {
                System.out.println("Incorrect request");
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/antonaleksandrov/Docs/Coding/Hackerrank_tasks/src/Arrays/Dynamic_Array.txt"));
        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        List<List<Integer>> queries = new ArrayList();
        IntStream.range(0, q).forEach((i) -> {
            try {
                queries.add((List)Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
            } catch (IOException var4) {
                throw new RuntimeException(var4);
            }
        });
        List<Integer> result = dynamicArray(n, queries);
        Stream var10001 = result.stream().map(Object::toString);
        bufferedWriter.write((String)var10001.collect(Collectors.joining("\n")) + "\n");
        bufferedReader.close();
        bufferedWriter.close();
    }
}
