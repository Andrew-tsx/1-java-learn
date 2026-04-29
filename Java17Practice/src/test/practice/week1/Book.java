/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-29 15:23
 * 项目名称: Java17Practice
 * 文件名称: Book
 */
package test.practice.week1;

import java.util.Scanner;

/**
 * 包名称： test.practice.week1
 * 类名称：Book
 * 类描述：练习创建Book类
 * 创建人：@author Andrew
 * 创建时间：2026-04-29 15:23
 *
 */
public class Book {
    private String name;
    private String isbn;
    private String author;
    private double price = 0;
    private int pages = 0;

    public Book(String name, String isbn){
        this.name = name;
        this.isbn = isbn;
    }

    public Book(){
        System.out.println("你创建了一个空的book对象，请及时赋值！");
    }

    void showInfo(){
        System.out.println("书名: " + this.name);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("作者: " + this.author);
        System.out.println("价格: " + this.price);
        System.out.println("页数: " + this.pages);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setPrice(double price){
        if(price <= 0){
            System.out.println("价格必须大于零！");
            return;
        }
        this.price = price;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPages(int pages){
        if(pages <= 0){
            System.out.println("页数必须大于零！");
            return;
        }
        this.pages = pages;
    }

    public void setAll(){
        System.out.println("==============开始录入书本信息==============");
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============请输入书名==============");
        String name = scanner.next();
        setName(name);
        System.out.println("==============请输入ISBN==============");
        String isbn = scanner.next();
        setIsbn(isbn);
        System.out.println("==============请输入价格，必须大于零==============");
        double price = scanner.nextDouble();
        setPrice(price);
        System.out.println("==============请输入作者==============");
        String author = scanner.next();
        setAuthor(author);
        System.out.println("==============请输入页数，必须大于零==============");
        int pages = scanner.nextInt();
        setPages(pages);
        System.out.println("==============录入完成！==============");
        scanner.close();
    }
}
