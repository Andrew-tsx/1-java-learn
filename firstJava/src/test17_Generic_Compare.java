/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-10 14:37
 * 项目名称: firstJava
 * 文件名称: test17_Generic_Compare
 */

import java.util.Arrays;

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test17_Generic_Compare
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-03-10 14:37
 *
 */
public class test17_Generic_Compare {
    public static void main(String[] args) {
        Person17[] ps = new Person17[] {
                new Person17("Bob", 61),
                new Person17("Alice", 88),
                new Person17("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}


class Person17 implements Comparable<Person17> {
    String name;
    int score;
    Person17(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Person17 other) {
//        return this.name.compareTo(other.name);
//        return this.score.compareTo(other.score);
        return Integer.compare(this.score, other.score);
    }
    public String toString() {
        return this.name + "," + this.score;
    }
}