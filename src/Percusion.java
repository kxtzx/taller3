/**
 * Clase que representa un instrumento de percusión.
 * Hereda de la clase Instrumento y añade los atributos "tipoPercusion", "material" y "altura".
 */
public class Percusion extends Instrumento{
    private String tipoPercusion;
    private String material;
    private String altura;

    /**
     * Constructor de la clase Percusion.
     *
     * @param id            El identificador del instrumento.
     * @param precio        El precio del instrumento.
     * @param cantidad      La cantidad disponible del instrumento.
     * @param instrumento   El nombre del instrumento.
     * @param tipoPercusion El tipo de percusión del instrumento.
     * @param material      El material del instrumento de percusión.
     * @param altura        La altura del instrumento de percusión.
     */
    public Percusion(String id, int precio, int cantidad, String instrumento,
                     String tipoPercusion, String material, String altura) {
        super(id, precio, cantidad, instrumento);
        this.tipoPercusion = tipoPercusion;
        this.material = material;
        this.altura = altura;
    }

    /**
     * Obtiene el tipo de percusión del instrumento de percusión.
     *
     * @return El tipo de percusión del instrumento.
     */
    public String getTipoPercusion() {
        return tipoPercusion;
    }

    /**
     * Establece el tipo de percusión del instrumento de percusión.
     *
     * @param tipoPercusion El tipo de percusión del instrumento.
     */
    public void setTipoPercusion(String tipoPercusion) {
        this.tipoPercusion = tipoPercusion;
    }

    /**
     * Obtiene el material del instrumento de percusión.
     *
     * @return El material del instrumento.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Establece el material del instrumento de percusión.
     *
     * @param material El material del instrumento.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Obtiene la altura del instrumento de percusión.
     *
     * @return La altura del instrumento.
     */
    public String getAltura() {
        return altura;
    }

    /**
     * Establece la altura del instrumento de percusión.
     *
     * @param altura La altura del instrumento.
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }
}
