package syntax.conversion;

/** 类   型转换的常量优化机制
 * @version 2022/4/11 18:10
 */
public class TypeConversionConstanOptimize {
    public static void main(String[] args) {
        //1. 如果byte ，short，char 类型的变量在赋值的时候，
        //赋值是一个常量，例如100，那么我们的JVM自动将常量转换为对应的数据类型
        byte byteVar = 100;
        System.out.println("byteVar = " +byteVar);

        char charVar = 97;
        System.out.println("charVar" + charVar);
        //2.如果运算符操作的是字面量常量，先进行运算操作，再将结果赋值后进行编译操作
        byte byteResult = 3+4;
        System.out.println(byteResult);
    }
}
