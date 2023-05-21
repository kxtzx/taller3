import java.io.IOException;
/**
 * Interfaz que define los métodos para gestionar el sistema de inventario.
 */
public interface SistemaInventario {

    /**
     * Muestra el inventario de instrumentos.
     *
     * @throws IOException Si ocurre un error al mostrar el inventario.
     */
    public void inventario() throws IOException;

    /**
     * Lee los archivos de instrumentos.
     *
     * @throws IOException Si ocurre un error al leer los archivos.
     */
    public void leerArchivos() throws IOException;

    /**
     * Muestra el menú de opciones del sistema de inventario.
     */
    void menu();
}
