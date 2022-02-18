package HelloJavaWord.Lesson10Homework;

public class WrapperClass {
    public static void main( String[] args){

        Boolean bool = new Boolean("tRue");
        boolean b= bool;
        System.out.println("tRue->"+b);

        Byte byteWrapper = new Byte("120");
        byte byt1=byteWrapper;
        System.out.println("120 ->"+byt1);

        Short shortWrapper = new Short("32000");
        short sh1=shortWrapper;
        System.out.println("32000 ->"+sh1);

        Integer intWrapper = new Integer("147895632");
        int i1=intWrapper;
        System.out.println("147895632 ->"+i1);

        Long longWrapper = new Long("987654321987654321");
        long l1=longWrapper;
        System.out.println("987654321987654321 ->"+l1);

        Double doubleWrapper= new Double("4444.5d");
        double d1=doubleWrapper;
        System.out.println("4444.5d ->"+d1);

        Float floatWrapper = new Float("2354.56f");
        float f1=floatWrapper;
        System.out.println("2354.56f ->"+f1);

    }
}
