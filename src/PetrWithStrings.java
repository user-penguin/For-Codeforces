import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetrWithStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        String lower1 = line1.toLowerCase();
        String lower2 = line2.toLowerCase();
        int cmpr = lower1.compareTo(lower2);
        if (cmpr != 0) {
            cmpr = (int)(cmpr/Math.abs(cmpr));
        }
        System.out.println(cmpr);
    }
}
