import ucn.*;
import ucn.Registro;

public class ListaInstrumento {
    private Instrumento[] instrumentos;
    private int cantActual;
    private  int cantMax;

    public ListaInstrumento(int max) {
        this.instrumentos = new Instrumento[max];
        this.cantActual = 0;
        this.cantMax = max;
    }

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

    public Instrumento instrumentoEnPosicion (int i){
        return instrumentos[i];
    }
    public Instrumento[] getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(Instrumento[] instrumentos) {
        this.instrumentos = instrumentos;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

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
