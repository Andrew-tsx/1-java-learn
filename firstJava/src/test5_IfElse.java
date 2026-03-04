/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-02 08:45
 * 项目名称: firstJava
 * 文件名称: test5_ifelse
 */

import java.util.Scanner;

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test5_IfElse
 * 类描述：IfElse，浮点数边界控制
 * 创建人：@author Andrew
 * 创建时间：2026-03-02 08:45
 *
 */
public class test5_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight = 0.0f, height = 0.0f, bmi = 0.0f;
        System.out.println("enter your weight(kg): ");
        weight = scanner.nextFloat();
        System.out.println("enter your height(m): ");
        height = scanner.nextFloat();
        bmi = weight / (height * height);
        System.out.printf("your bmi is %.2f\n", bmi);
        final float P = 0.00001f;
        System.out.println("enter your bmi: ");
        bmi = scanner.nextFloat();
        boolean isUnderWeight = Math.abs(bmi - 18.5) < P;
        boolean isNormal = Math.abs(bmi - 25.0) < P;
        boolean isOverWeight = Math.abs(bmi - 28.0) < P;
        boolean isTooWeight = Math.abs(bmi - 32.0) < P;
        if ((bmi < 18.5) | isUnderWeight) {
            //bmi<=18.5
            System.out.println("过轻");
        } else if ((bmi > 18.5 && bmi < 25.0) | isNormal) {
            //18.5<bmi<=25.0
            System.out.println("正常");
        } else if ((bmi > 25.0 && bmi < 28.0) | isOverWeight) {
            //25.0<bmi<=28.0
            System.out.println("过重");
        } else if ((bmi > 28.0 && bmi < 32.0) | isTooWeight) {
            //28.0<bmi<=32.0
            System.out.println("肥胖");
        }else {
            //bmi>32.0
            System.out.println("非常肥胖");
        }
    }
}
