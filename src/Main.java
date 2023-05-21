import ucn.*;

public class Main {
    /**
     * El punto de entrada principal para la aplicación.
     *
     * @param args Los argumentos de línea de comandos. Se pueden pasar argumentos adicionales al programa al ejecutarlo.
     */
    public static void main(String[] args) {

        SistemaInventario sistema = new SistemaImpl();

        sistema.menu();
    }
}