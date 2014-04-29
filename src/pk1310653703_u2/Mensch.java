package pk1310653703_u2;

/**
 *
 * @author Domi
 */
public class Mensch extends Saeugetiere {

    public Mensch(String a, int b, String c) {
        super(a, b, c);
    }

    @Override
    public String printAll() {
        return getName() + "#" + getAlter() + "#" + getGeschlecht();
    }
}