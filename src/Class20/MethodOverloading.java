package Class20;

public class MethodOverloading {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2, double num3) {
        System.out.println(num1 + num2 + num3);
    }


    public static void main(String[] args) {
        add(20, 20);
    }
}


