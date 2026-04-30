/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-30 08:53
 * 项目名称: Java17Practice
 * 文件名称: Calculator
 */
package test.practice.week1;

/**
 * 包名称： test.practice.week1
 * 类名称：Calculator
 * 类描述：练习简易计算器
 * 创建人：@author Andrew
 * 创建时间：2026-04-30 08:53
 *
 */
public class Calculator {
    private boolean flag = false;
    public Calculator(){
        System.out.println("你新建了一个空的Calculator对象！");
    }

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        this.flag = false;
        if(b == 0){
            this.flag = true;
            return 0;
        } else{
            return a/b;
        }
    }

    public void showResult(int r){
        if(this.flag){
            System.out.println("除数不能为零！已将该变量结果重置为零，请重新输入。");
            this.flag = false;
        }else{
            System.out.println("计算结果为："+r);
        }
    }
}
