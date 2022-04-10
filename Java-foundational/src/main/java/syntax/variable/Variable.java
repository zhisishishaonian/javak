package syntax.variable;

/** 变量的定义和使用
 * @version 2022/4/10 21:29
 */
public class Variable {
    public static void main(String[] args) {

        //变量的定义格式 数据类型 变量名 = 变量值；
        //定义时赋值叫初始化赋值
        int age = 29 ;
        System.out.println(age);
        age = 30;
        System.out.println(age);
        //变量的声明
        int value;
        //变量的赋值
        value = 10;
        //main 方法内声明的变量叫局部变量
        //局部变量要赋值才可以使用
        //同一个作用域 变量不能重复定义
        // int = age；



    }
}
