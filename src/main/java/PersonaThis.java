public class PersonaThis {
    private String nombre;
    private int edad;

    // Constructor con dos parámetros
    public PersonaThis(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor con un parámetro que llama al constructor con dos parámetros
    public PersonaThis(String nombre) {
        this(nombre, 0); // Llama al constructor con dos parámetros
    }

    // Método que establece el nombre utilizando 'this' para referenciar la variable de instancia
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método que imprime el nombre utilizando 'this'
    public void imprimirNombre() {
        System.out.println("Nombre: " + this.nombre);
    }

    // Método que muestra otra persona, usando 'this' para pasar el objeto actual
    public void mostrarPersona(PersonaThis otraPersona) {
        System.out.println("Esta persona se llama " + otraPersona.nombre);
    }

    public static void main(String[] args) {
        PersonaThis p1 = new PersonaThis("Juan", 25);
        PersonaThis p2 = new PersonaThis("Carlos");

        p1.imprimirNombre(); // Salida: Nombre: Juan
        p2.imprimirNombre(); // Salida: Nombre: Carlos

        p1.mostrarPersona(p2); // Salida: Esta persona se llama Carlos
        p2.mostrarPersona(p1); // Salida: Esta persona se llama Juan
    }
}
