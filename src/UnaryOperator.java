public class UnaryOperator {
    public static void main(String[] args) {
        System.out.println("Watching increment");
        int a = 4;
        System.out.println("PreIncrenment "+(++a));
        System.out.println(a);
        System.out.println("PreDecrement "+(--a));
        System.out.println(a);

        int b =9;
        System.out.println("PostIncrement "+(b++));
        System.out.println(b);
        System.out.println("PostDecrement "+(b--));
        System.out.println(b);

    }
}
