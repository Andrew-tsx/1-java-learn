/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-30 14:58
 * 项目名称: Java17Practice
 * 文件名称: BankMain
 */
package test.practice.week1;

/**
 * 包名称： test.practice.week1
 * 类名称：BankMain
 * 类描述：BankAccount类的启动主程序
 * 创建人：@author Andrew
 * 创建时间：2026-04-30 14:58
 *
 */
public class BankMain {
    public static void main(String[] args){
        BankAccount bk = new BankAccount("123","tsx");
        bk.showInfo();
        bk.deposit(10000);
        bk.withdraw(5000);

        BankAccount other = new BankAccount("456", "test");
        bk.transfer(other, 100);
        other.showInfo();
        other.withdraw(1000);
    }
}
