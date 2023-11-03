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

    }
}
