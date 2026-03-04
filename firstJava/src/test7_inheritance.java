/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-03-03 09:16
 * 项目名称: firstJava
 * 文件名称: test7_inheritance
 */

/**
 * 包名称： PACKAGE_NAME
 * 类名称：test7_inheritance
 * 类描述：定义PrimaryStudent，从Student继承，新增grade字段
 * 创建人：@author Andrew
 * 创建时间：2026-03-03 09:16
 *
 */
public class test7_inheritance {
    public static void main(String[] args) {
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 20, 99);
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        PrimaryStudent ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getGrade());
    }

    static class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    static class Student extends Person {
        protected int score;

        public Student(String name, int age, int score) {
            super(name, age);
            this.score = score;
        }

        public int getScore() { return score; }
    }

    static class PrimaryStudent extends Student{
        // TODO
        protected int grade;

        public PrimaryStudent(String name, int age, int score, int grade) {
            super(name, age, score);
            this.grade = grade;
        }
        public int getGrade() { return grade; }
    }
}

