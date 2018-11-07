import java.util.Scanner;
import java.util.Random;

class CompareBinary {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[999];

        for (int i = 0; i < array.length; i++) {
            int a = rand.nextInt(2);
            array[i] = a;
        }

        // ไม่ได้สั่งให้ปริ้น แฮร่ 
        // ปล.โจทย์ไม่ได้บอกมาอะ
        
        boolean comparez = compare(array);
        System.out.println(comparez);
    }

    public static int countZero(int[] integerArray) {
        int count = 0;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countOne(int[] integerArray) {
        int count = 1;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static boolean compare(int[] integerArray) {
        return countOne(integerArray) > countZero(integerArray);
    }
}