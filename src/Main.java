import java.util.Arrays;

public class Main {
    public static int[] calculateTask(int[] m) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] % 2 == 0) {
                m[i] += 1;
            }
        }
        int[] m2 = Arrays.copyOfRange(m,2, 6);
        return m2;
    }
    public static void main(String[] args) {
        int[] massive = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(calculateTask(massive)));
    }
}