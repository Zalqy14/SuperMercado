import java.time.LocalDate;

public class Vino extends Int2 implements Esliquido, EsAlimento {

    String tipoVino;
    int grados;

    public Vino(String marca, double precio, String envase, double volumen,
            LocalDate caducidad, String tipoVino, int grados) {
        super.marca = marca;
        super.precio = precio;
        super.calorias = calorias;
        super.caducidad = caducidad;
        super.envase = envase;
        super.volumen = volumen;
        super.calorias = grados * 10;
        this.tipoVino = tipoVino;
        this.grados = grados;

    }

    @Override
    public int getCalorias() {
        return grados * 10;
    }

    @Override
    public String toString() {
        return "Tipo de Producto: Vino\nTipo de Vino: " + tipoVino + "\n" + super.toString();
    }
}