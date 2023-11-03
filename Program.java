package SystemDesign;

public class Program {

    public static  void main(String[] args)
    {
        Cse csm = new Cse();
        csm.subdetails();
        csm.Departdetails();

        Ece es = new Ece();
        es.subdetails();
        es.Departdetails();

        Department as = new Ece();
        as.Departdetails();
        as.subdetails();

        System.out.println("Method Ovreloding example");
        Sum s = new Sum();
        s.add(1,1);
        s.add(1.f,1);
        s.add(1,1,1);
        s.add(1.f,1.f);


    }
}
