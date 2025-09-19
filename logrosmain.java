package Constructores;

public class logrosmain {
    public static void main(String[] args) {
        Logros Logro1 = new Logros(5, "Reinel", "Levantarse temprano", "2 puesto");
        Logros Logro2 = new Logros(5, "Reinel", "Levantarse temprano");
        Logros Logro3 = new Logros(5, "Reinel");
        Logros Logro4 = new Logros(5);

        Logro1.Mostrarinformacion();
        Logro2.Mostrarinformacion();
        Logro3.Mostrarinformacion();
        Logro4.Mostrarinformacion();
    }
}