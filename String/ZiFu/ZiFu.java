
/*
* Java字符串操作练习
* */
package ZiFu;

import java.util.StringTokenizer;

public class ZiFu {

    public static void main(String[] args) {
        //字符串的比较
        String str1 = "hello world";
        String str2 = "hello";
        System.out.println(str1.compareTo(str2));

        //找出字符串最后一次出现的位置,从0开始

        String str3 = "hello world";
        int last = str3.lastIndexOf("world");
        if (last == -1){
            System.out.println("未找到");
        }else {
            System.out.println(last);
        }

        //删除字符串中的一个字符

        String str4 = "this is a beauty!";
        System.out.println(removeChar(str4, 3));
        System.out.println(str4.substring(3));

        //字符串的替换
        String str5 = "hello world";
        System.out.println(str5.replace("h","W"));
        System.out.println(str5.replaceFirst("he","We"));
        System.out.println(str5.replaceAll("he", "He"));

        //字符串的翻转

        String str6 = "hello,world";
        String reverse = new StringBuffer(str6).reverse().toString();
        System.out.println("反转前：" +str6);
        System.out.println("反转后：" +reverse);

        //字符串的查找,返回-1则代表没有找到
        String strSer = "welcometogit";
        int intIndex = strSer.indexOf("to");
        System.out.println(intIndex);

        //字符串的分割
        String str7 = "fight/inglife";
        String temp[];
        String deil = "/"; //指定分隔符
        temp = str7.split(deil); //分割字符
        for (String x : temp){
            System.out.println(x);
        }

        // StringTokennizer 设置不同分隔符来分隔字符串
        String str8 = "hello world,let's do something big";
        StringTokenizer stringTokenizer = new StringTokenizer(str8, ","); //通过逗号分割

        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }

        //字符串的大小写转换
        String str9 = "hello world";
        String up = str9.toUpperCase();
        System.out.println(up);
        System.out.println(up.toLowerCase());


        //字符串的性能比较，对象与字符串创建，对象用时远远大于字符关键词创建
        long startTime = System.currentTimeMillis();
        for (int i =0; i < 50000; i++){
            String str10 = "hello";
            String str11 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过String字符串创建用时：" + (endTime - startTime) +"毫秒");

        long startTime1 = System.currentTimeMillis();
        for (int i =0; i < 50000; i++){
            String str12 = new String("hello");
            String str13 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过String对象创建用时：" + (endTime1 - startTime1) +"毫秒");


        //连接字符串，+ 或StringBuffer append, +效率较高
        long startTime2 = System.currentTimeMillis();
        String result1 = null;
        for(int i=0;i<5000;i++){
             result1= "This is"
                    + "testing the"
                    + "difference"+ "between"
                    + "String"+ "and"+ "StringBuffer";
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(result1);
        System.out.println("字符串连接"
                + " - 使用 + 操作符 : "
                + (endTime2 - startTime2)+ " ms");
        long startTime3 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("字符串连接"
                + " - 使用 StringBuffer : "
                + (endTime3 - startTime3)+ " ms");

    }

    /*
    * 删除一个字符串
    * */
    public static String removeChar(String s, int position){
        return s.substring(0,position) + s.substring(position + 1);
    }
}
