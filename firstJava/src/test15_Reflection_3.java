/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-09 15:21
 * 项目名称: firstJava
 * 文件名称: test15_Reflection_3
 */

import java.lang.reflect.Method;

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test15_Reflection_3
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-03-09 15:21
 *
 */
public class test15_Reflection_3 {
    public static void main(String[] args) throws Exception {
        Person15 p = new Person15();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p, "Bob");
        System.out.println(p.name);
    }
}

class Person15 {
    public String name;
    private void setName(String name) {
        this.name = name;
    }
}
