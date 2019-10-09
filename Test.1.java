import java.util.Scanner; 
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double R , zhouchang , mianji ;
  /*
            System.out.println( "请输入摄氏度：");
            R = sc.nextDouble();
            S =  1.8*Rr+32;
            System.out.println( "摄氏度为" + R + "的华氏度是" + Ss);
*/
    System.out.println( "请输人半径 " );
    R = sc.nextDouble();
    mianji =  R* R * Math.PI ; zhouchang = 2 * R * Math.PI;
    System.out.println( "半径为" + R + "的圆面积为 " + mianji +" 圆周长为 " + zhouchang);
    sc.close();
    }
}