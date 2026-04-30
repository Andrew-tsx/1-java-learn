/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-30 14:57
 * 项目名称: Java17Practice
 * 文件名称: BankAccount
 */
package test.practice.week1;

/**
 * 包名称： test.practice.week1
 * 类名称：BankAccount
 * 类描述：银行账户类
 * 创建人：@author Andrew
 * 创建时间：2026-04-30 14:57
 *
 */
public class BankAccount {
    private String account;
    private String name;
    private double balance = 0;

    public BankAccount(String account, String name){
        this.account = account;
        this.name = name;
        System.out.println("已成功创建账户。");
    }

    public void showInfo(){
        System.out.println("账户名: "+ this.account);
        System.out.println("户主: "+this.name);
        System.out.println("余额: "+this.balance+" 元");
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccount(){
        return this.account;
    }

    public String getName(){
        return this.name;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("存款金额必须大于零！");
            return;
        }else{
            this.balance = this.balance + amount;
            System.out.println("成功存款 " + amount + " 元。");
            System.out.println("当前余额为 " + this.balance + " 元");
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("取款金额必须大于零！");
            return;
        } else if (this.balance < amount) {
            System.out.println("当前余额不足，无法取款 " + amount + " 元，余额为 " + this.balance + " 元。");
            return;
        }else {
            this.balance = this.balance - amount;
            System.out.println("成功取款 " + amount + " 元。");
            System.out.println("当前余额为 " + this.balance + " 元");
        }
    }
    //转账给别人
    public void transfer(BankAccount other, double amount){
        if(amount <= 0){
            System.out.println("转账金额必须大于零！");
            return;
        }else if(this.balance < amount){
            System.out.println("当前余额不足，无法转账 " + amount + " 元，余额为 " + this.balance + " 元。");
            return;
        }else {
            this.balance = this.balance - amount;
            other.balance = other.balance + amount;
            System.out.println("成功转账 " + amount + " 元。");
            System.out.println("当前余额为 " + this.balance + " 元");
        }
    }
}
