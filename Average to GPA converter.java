import java.util.*;
public class Main{
    public static void main(String[] args){
        System.out.println("How many course you had this semester");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        double[] nbcourse=new double[x];
        double sum=0;

        for(int i=0;i<nbcourse.length;i++){
            System.out.println("Enter your average for this course" +(i+1)+":");
            nbcourse[i]=sc.nextDouble();
        }
        for(int i=0;i<nbcourse.length;i++){
            sum=sum + nbcourse[i];
        }
        double average=sum/nbcourse.length;
        System.out.println("Average is"+ average);

        if(average>90){
            System.out.println("Grade is A");
        } else if(90>=average && average>=80){
            System.out.println("Grade is B");
        } else if(80>= average && average >=70){
            System.out.println("Grade is C");
        } else if(70>= average && average >60){
            System.out.println("Grade is D");
        } else if(average<60){
            System.out.println("Re appear");
        } else{
            System.out.println("Failed");
        }
    }
}