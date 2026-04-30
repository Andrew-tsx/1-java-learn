/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-30 10:57
 * 项目名称: Java17Practice
 * 文件名称: CalMain
 */
package test.practice.week1;

/**
 * 包名称： test.practice.week1
 * 类名称：CalMain
 * 类描述：Calculator类的启动主程序
 * 创建人：@author Andrew
 * 创建时间：2026-04-30 10:57
 *
 */
public class CalMain {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        int r1 = cal.add(3,4);
        cal.showResult(r1);

        int r2 = cal.sub(5,10);
        cal.showResult(r2);

        int r3 = cal.multiply(4,5);
        cal.showResult(r3);

        int r4 = cal.divide(10,3);
        cal.showResult(r4);

        int r5 = cal.divide(1,5);
        cal.showResult(r5);

        int r6 = cal.divide(5,0);
        cal.showResult(r6);

    }
}
