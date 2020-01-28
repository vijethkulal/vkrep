package seleniumpackage;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class MN {


    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(int l, int r) {
        return getNums(l, r, false);
    }

    private static List<Integer> getNums(int l, int r, boolean even) {
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = l; i < r; i++) {
            if (even && i % 2 == 0) {
                nums.add(i);
            } else if (!even && i % 2 == 1) {
                nums.add(i);
            }
        }

        return nums;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> res = oddNumbers(l, r);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
