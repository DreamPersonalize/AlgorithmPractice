package javabase;

/**
 * 字符串常用方法demo
 * @author Zhang
 * @date 2020/07/07
 * @Description
 */
public class StringMathDemo {

    public static void main(String[] args) {
        String testString = "abcdefg";
        System.out.println("indexOf() 返回字符c的索引为：" + testString.indexOf("c"));
        System.out.println("charAt()  返回索引2的字符为：" + testString.charAt(2));
        System.out.println("replace() 将字符c替换为h   ：" + testString.replace("c", "h"));
        System.out.println("trim()    去除字符串两端空白：" + testString.trim());
        System.out.print("split()   分割字字符串     ：");
        String[] tss = testString.split("");
        System.out.print("[ ");
        for (String i : tss) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        System.out.println("getBytes() 返回字符串byte数组：" + testString.getBytes());
        System.out.println("length()  返回字符串长度  ：" + testString.length());
        System.out.println("toLowerCase() 字符串转小写 ：" + testString.toLowerCase());
        System.out.println("toUpperCase() 字符串转大写 ：" + testString.toUpperCase());
        System.out.println("substring()   截取bc字符串 ：" + testString.substring(1, 3));
        System.out.println("equals()    比较\"bc\"字符串 ：" + testString.equals("bc"));
    }

}
