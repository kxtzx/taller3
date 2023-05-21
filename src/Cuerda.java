/**
 * Clase que representa un instrumento de cuerda.
 * Hereda de la clase Instrumento y añade los atributos "instrumento", "tipoCuerda", "cantCuerdas", "material" y "tipo".
 */
public class Cuerda extends Instrumento{
    private String instrumento;
    private String tipoCuerda;
    private int cantCuerdas;
    private String material;

    private String tipo;

    /**
     * Constructor de la clase Cuerda.
     *
     * @param id          El identificador del instrumento.
     * @param precio      El precio del instrumento.
     * @param cantidad    La cantidad disponible del instrumento.
     * @param instrumento El nombre del instrumento.
     * @param instrumento1 El nombre específico del instrumento de cuerda.
     * @param cantCuerdas La cantidad de cuerdas del instrumento de cuerda.
     * @param material    El material del instrumento de cuerda.
     * @param tipo        El tipo de cuerda del instrumento de cuerda.
     */
    public Cuerda(String id, int precio, int cantidad, String instrumento,
                  String instrumento1, int cantCuerdas, String material, String tipo) {
        super(id, precio, cantidad, instrumento);
        this.instrumento = instrumento1;
        this.tipoCuerda = tipoCuerda;
        this.cantCuerdas = cantCuerdas;
        this.material = material;
        this.tipo = tipo;
    }

    /**
     * Obtiene el tipo del instrumento de cuerda.
     *
     * @return El tipo del instrumento.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del instrumento de cuerda.
     *
     * @param tipo El tipo del instrumento.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el nombre específico del instrumento de cuerda.
     *
     * @return El nombre específico del instrumento de cuerda.
     */
    public String getInstrumento() {
        return instrumento;
    }

    /**
     * Establece el nombre específico del instrumento de cuerda.
     *
     * @param instrumento El nombre específico del instrumento de cuerda.
     */
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    /**
     * Obtiene el tipo de cuerda del instrumento de cuerda.
     *
     * @return El tipo de cuerda del instrumento de cuerda.
     */
    public String getTipoCuerda() {
        return tipoCuerda;
    }

    /**
     * Establece el tipo de cuerda del instrumento de cuerda.
     *
     * @param tipoCuerda El tipo de cuerda del instrumento de cuerda.
     */
    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }

    /**
     * Obtiene la cantidad de cuerdas del instrumento de cuerda.
     *
     * @return La cantidad de cuerdas del instrumento de cuerda.
     */
    public int getCantCuerdas() {
        return cantCuerdas;
    }

    /**
     * Establece la cantidad de cuerdas del instrumento de cuerda.
     *
     * @param cantCuerdas La cantidad de cuerdas del instrumento de cuerda.
     */
    public void setCantCuerdas(int cantCuerdas) {
        this.cantCuerdas = cantCuerdas;
    }

    /**
     * Obtiene el material del instrumento de cuerda.
     *
     * @return El material del instrumento de cuerda.
     */
    public String getMaterial() {
        return material;
    }


    /**
     * Establece el material del instrumento de cuerda.
     *
     * @param material El material del instrumento de cuerda.
     */
    public void setMaterial(String material) {
        this.material = material;
    }
}
