import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringExample_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().strip();
        int num = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                num++;
            }
        }

        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(num);
        }

        br.close();
    }
}