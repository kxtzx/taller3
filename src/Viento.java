public class Viento extends Instrumento{
    private String material;

    public Viento(String id, int precio, int cantidad, String instrumento, String material) {
        super(id, precio, cantidad, instrumento);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
