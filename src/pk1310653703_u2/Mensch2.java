/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pk1310653703_u2;


public class Mensch2 {
    
    private static String vorname;
    private static String nachname;
    private static int alter;
    
    
    public Mensch2 (String a, String b, int c) {
        
        vorname=a;
        nachname=b;
        alter=c;
    }
    
    public void status(){
        
        System.out.println("Das ist ein "+alter+" Jahre alter Mensch mit dem Namen "+vorname+" "+nachname);
    }

    public static String getVorname() {
        return vorname;
    }

    public static void setVorname(String vorname) {
        Mensch2.vorname = vorname;
    }

    public static String getNachname() {
        return nachname;
    }

    public static void setNachname(String nachname) {
        Mensch2.nachname = nachname;
    }

    public static int getAlter() {
        return alter;
    }

    public static void setAlter(int alter) {
        Mensch2.alter = alter;
    }

    
    
}
