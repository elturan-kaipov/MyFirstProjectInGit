package staticvariables;

import org.omg.CORBA.CustomMarshal;

public class CampusRunner {
    public static void main(String[] args) {
        Campus.city="Chicago";
        Campus.aboutCampus();

        Campus c=new Campus();
        c.city="los Angeles";
        System.out.println(c.city);
        c.aboutCampus();

    }
}
