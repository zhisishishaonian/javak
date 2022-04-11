package syntax.conversion;

/** 强制类型转换
 * @version 2022/4/11 17:27
 */
public class NarrowConbersion {
    public static void main(String[] args) {
        //取值范围比较小的数据类型 变量名 = （取值范围较大的数据类型） 取值范围比较大的数据类型的数值；
            double salary = 10000.0;
        System.out.println("salary="+salary);
            int intSalary = (int) salary;
        System.out.println("强制转换的值 intSalary = "+intSalary);
    }
}
