import java.util.Scanner;
class BasicCalculator {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("input X : ");
        int input1 = sc.nextInt();
        System.out.print("input Y : ");
        int input2 = sc.nextInt();

        System.out.println("==============");
        System.out.println("Ans "+input1+" + "+input2+" = "+add(input1, input2));
        System.out.println("Ans "+input1+" - "+input2+" = "+subtract(input1, input2));
        System.out.println("Ans "+input1+" * "+input2+" = "+multiply(input1, input2));
        System.out.println("Ans "+input1+" / "+input2+" = "+divide(input1, input2));
        System.out.println("==============");
	}

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}