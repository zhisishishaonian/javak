package syntax.conversion;

/**
 * 类型转换注意事项
 * @version 2022/4/11 17:40
 */
public class TypeConversionWaming {
    public static void main(String[] args) {
        //  1. boolean 不能和其他七种数据类型进行类型转换
        boolean booleanVar = true;
        byte byteVar = 100;
//        byteVar = booleanVar;
//        java: 不兼容的类型: boolean无法转换为byte

        //  2.1强制类型转换，数据可能会损失精度
        double salary = 100000.88;
        System.out.println("salary"+salary);
        int intSalary = (int)salary;
        System.out.println("intSalary = " + intSalary);
//        salary100000.88
//        intSalary = 100000
        //可以发现小数位0.88已经没了
        //2.2无损伤精度情况
        byte byteLeft = 10;
        byte byteRight = 20;
        byte byteResult = (byte)(byteLeft+byteRight);
        System.out.println("byteResult = "+ byteResult);



        // 3.强制类型转换，数据可能会溢出
        // byte -128 -  +127
        byteVar = (byte) 128;
        System.out.println("byteVar = " + byteVar);
        //byteVar = -128  +127 + 1 = 128  -128 涉及到一个补码的机制

        //129 = 127+2
        //byteVar = -127
        byteVar = (byte) 129;
        System.out.println("byteVar = " + byteVar);
        //129 = 127+2
        //byteVar = -127

        //4. byte short char 3个类型在进行+运算的时候首先提升为int类型 在参与运算

        short shortLeft = 100;
        short shortRight = 100;
        //short shortResult = shortLeft+shortRight;
        // shortLeft+shortRight; 已经提升为int 结果也为int，short 无法接收
        int intResult = shortLeft+shortRight;
        System.out.println("intResult = "+ intResult);

    }
}
