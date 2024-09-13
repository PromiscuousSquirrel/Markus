public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;
        while (i >= 0) {
            boolean even = i % 2 == 0;


            if (i == 0) {
                System.out.println(count);
                break;
            }
            else if (even) {
                i = i / 2;
                count++;
            }
            else {
                i = i - 1;
                count++;
            }
        }
    }
}
