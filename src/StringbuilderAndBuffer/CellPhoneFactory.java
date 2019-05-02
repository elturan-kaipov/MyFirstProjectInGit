package StringbuilderAndBuffer;

import javafx.scene.control.Cell;

import java.util.ArrayList;

public class CellPhoneFactory {
    public static void main(String[] args) {
        CellPhone phone1=new CellPhone();

        phone1.brand="Apple iPhone XRS";
        String str=phone1.brand;
        System.out.println(str);
        phone1.color="Black";
        phone1.price=1200.0;
        phone1.call();
        phone1.text();


        CellPhone phone2=new CellPhone();
        CellPhone phone3=new CellPhone();

        phone2.brand="Ericson 1018";
        phone2.color="Silver";
        phone2.price=23.90;

        phone3.brand="HTC Evo";
        phone3.color="White";
        phone3.price=345.87;

        phone2.call();
        phone2.text();

        ArrayList<String> strs=new ArrayList<>();
        strs.add(phone1.brand);
        strs.add(phone2.brand);
        strs.add(phone3.brand);
        System.out.println(strs);



    }
}
