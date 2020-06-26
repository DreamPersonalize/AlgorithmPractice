package swordoffer;

/**
 * 试题二 替换空格
 * 
 * @author Zhang
 * @date 2020/06/21
 * @Description 请实现一个函数，将一个字符串中的每个空格替换成"20%"。例如，当字符串为We Are Happy. 则经过替换后 的字符串为We20%Are20%Happy。
 */
public class Practise2 {

    public static void main(String[] args) {
        // 为什么使用StringBuffer？
        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(solution(str));

    }

    /**
     * 使用String自带方法的情况
     * 
     * @param str
     * @return
     */
    public static String solution(StringBuffer str) {
        // 考虑为空的情况
        if (str == null) {
            return "";
        }
        String newstr = str.toString().replaceAll(" ", "20%");
        return newstr;
    }

}
