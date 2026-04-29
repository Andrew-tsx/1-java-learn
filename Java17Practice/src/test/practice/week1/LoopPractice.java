/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-29 14:15
 * 项目名称: Java17Practice
 * 文件名称: LoopPractice
 */
package test.practice.week1;

/**
 * 包名称： test.practice.week1
 * 类名称：LoopPractice
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-04-29 14:15
 *
 */
public class LoopPractice {
    public static void main(String[] args){
        //for循环
        System.out.println("============for循环===========");
        int sum1 = 0;
        for(int i=1;i<=10;i++){
            if(i<10){
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
            sum1+=i;
        }
        System.out.print(sum1);

        //while循环
        System.out.println("\n============while循环===========");
        int sum2 = 0, i = 0;
        while(i <= 100){
            sum2+=i;
            i++;
        }
        System.out.println("\n1+2+3+...+100 = " + sum2);

        //打印九九乘法表
        System.out.println("\n============打印九九乘法表===========");
        for(i=1;i<10;i++){
            for(int j=i;j<10;j++){
                System.out.print(i + " × " + j + " = " + i*j + "\t");
            }
            System.out.println();
        }
    }
}
