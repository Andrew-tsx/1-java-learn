/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-06 08:36
 * 项目名称: firstJava
 * 文件名称: test10_StringBuilder
 */

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test10_StringBuilder
 * 类描述：StringBuilder
 * 创建人：@author Andrew
 * 创建时间：2026-03-06 08:36
 *
 */
public class test10_StringBuilder {
    public static void main(String[] args) {
//        StringBuilder sb1 = new StringBuilder(100);
//        for(int i=0;i<100;i++){
//            sb1.append(',');
//            sb1.append(i);
//        }
//        String s1 = sb1.toString();
//        System.out.println("sb1 = ");
//        System.out.println(sb1);
//        System.out.println("s1 = ");
//        System.out.println(s1);

//        var sb2 = new StringBuilder(1024);
//        sb2.append("Mr ")
//                .append("Bob")
//                .append("!")
//                .insert(sb2.length(), "Hello, ");
//        System.out.println(sb2.toString());

//        Adder adder = new Adder();
//        adder.add(3)
//                .add(5)
//                .inc()
//                .add(10);
//        System.out.println(adder.value());

        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println("insert = ");
        System.out.println(insert);
        String s2 = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s2.equals(insert) ? "测试成功" : "测试失败");
    }
    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("INSERT INTO ")
                .append(table)

                .append(" (")
                .append(fields[0])
                .append(", ")
                .append(fields[1])
                .append(", ")
                .append(fields[2])
                .append(") VALUES (?, ?, ?)");
        return sb3.toString();
    }
}

//class Adder {
//    private int sum = 0;
//
//    public Adder add(int n) {
//        sum += n;
//        return this;
//    }
//
//    public Adder inc() {
//        sum ++;
//        return this;
//    }
//
//    public int value() {
//        return sum;
//    }
//}
