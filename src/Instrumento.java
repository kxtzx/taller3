public abstract class Instrumento {
    private String id;
    private int precio;
    private int cantidad;
    private String instrumento;

    public Instrumento(String id, int precio, int cantidad, String instrumento) {
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
