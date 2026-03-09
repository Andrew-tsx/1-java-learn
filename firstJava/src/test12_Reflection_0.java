/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-09 14:15
 * 项目名称: firstJava
 * 文件名称: test12_Reflection
 */

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test12_Reflection_0
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-03-09 14:15
 *
 */
public class test12_Reflection_0 {
    public static void main(String[] args) {
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
    }

    static void printClassInfo(Class cls) {
        System.out.println("==========Class info begin==========");
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
        System.out.println("==========Class info end==========");
        System.out.println();
    }
}
