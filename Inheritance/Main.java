package SystemDesign.Inheritance;

public class Main {


    public  static  void main(String[] args)
    {
        Grandfather s = new Father();
        s.fun1();////We are only allowed to use what the power given by the grandfather;
        //father class method also not called by this;
        //s.fun2()//Give Error;
        Grandfather obj = new Child();
        obj.fun1();

        Father f = new Child();
        f.fun2();
        f.fun1();

        Child ch = new Child();
        ch.fun3();
        ch.fun1();
        ch.fun2();



    }



}
