package syntax.variable;

/** 浮点类型变量的定义和使用
 * @version 2022/4/10 21:48
 */
public class FloatVariable {
    public static void main(String[] args) {
        float floatVal = 3.14F;
        double dbVal = 3.14;
        System.out.println(floatVal);
        System.out.println(dbVal);
        //浮点数运算有精度损失
        System.out.println(2.0-1.1);
        //3.14
        //3.14
        //0.8999999999999999
        double value = 314E-2;
        System.out.println("value"+ value);
        value = 1000.00E3;
        System.out.println("value"+ value);

    }
}
