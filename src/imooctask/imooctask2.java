package imooctask;

/**
 * Created by zhangyidan on 16/3/30.
 */
import java.util.Scanner;
public class imooctask2 {
    public static void main(String[] args) {
        int claNum = 3;
        int stuNum = 4;
        int sum=0;
        int avg;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= claNum; i++) {
            System.out.println("***请输入第"+i+"班的成绩");
            for(int j=1;j<=stuNum;j++){
                System.out.println("请输入该班第"+j+"个同学的成绩");
                int score=input.nextInt();
                sum=sum+score;


            }
            avg=sum/4;
            sum=0;
            System.out.println("this class's average is "+avg);

        }

    }
}
