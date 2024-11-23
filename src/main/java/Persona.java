public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}

class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = persona1; // persona2 referencia al mismo objeto que persona1

        persona1.saludar(); // Salida: Hola, mi nombre es Juan
        persona2.nombre = "Carlos";
        persona1.saludar(); // Salida: Hola, mi nombre es Carlos

        persona1 = null; // persona1 ya no referencia al objeto
        persona2.saludar(); // Salida: Hola, mi nombre es Carlos

        // Esto causaría un NullPointerException:
        // persona1.saludar();
    }
}
