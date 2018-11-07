import java.util.Scanner;
class SwapInteger
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("input a : ");
        int a = sc.nextInt();
        
		System.out.print("input b : ");
        int b = sc.nextInt();
        
        System.out.println("=== SWAP ===");
        System.out.println(a + " " + b);

        int t;
		t = a; a = b; b = t;
        System.out.println(a + " " + b);
	}
}
