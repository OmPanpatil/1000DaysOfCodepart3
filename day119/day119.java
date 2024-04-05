import java.util.Scanner;

public class day119{
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}