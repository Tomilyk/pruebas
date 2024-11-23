public class Matematica {
    // Método estático
    public static int cuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        // Llamada al método estático sin crear una instancia de Matematica
        int resultado = Matematica.cuadrado(5);
        System.out.println("El cuadrado de 5 es: " + resultado);
    }
}
