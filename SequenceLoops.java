import java.util.Scanner;
class SequenceLoops {

    public static void main(String[] args) {
       
        int i = 1;
        for (; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("=======");

        i = 1; 
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("=======");

        printRecursive(10);
    }

    public static void printRecursive(int i) {
        if(i == 1) 
            System.out.println(i);
        else 
            printRecursive(i - 1);
        System.out.println(i);
    }
}