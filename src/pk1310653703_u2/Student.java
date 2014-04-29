

package pk1310653703_u2;


public class Student extends Mensch2 {
    
    int matrikelnr;
    String studiengang;
    
    public Student(String a, String b, int c, int d, String e) {
        super(a, b, c);
        matrikelnr=d;
        studiengang=e;
    }
    
    public void status(){
        System.out.println("Das ist ein "+getAlter()+" Jahre alter Student mit dem Namen "+getVorname()+" "+getNachname()+" und der Matrikelnr "
                +matrikelnr+" aus dem Studiengang "
                +studiengang);
    }
    
}
