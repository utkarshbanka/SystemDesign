package SystemDesign;

public class Sum {

//This is Example of MethodOverloding or static polymorphis
    public int add(int num1, int num2)
    {
        return  num1+num2;
    }

    public int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }

    public int add(float num1, float num2)
    {
        return (int)(num1+num2);
    }




}
