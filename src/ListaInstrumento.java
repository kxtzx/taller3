import ucn.*;
public class ListaInstrumento {
    private Instrumento[] instrumentos;
    private int cantActual;
    private  int cantMax;

    /**
     * Constructor de la clase ListaInstrumento.
     *
     * @param max La capacidad máxima de la lista de instrumentos.
     */
    public ListaInstrumento(int max) {
        this.instrumentos = new Instrumento[max];
        this.cantActual = 0;
        this.cantMax = max;
    }

    /**
     * Ingresa un instrumento a la lista.
     *
     * @param instrumento El instrumento a ingresar.
     */
    public void ingresarInstrumento(Instrumento instrumento){
        if (cantActual == cantMax){
            StdOut.println("La lista esta llena");
            return;
        }

        for (int i = 0; i < cantMax; i++) {
            if (this.instrumentos[i] == null){
                this.instrumentos[i] = instrumento;
                this.cantActual++;
                return;
            }

        }
    }

    /**
     * Obtiene el instrumento en la posición especificada.
     *
     * @param i La posición del instrumento.
     * @return El instrumento en la posición especificada.
     */
    public Instrumento instrumentoEnPosicion (int i){
        return instrumentos[i];
    }

    /**
     * Obtiene el arreglo de instrumentos.
     *
     * @return El arreglo de instrumentos.
     */
    public Instrumento[] getInstrumentos() {
        return instrumentos;
    }

    /**
     * Establece el arreglo de instrumentos.
     *
     * @param instrumentos El arreglo de instrumentos.
     */
    public void setInstrumentos(Instrumento[] instrumentos) {
        this.instrumentos = instrumentos;
    }

    /**
     * Obtiene la cantidad actual de instrumentos en la lista.
     *
     * @return La cantidad actual de instrumentos en la lista.
     */
    public int getCantActual() {
        return cantActual;
    }

    /**
     * Establece la cantidad actual de instrumentos en la lista.
     *
     * @param cantActual La cantidad actual de instrumentos en la lista.
     */
    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    /**
     * Obtiene la cantidad máxima de instrumentos permitidos en la lista.
     *
     * @return La cantidad máxima de instrumentos permitidos en la lista.
     */
    public int getCantMax() {
        return cantMax;
    }

    /**
     * Establece la cantidad máxima de instrumentos permitidos en la lista.
     *
     * @param cantMax La cantidad máxima de instrumentos permitidos en la lista.
     */
    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    /**
     * Busca un instrumento en la lista por su ID.
     *
     * @param id El ID del instrumento a buscar.
     * @return El instrumento encontrado, o null si no se encontró.
     */
    public Instrumento buscarInstrumento(String id) {
        for (int i = 0; i < cantActual; i++) {
            Instrumento instrumento = instrumentos[i];
            if (instrumento != null && instrumento.getId().equals(id)) {
                return instrumento;
            }
        }
        return null;
    }
}
