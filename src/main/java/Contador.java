public class Contador {
    // Variable estática compartida por todas las instancias
    public static int cuentaEstatica = 0;
    // Variable de instancia única para cada objeto
    public int cuentaInstancia = 0;

    // Constructor
    public Contador() {
        cuentaEstatica++; // Incrementa la variable estática
        cuentaInstancia++; // Incrementa la variable de instancia
    }

    public static void main(String[] args) {
        // Crear tres instancias de la clase Contador
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        // Imprimir la cuenta estática y la de instancia para cada objeto
        System.out.println("Número de instancias creadas (variable estática): " + Contador.cuentaEstatica);
        System.out.println("Cuenta de c1 (variable de instancia): " + c1.cuentaInstancia);
        System.out.println("Cuenta de c2 (variable de instancia): " + c2.cuentaInstancia);
        System.out.println("Cuenta de c3 (variable de instancia): " + c3.cuentaInstancia);
    }
}
