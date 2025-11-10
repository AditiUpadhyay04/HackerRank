import java.io.*;
import java.util.*;

class Result1 {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(aliceScore);
        result.add(bobScore);

        return result;
    }

    public static int size() {
        return 0;
    }

    public static char[] get(int i) {
        return new char[0];
    }
}

public class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(Integer.parseInt(aTemp[i]));
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            b.add(Integer.parseInt(bTemp[i]));
        }

     //   List<Integer> result = Result.compareTriplets(a, b);

        for (int i = 0; i < Result1.size(); i++) {
            bufferedWriter.write(String.valueOf(Result1.get(i)));
            if (i != Result1.size() - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


