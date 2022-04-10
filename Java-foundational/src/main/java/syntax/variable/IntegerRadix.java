package syntax.variable;

/** 整数的4种进制表示
 * @version 2022/4/10 21:44
 */
public class IntegerRadix {
    public static void main(String[] args) {
        //bin 2进制的缩写
        int bin = 0b1001;
        // oct 8进制的缩写
        int oct = 017;
        int dec = 100;
        int hex = 0x64;
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(dec);
        System.out.println(hex);
        //结果默认十进制
        //9
        //15
        //100
        //100
    }
}
