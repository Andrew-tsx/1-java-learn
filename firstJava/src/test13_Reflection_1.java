/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-09 14:37
 * 项目名称: firstJava
 * 文件名称: test13_Reflection_1
 */

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test13_Reflection_1
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-03-09 14:37
 *
 */
public class test13_Reflection_1 {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));
    }
}

class Student extends Person13 {
    public int score;
    private int grade;
}

class Person13 {
    public String name;
}
