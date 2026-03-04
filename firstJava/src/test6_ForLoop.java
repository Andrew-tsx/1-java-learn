/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-02 10:55
 * 项目名称: firstJava
 * 文件名称: test6_ForLoop
 */

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test6_ForLoop
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-03-02 10:55
 *
 */
public class test6_ForLoop {
    public static void main(String[] args) {
        final int NUM = 100;
        int[] denominator = new int[NUM];
        double[] a = new double[NUM];
        for(int i=0;i<NUM;i++){
            denominator[i] = i*2+1;
//            System.out.printf("denominator[%d] = %d\n",i,denominator[i]);
        }
        for(int i=0;i<NUM;i++){
            if(i%2 == 0) {
                a[i] = 1.0 / denominator[i];
            }
            else {
                a[i] = -1.0 / denominator[i];
            }
//            System.out.printf("a[%d] = %.4f\n", i,a[i]);
        }
        double sum = 0.0;
        final double aQuarterOfPI = 3.14 / 4.0;
        for(int i=0;i<NUM;i++) {
            System.out.printf("denominator[%d] = %d, a[%d] = %.4f\n",i,denominator[i],i,a[i]);
            sum = sum + a[i];
        }
        System.out.println("sum = "+sum);
        System.out.println("aQuarterOfPI = "+aQuarterOfPI);
    }
}
