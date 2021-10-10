package 每周一练.作业4;

public class Ex4_38_蔡俊凯 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
            String s1 = "1234";
            String s2 = "0.0";
            String s3 = "abcd";
            int a, b, c;
            a = Integer.parseInt(s1);
            b = (int) Double.parseDouble(s2);
            char[] chars = s3.toCharArray();
            c = 0;
            for (int i = 0; i <chars.length ; i++) {
            int c1 = (int)chars[i];
            c = c+c1;
        }try {
            c=a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
