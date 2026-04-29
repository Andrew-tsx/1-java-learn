/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-29 11:18
 * 项目名称: Java17Practice
 * 文件名称: VariablePractice
 */
package test.practice.week1;

/**
 * 包名称： test.practice.week1
 * 类名称：VariablePractice
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-04-29 11:18
 *
 */
public class VariablePractice {
    public static void main(String[] args){
        int age = 20;
        long population = 1400000000L;  // 注意L后缀

        // 小数类型
        double price = 99.99;
        float interestRate = 0.035f;    // 注意f后缀

        // 字符和字符串
        char grade = 'A';
        String name = "张三";

        // 布尔类型
        boolean isStudent = true;

        // 输出
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("是否是学生：" + isStudent);
    }
}
