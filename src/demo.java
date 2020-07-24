import java.io.FileInputStream;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
/*
* ctrl + alt + l: 格式化代码
* ctrl + alt + s: settings窗口
* ctrl + f12: 查看类的结构：类似于eclipse的outline
* shift + f6: 重构（修改变量名与方法名rename）
* alt + insert: 生成构造器/get/set/toString
* ctrl + alt + t: 生成try-catch等（surround with）
* */
public class demo {
    // prsf
    private static final int MAX_SIZE = 10;
    // psf
    public static final String str = "HITer";
    // psfi  psfs


    int age;
    String sex;
    int score;
    public static void main(String[] args) {
        System.out.print("hello Java!");
        System.out.print("hello Java!\n");
        ArrayList<String> list = new ArrayList();
        list.add("heqiang");
        list.add("hhhh");
//        FileInputStream fis = new FileInputStream(System.in);
        /**
         * 模板: sout  fori  iter  itar   list.for   list.fori
         */
        int[] grades = new int[]{100, 99,85,87,96};
//        for (int i = 0; i < grades.length; i++) {
//            System.out.println(grades[i]);
//        }

        for (int grade : grades) {
            System.out.println(grade);
        }

        for (String s : list) {
            System.out.println(s);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        // ifn
        if (grades == null) {

        }
        // inn
        if (grades != null) {

        }
    }
}

class Demo1{
    // 下面两种方法都一样，都能创建main方法
    // psvm
    public static void main(String[] args) {

    }
    // main
//    public static void main(String[] args) {
//
//    }
}