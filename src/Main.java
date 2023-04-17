public class Main {
    public static void main(String[] args) {
        test6();
        test7();
        test8();

    }

    public static void test6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result * -1);
    }

    public static void test7() {
        int a = 5;
        int b = 7;
        a = 5 * 7;
        b = a / 7;
        a = a / b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void test8() {
        int a = 749;
        int b = a / 10;
        b = b % 10;
        System.out.println(b);
    }
}
