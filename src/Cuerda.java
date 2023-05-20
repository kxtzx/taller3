public class Cuerda extends Instrumento{
    private String instrumento;
    private String tipoCuerda;
    private int cantCuerdas;
    private String material;

    private String tipo;

    public Cuerda(String id, int precio, int cantidad, String instrumento,
                  String instrumento1, int cantCuerdas, String material, String tipo) {
        super(id, precio, cantidad, instrumento);
        this.instrumento = instrumento1;
        this.tipoCuerda = tipoCuerda;
        this.cantCuerdas = cantCuerdas;
        this.material = material;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getTipoCuerda() {
        return tipoCuerda;
    }

    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }

    public int getCantCuerdas() {
        return cantCuerdas;
    }

    public void setCantCuerdas(int cantCuerdas) {
        this.cantCuerdas = cantCuerdas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
