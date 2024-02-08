package pl.codegym.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    static {
        synchronized (president = new OurPresident()) {

        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
