/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-02-28 08:38
 * 项目名称: firstJava
 * 文件名称: test3
 */

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test3
 * 类描述：字符unicode
 * 创建人：@author Andrew
 * 创建时间：2026-02-28 08:38
 *
 */
public class test3 {
    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = s1;
//        s1 = "World";
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
        char c1 = 'A';
        int i1 = c1;
        System.out.println("c1 = " + c1);
        System.out.println("c1 Unicode = " + i1);

        int i2 = 66;
        char c2 = (char)i2;
        System.out.println("c2 = " + c2);
        System.out.println("c2 Unicode = " + i2);

        char c3 = '\u0042';
        int i3 = c3;
        System.out.println("c3 = " + c3);
        System.out.println("c2 Unicode = " + i3);
    }
}
