package swordoffer;

/**
 * ����� �滻�ո�
 * 
 * @author Zhang
 * @date 2020/06/21
 * @Description ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻��"20%"�����磬���ַ���ΪWe Are Happy. �򾭹��滻�� ���ַ���ΪWe20%Are20%Happy��
 */
public class Practise2 {

    public static void main(String[] args) {
        // Ϊʲôʹ��StringBuffer��
        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(solution(str));

    }

    /**
     * ʹ��String�Դ����������
     * 
     * @param str
     * @return
     */
    public static String solution(StringBuffer str) {
        // ����Ϊ�յ����
        if (str == null) {
            return "";
        }
        String newstr = str.toString().replaceAll(" ", "20%");
        return newstr;
    }

}
