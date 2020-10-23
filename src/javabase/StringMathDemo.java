package javabase;

/**
 * �ַ������÷���demo
 * @author Zhang
 * @date 2020/07/07
 * @Description
 */
public class StringMathDemo {

    public static void main(String[] args) {
        String testString = "abcdefg";
        System.out.println("indexOf() �����ַ�c������Ϊ��" + testString.indexOf("c"));
        System.out.println("charAt()  ��������2���ַ�Ϊ��" + testString.charAt(2));
        System.out.println("replace() ���ַ�c�滻Ϊh   ��" + testString.replace("c", "h"));
        System.out.println("trim()    ȥ���ַ������˿հף�" + testString.trim());
        System.out.print("split()   �ָ����ַ���     ��");
        String[] tss = testString.split("");
        System.out.print("[ ");
        for (String i : tss) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        System.out.println("getBytes() �����ַ���byte���飺" + testString.getBytes());
        System.out.println("length()  �����ַ�������  ��" + testString.length());
        System.out.println("toLowerCase() �ַ���תСд ��" + testString.toLowerCase());
        System.out.println("toUpperCase() �ַ���ת��д ��" + testString.toUpperCase());
        System.out.println("substring()   ��ȡbc�ַ��� ��" + testString.substring(1, 3));
        System.out.println("equals()    �Ƚ�\"bc\"�ַ��� ��" + testString.equals("bc"));
    }

}
