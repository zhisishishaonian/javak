package syntax.variable;

import com.sun.org.apache.bcel.internal.generic.NEW;

/** 字符型变量的定义和使用
 * @version 2022/4/10 22:06
 */
public class CharacterVariab {
    public static void main(String[] args) {
        // 定义使用''（单引号）
        char ch = 'a';
        System.out.println(ch);
        //小写字符a 对应的Unicode编码值就是97
        //大写A 65
        //0 48
        ch = 97;
        System.out.println(ch);
        char zero = '\u0030';
        System.out.println(zero);
        char chinese = '陆';
        System.out.println(chinese);
        //转义字符
        char newLine = '\n';
        System.out.println("HELLO"+newLine+"WORLD");
        //路径转义
        char path='\\';
        System.out.println(path);
        //System.out.println(path);
        // 结果为  \
    }
}
