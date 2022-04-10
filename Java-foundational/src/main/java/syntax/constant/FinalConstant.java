package syntax.constant;

/**
 * final 常量
 * @version 2022/4/10 22:24
 */
public class FinalConstant {
    public static void main(String[] args) {
        final int number=10;
        //定义无法修改
        //常量可以使用八个基本类型
        System.out.println(number);
        //常量无法修改
        //number = 100;
        //java: 无法为最终变量number分配值
    }
}

