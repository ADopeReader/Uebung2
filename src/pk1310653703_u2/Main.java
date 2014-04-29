package pk1310653703_u2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main { 
        
    public static void main(String[] args) {
        
        Mensch ernst = new Mensch("Ernst", 20, "n");
            System.out.println(ernst.printAll());

        Mensch2 me = new Mensch2("Domi", "Seifert", 21);
            me.status();

        me = new Student("Domi", "Seifert", 21, 1310653703, "Web");
            me.status();
        
        
        
        List<Auto> autoliste= new ArrayList<>();
            
            Auto audi1 = new Auto("audi1", 4, 123, Farbe.BLUE);
            Auto audi2 = new Auto("audi2", 2, 76, Farbe.RED);
            Auto audi3 = new Auto("audi3", 2, 189, Farbe.SILVER);
            Auto bmw1 = new Auto("m1", 2, 340, Farbe.WHITE);
            Auto bmw2 = new Auto("m3", 2, 430);
        
            autoliste.add(audi1);
            autoliste.add(audi2);
            autoliste.add(audi3);
            autoliste.add(bmw1);
            autoliste.add(bmw2);
        
       for(Auto x: autoliste)
            System.out.println(x.getName());
        
       Collections.sort(autoliste);
        
       for(Auto x: autoliste)
            System.out.println(x.getName()+" in "+x.getColor());
        
    }

}
