

package pk1310653703_u2;


public abstract class Saeugetiere {
    
    private String name;
    private int alter;
    private String geschlecht;
    
    public Saeugetiere (String a, int b, String c) {
        name= a;
        alter=b;
        geschlecht=c;
    }
    
    public abstract String printAll();

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
    
}

 
