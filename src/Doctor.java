public class Doctor {
    int Heal;
    String Therapoid;
    String Akulist;
    String Dantist;
    String Hirurg;


    public Doctor(String therapoid, String akulist, String dantist, String hirurg, int heal) {
        Therapoid = therapoid;
        Akulist = akulist;
        Dantist = dantist;
        Hirurg = hirurg;
        Heal = heal;

    }

    public void setAkulist(String akulist, int heal) {
        Akulist = akulist;
        Heal = heal;

    }

    public void setDantist(String dantist, int heal) {
        Dantist = dantist;
        Heal = heal;
    }

    public void setHirurg(String hirurg) {
        Hirurg = hirurg;
    }

    public void setTherapoid(String therapoid) {
        Therapoid = therapoid;
    }
}
