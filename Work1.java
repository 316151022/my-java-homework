import java.util.Scanner; 
public class Work1 {
    public static void main(String[] args){
        System.out.println("按0计算圆面积周长\n按1摄氏度转华氏度\n按2计算球体体积\n按3分解浮点数");
        Scanner scan = new Scanner(System.in);
        int num1 = 0 , x = 0 ; Double Rr = 0.1 , Ll = 0.1, Ss = 0.1;
        num1 = scan.nextInt();
        if(num1 == 1){
            System.out.print("摄氏度 = ");
            Rr = scan.nextDouble();
            Ss =  1.8*Rr+32;
            System.out.println("华氏度 = " + Ss);
        }else if(num1 == 2){
            System.out.print("球半径 = ");
            Rr = scan.nextDouble();
            Ss =  Math.pow(Rr, 3)*4/3;
            System.out.println("球体积 = "+ Ss);
        }else if(num1 == 3){
            System.out.print("浮点数 = ");
            Rr = scan.nextDouble();  String flo = Rr.toString();
            for(String Aa : flo.split("\\.",2)){
                if(x == 0){
                    System.out.print("整数部分 = "+ Aa); x  = x + 1;
                }else{
                    System.out.println(" 小数部分 = " + Aa );
                }
            }
        }else if(num1 == 0){
            System.out.print("半径R =  ");
            Rr = scan.nextDouble();
            Ss =  Math.pow(Rr, 2) * Math.PI ; Ll = 2 * Rr * Math.PI;
            System.out.println("圆面积 = " + Ss +" 圆周长 = " + Ll);
        }
        scan.close();
    }
}