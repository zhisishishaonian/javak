package syntax.conversion;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**7种基本数据类型的自动转换
 * 第一个自动类型转换的规则 bute < short < int < long < float < double
 * 第二个自动类型转换的规则 char < int < long < float < double
 * @version 2022/4/11 16:56
 */
public class AutoConversion {
    public static void main(String[] args) {

        //小数赋值默认 为双精度（double）
        //整数赋值默认 为整型  （ int ）



        //获取float类型的 最大值给变量fltMax
        float fltMax = Float.MAX_VALUE;
        System.out.println("fltMax"+fltMax);
        System.out.printf("单精度表示的最大值%.2f\n",fltMax);

        //获取long 的最大值
        long longMax = Long.MAX_VALUE;
        System.out.println("long的最大值 = "+longMax);
        //long 自动转换 float
        long longVar = 100L;
        System.out.println("longVar = "+longVar);
        float fltVar;
        fltVar = longVar;
        System.out.println("fltVar = "+fltVar);

        //char 的 表示范围
        char charMin = Character.MIN_VALUE;
        char charMax = Character.MAX_VALUE;
        System.out.println("charMin = "+(int)charMin);
        System.out.println("charMax = "+(int)charMax);
        //char自动转换为int
        int intVar;
        intVar = charMax;
        System.out.println("intVar="+intVar);


//        short和char不能进行自动类型转换
//        short shortVar = 100;
//        charMax = shortVar;
//        java: 不兼容的类型: 从short转换到char可能会有损失

    }
}
