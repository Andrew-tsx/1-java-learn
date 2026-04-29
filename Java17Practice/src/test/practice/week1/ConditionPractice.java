/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-29 13:59
 * 项目名称: Java17Practice
 * 文件名称: ConditionPractice
 */
package test.practice.week1;

import java.util.Scanner;

/**
 * 包名称： test.practice.week1
 * 类名称：ConditionPractice
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-04-29 13:59
 *
 */
public class ConditionPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的成绩: ");
        int score = scanner.nextInt();

        if(score >= 90){
            System.out.println("优秀！");
        } else if (score >= 80) {
            System.out.println("良好！");
        } else if (score >= 60) {
            System.out.println("及格！");
        } else {
            System.out.println("继续努力！");
        }

        scanner.close();
    }
}
