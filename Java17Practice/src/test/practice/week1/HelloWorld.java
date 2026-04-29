package test.practice.week1;

/**
 * 你的第一个Java程序！
 * 作者：Andrew
 * 日期：2026-04-29
 */
public class HelloWorld {
    public static void main(String[] args) {
        // 这是你的第一行Java代码！
        System.out.println("Hello, World!");
        System.out.println("欢迎来到Java世界！");

        // 让我们来认识几个概念
        System.out.println("\n=== 输出你的信息 ===");
        String yourName = "Andrew";  // 字符串类型
        int yourAge = 25;             // 整数类型

        System.out.println("你好，我是" + yourName);
        System.out.println("今年" + yourAge + "岁");

        // 简单的计算
        System.out.println("\n=== 简单计算 ===");
        int birthYear = 2026 - yourAge;
        System.out.println("你出生在" + birthYear + "年");

        // 循环练习
        System.out.println("\n=== 倒计时 ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("🎉 开始学习Java啦！");
    }
}
