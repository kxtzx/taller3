/**
 * Clase que representa un instrumento de viento.
 * Hereda de la clase Instrumento y añade el atributo "material".
 */
public class Viento extends Instrumento{
    private String material;

    /**
     * Constructor de la clase Viento.
     *
     * @param id          El identificador del instrumento.
     * @param precio      El precio del instrumento.
     * @param cantidad    La cantidad disponible del instrumento.
     * @param instrumento El nombre del instrumento.
     * @param material    El material del instrumento de viento.
     */
    public Viento(String id, int precio, int cantidad, String instrumento, String material) {
        super(id, precio, cantidad, instrumento);
        this.material = material;
    }

    /**
     * Obtiene el material del instrumento de viento.
     *
     * @return El material del instrumento.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Establece el material del instrumento de viento.
     *
     * @param material El material del instrumento.
     */
    public void setMaterial(String material) {
        this.material = material;
    }
}
