public class Multiples {
    public static int (int n, int a, int b) {
        int i = 1;
        int count = 0;
        while (i < n {
            count += doMultiples(i);
            i++;
        }

        return count
    }

    public static int doMultiples(int i) {

        if (i % a == 0 || i % b == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}