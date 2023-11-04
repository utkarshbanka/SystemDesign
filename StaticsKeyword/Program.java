package SystemDesign.StaticsKeyword;

public class Program {



    public static  void main(String[] args)
    {

        OuterClass as = new OuterClass();


        OuterClass.StaticClass staticClass = new OuterClass.StaticClass();

        staticClass.print();
        OuterClass.StaticClass.printme();

        OuterClass.Innerclas inner =  as.new Innerclas();
        inner.printinnerclass();

        OuterClass.Innerclas aaa = new OuterClass().new Innerclas();

    }
}
