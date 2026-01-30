import java.time.LocalDate;

public class Cereales extends Int1 implements EsAlimento {
    String tipoCereal;

    public Cereales(String marca, double precio, LocalDate caducidad, String tipoCereal) {
        super.marca = marca;
        super.precio = precio;
        super.calorias = calorias;
        super.caducidad = caducidad;
        this.tipoCereal = tipoCereal;
    }

    @Override
    public int getCalorias() {
        if (tipoCereal.equals("espelta")) {
            return 5;
        } else if (tipoCereal.equals("maiz")) {
            return 8;
        } else if (tipoCereal.equals("trigo")) {
            return 12;
        } else {
            return 15;
        }
    }

    @Override
    public String toString() {
        return "Tipo de Producto: Cereal\nTipo de Cereal: " + tipoCereal + "\nCalorias: " + calorias
                + "\n"
                + super.toString();
    }

}
