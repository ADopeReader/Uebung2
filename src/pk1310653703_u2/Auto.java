
package pk1310653703_u2;


public class Auto implements Comparable <Auto> {
    
    private String name;
    private int türen;
    private int ps;
    private Farbe color;
    
    
    public Auto(String a, int b, int c){
        name=a;
        türen=b;
        ps=c;
        color=Farbe.BLACK ;
        
    }
    public Auto(String a, int b, int c , Farbe d){
        name=a;
        türen=b;
        ps=c;
        color=d;
        
    }
    
    @Override
    public int compareTo(Auto a){
        if (this.ps>a.ps)
            return 1;
        if (this.ps==a.ps)
            return 0;
        else
            return -1;
    }
    
    public String getColor() {
        return color.toString();
    }
    
    public void setColor(Farbe s){
        color=s;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTüren() {
        return türen;
    }

    public void setTüren(int türen) {
        this.türen = türen;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
    
    
    
    
}

enum color {RED, SILVER, BLACK, BLUE, WHITE;}
