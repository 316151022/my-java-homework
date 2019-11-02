package a;
//和电脑猜拳
import java.util.Scanner;
import java.util.Random;
public class CaiQuan {
	public static void main(String[] args){
		Scanner abc = new Scanner(System.in);
		Random rand=new Random();
		while(true) {
			System.out.println("0锤子，1剪刀，2布");
			int a = abc.nextInt();
			int r = rand.nextInt(3);
			if(a == r) {
				System.out.println("平");
			}else if((a == 0 && r == 1) || (a == 1 && r == 2) || (a == 2 && r == 0)) {
				System.out.println("你赢了 ");
			}else if((a == 0 && r == 2) || (a == 1 && r == 0) || (a == 2 && r == 1)) {
				System.out.println("你输了 ");
			}
			System.out.println(a +" "+ r +"\n\n");
		}	
	}
}


