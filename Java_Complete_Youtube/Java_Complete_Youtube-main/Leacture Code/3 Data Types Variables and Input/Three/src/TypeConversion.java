public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5;
        int num=4;
        double num2 = num;  //typecasting implicit
        System.out.println(myFloat);

        int myInt = (int) 5.45f;    //TYPECASTING EXPLICIT
        System.out.println(myInt);
    }
}
