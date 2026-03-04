/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-02-28 09:25
 * 项目名称: firstJava
 * 文件名称: ScannerTest
 */

import java.util.Scanner;

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test4_Scanner
 * 类描述：Scanner输入
 * 创建人：@author Andrew
 * 创建时间：2026-02-28 09:25
 *
 */
public class test4_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = new String[2];
        System.out.println("Print Your Name: ");
        info[0] = scanner.nextLine();
        System.out.println("Print Your Age: ");
        info[1] = scanner.nextLine();
        System.out.printf("%s is %s years old.", info[0], info[1]);
    }
}
