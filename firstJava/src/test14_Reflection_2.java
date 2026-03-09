/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-09 14:40
 * 项目名称: firstJava
 * 文件名称: test14_Reflection_2
 */

import java.lang.reflect.Field;

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test14_Reflection_2
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-03-09 14:40
 *
 */
public class test14_Reflection_2 {
    public static void main(String[] args) throws Exception {
        Person14 p = new Person14("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value); // "Xiao Ming"
        System.out.println("Class c is: " + c);
        System.out.println("Filed f is: " + f);
//        f.set(value, "HHH");
        f.set(p, "hhh");
        p.getName();
    }
}

class Person14 {
    private String name;

    public Person14(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
    }
}
