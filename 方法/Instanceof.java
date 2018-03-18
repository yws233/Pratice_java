import java.util.ArrayList;
import java.util.Vector;

/*
* instanceof 关键字用法
* */
public class Instanceof {
    public static void main(String[] args) {
        Object test = new ArrayList();
        test(test);
    }

    public static void test(Object o){
        if (o instanceof Vector)
            System.out.println("对象 java.util.Vector 类的实例");
        else if (o instanceof ArrayList)
            System.out.println("对象是 java.util.ArrayList 类的实例");
        else
            System.out.println("对象是 " + o.getClass() + " 类的实例");
    }
}

