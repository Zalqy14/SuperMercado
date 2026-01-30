
public class Detergente extends Int11 implements Descuento, Esliquido {

    public Detergente(String marca, double precio, String envase, double volumen) {
        super.marca = marca;
        super.precio = precio;
        super.envase = envase;
        super.volumen = volumen;
    }

}
