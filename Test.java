import java.util.Scanner; 
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double R , L , S ;
  /*
            R = sc.nextDouble();
            S =  1.8*Rr+32;
            System.out.println( "摄氏度为" + R + "的华氏度是" + Ss);
*/
    R = sc.nextDouble();
    S =  R* R * Math.PI ; L = 2 * R * Math.PI;
    System.out.println( "半径为" + R + "的圆面积 = " + S +" 圆周长 = " + L);
    sc.close();
    }
}