// Program for calculating area of polygoan.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input no of sides:");
        int ns=sc.nextInt();
        System.out.print("Input length of sides:");
        double s=sc.nextDouble();

        double ans = (ns * (s * s)) / (4.0 * Math.tan((Math.PI / ns)));
        System.out.println("The area of polygoan: "+ans);
    }
}

