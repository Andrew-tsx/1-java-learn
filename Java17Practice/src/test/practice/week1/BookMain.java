/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-04-29 16:31
 * 项目名称: Java17Practice
 * 文件名称: BookMain
 */
package test.practice.week1;

/**
 * 包名称： test.practice.week1
 * 类名称：BookMain
 * 类描述：Book类的启动主程序
 * 创建人：@author Andrew
 * 创建时间：2026-04-29 16:31
 *
 */
public class BookMain {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.setAll();
        book1.showInfo();

        Book book2 = new Book("希灵", "666");
        book2.setAuthor("大眼");
        book2.setPrice(11.11);
        book2.setPages(888);
        book2.showInfo();

    }
}
