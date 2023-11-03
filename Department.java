package SystemDesign;

import java.awt.color.ICC_Profile;

public  abstract class Department {

    public Department()
    {
        System.out.println("Abstract class  constructor");
    }

    public void Departdetails()
    {
        System.out.println("This is Departement detatails");


    }


    public abstract  void subdetails();
}
