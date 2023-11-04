package SystemDesign.StaticsKeyword;

public class OuterClass {

    private static String message = "Hellow";


    //static nested class
    public static  class StaticClass
    {
        public void print()
        {
            System.out.println("printing inside our static class");
            System.out.println(message);
        }
        public static void printme()
        {
            System.out.println("straight way");
        }
    }
    //Innner clas is not static class;

    public class Innerclas
    {
        public void printinnerclass()
        {
            System.out.println("Inner class");
            System.out.println(message);
        }
    }
}
