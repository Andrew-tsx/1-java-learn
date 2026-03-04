/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-02-27 15:36
 * 项目名称: firstJava
 * 文件名称: test2
 */

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test2
 * 类描述：一元二次方程
 * 创建人：@author Andrew
 * 创建时间：2026-02-27 15:36
 *
 */
public class test2 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = -2.0;
        double c = 1.0;
        double r1 = 0, r2 = 0, delta = 0;
        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0){
            System.out.println("no result !");
        } else if (delta == 0) {
            r1 = (-1.0 * b)/(2.0 * a);
            r2 = r1;
            System.out.println("r1 = r2 = "+ r1);
        } else {
            r1 = (- 1.0 * b + Math.sqrt(delta))/(2.0 * a);
            r2 = (- 1.0 * b - Math.sqrt(delta))/(2.0 * a);
            System.out.println("r1 = "+ r1);
            System.out.println("r2 = "+ r2);
        }
    }
}
