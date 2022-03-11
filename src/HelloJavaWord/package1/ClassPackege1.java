package HelloJavaWord.package1;

import java.util.ArrayList;
import java.util.List;

public class ClassPackege1 {
    public static void main(String [] args){
       // String s= "Java String Quiz";
        //System.out.println(s.charAt(s.toUpperCase().length()));
        String s1="Cat";
        String s2="Cat";
        String s3=new String("Cat");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        String x="abc";
        String y ="abc";
        x.concat(y);
        System.out.println(x);
        StringBuilder sb= new StringBuilder("0123456789");
        System.out.println(sb.delete(3,6).deleteCharAt(4).deleteCharAt(5));
        StringBuilder sb1=new StringBuilder(5+7+"Java"+4+5);
        sb.append(sb1.delete(1,4));
        System.out.println(sb1);

        List<String> list =new ArrayList<>();
        list.add("one");
        list.add("two");
        //list.add(7);
        for (String s:list)
            System.out.println(s);


    }

}
