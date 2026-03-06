/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-05 15:42
 * 项目名称: firstJava
 * 文件名称: test9_String
 */

import java.util.Arrays;

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test9_String
 * 类描述：Sting类型测试
 * 创建人：@author Andrew
 * 创建时间：2026-03-05 15:42
 *
 */
public class test9_String {
    public static void main(String[] args) {
//        String s1 = "hello";
//        System.out.println(s1);
//        String s2 = s1;
//        s1 = s1.toUpperCase();
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);

//        String[] arr = {"A", "B", "C"};
//        System.out.println(arr);
//        String s3 = String.join("xxx", arr);
//        System.out.println(s3);

//        String s4 = "Hi %s, your score is %d!";
//        System.out.println(s4.formatted("Alice", 80));
//        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));

        int[] scores = new int[] { 88, 77, 51, 66 };
//        String s5 = Arrays.toString(scores);
//        System.out.println(s5);
//        System.out.println(s5.charAt(0));
//        System.out.println(scores[0]);
        Score s6 = new Score(scores);
        System.out.println("before change:");
        s6.printScores();
        scores[2] = 99;
        System.out.println("after change:");
        s6.printScores();
        System.out.println("scores[] is:");
        for(int i=0;i<scores.length;i++){
            System.out.printf("%d, ", scores[i]);
        }
    }
}

class Score {
    private int[] scores;
//    public Score(int[] scores) {
//        this.scores = scores;
//    }
    public Score(int[] scores) {
        int[] tmp = new int[scores.length];
        for(int i=0;i<scores.length;i++){
            tmp[i] = scores[i];
        }
        this.scores = tmp;
    }
    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
