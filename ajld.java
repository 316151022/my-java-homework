package ajilid;
//辗转相除法求最大公因数
import java.util.Scanner;

public class ajld {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		int b = sca.nextInt();
		if (a < b) {
			int c = a;
			a = b;
			b = c;
		}
		for (int c = 1; c != 0; b = c) {
			c = a % b;
			a = b;
		}
		System.out.println(a);
		sca.close();
	}
}
