import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GravityShift {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        String[] forParse = br.readLine().split(" ");
        int [] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = Integer.parseInt(forParse[i]);
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                int dif = heights[j] - heights[j+1];
                if (dif > 0) {
                    heights[j] -= dif;
                    heights[j+1] += dif;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(heights[i] + " ");
        }
    }
}
