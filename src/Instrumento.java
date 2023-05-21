/**
 * Clase que representa una lista de instrumentos.
 * Permite almacenar y gestionar una colección de instrumentos.
 */
public abstract class Instrumento {
    private String id;
    private int precio;
    private int cantidad;
    private String instrumento;
    /**
     * Constructor de la clase Instrumento.
     *
     * @param id         El ID del instrumento.
     * @param precio     El precio del instrumento.
     * @param cantidad   La cantidad disponible del instrumento.
     * @param instrumento El nombre del instrumento.
     */
    public Instrumento(String id, int precio, int cantidad, String instrumento) {
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.instrumento = instrumento;
    }

    /**
     * Obtiene el nombre del instrumento.
     *
     * @return El nombre del instrumento.
     */
    public String getInstrumento() {
        return instrumento;
    }

    /**
     * Establece el nombre del instrumento.
     *
     * @param instrumento El nombre del instrumento.
     */
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    /**
     * Obtiene el ID del instrumento.
     *
     * @return El ID del instrumento.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del instrumento.
     *
     * @param id El ID del instrumento.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el precio del instrumento.
     *
     * @return El precio del instrumento.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del instrumento.
     *
     * @param precio El precio del instrumento.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad disponible del instrumento.
     *
     * @return La cantidad disponible del instrumento.
     */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * Establece la cantidad disponible del instrumento.
     *
     * @param cantidad La cantidad disponible del instrumento.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
