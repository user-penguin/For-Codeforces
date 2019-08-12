import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitPlusPlus {
    public static int whatSign(String line) {
        char element = line.charAt(0);
        if (element != '-' && element != '+') {
            element = line.charAt(1);
        }
        if (element == '+') {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfString = Integer.parseInt(br.readLine());

        int result = 0;
        String line = "";

        for (int i = 0; i < numOfString; i++) {
            line = br.readLine();
            result += whatSign(line);
        }

        System.out.println(result);
    }
}
