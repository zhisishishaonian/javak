package syntax.variable;

/**
 * 整数变量定义和使用
 * @version 2022/4/10 21:37
 */
public class IntegerVariable {
    public static void main(String[] args) {
        byte byteVal = 100;
        short shortVal = 100;
        int intVal = 100;
        long longVal = 100000000000L;
        //可以在数值使用下划线隔开,不影响数据类型结果
        //long longVal = 1000_0000_0000L;
        double dblVal = 3.1415_926;
        System.out.println(dblVal);
        System.out.println(byteVal);
        System.out.println(shortVal);
        System.out.println(intVal);
        System.out.println(longVal);

    }
}
