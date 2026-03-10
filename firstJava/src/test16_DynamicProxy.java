/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-10 10:50
 * 项目名称: firstJava
 * 文件名称: test16_DynamicProxy
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test16_DynamicProxy
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-03-10 10:50
 *
 */
public class test16_DynamicProxy {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(), // 传入ClassLoader
                new Class[] { Hello.class }, // 传入要实现的接口
                handler); // 传入处理调用方法的InvocationHandler
        hello.morning("Bob");
    }
}

interface Hello {
    void morning(String name);
}

