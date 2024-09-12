import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Vaibhav");
        Scanner scanner = new Scanner(System.in);

        int length = stringBuilder.length();
        System.out.println(length);
        int capacity = stringBuilder.capacity();
        System.out.println(capacity);
        stringBuilder.append("Diwan");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
      /* for (int i = 65; i < 122; i++) {
            stringBuilder.append((char)i);
            System.out.println("capacity = " + stringBuilder.capacity());
            scanner.nextLine();

        }*/
       /* char[] a = {65, 66, 67, 68, 69,70};
        char[] b = {97,98,99,100,101};

        char[] crr = new char[48];
        for (int i = 0; i < a.length; i++) {
            crr[i] = a[i];
        }
        a = crr;

        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
*/
        System.out.println(stringBuilder);
        stringBuilder.replace(0, 12, "Ramesh");
        System.out.println(stringBuilder);
    }
}
