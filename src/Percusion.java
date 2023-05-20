public class Percusion extends Instrumento{
    private String tipoPercusion;
    private String material;
    private String altura;

    public Percusion(String id, int precio, int cantidad, String instrumento,
                     String tipoPercusion, String material, String altura) {
        super(id, precio, cantidad, instrumento);
        this.tipoPercusion = tipoPercusion;
        this.material = material;
        this.altura = altura;
    }

    public String getTipoPercusion() {
        return tipoPercusion;
    }

    public void setTipoPercusion(String tipoPercusion) {
        this.tipoPercusion = tipoPercusion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
