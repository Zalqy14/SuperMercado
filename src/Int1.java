import java.time.LocalDate;

public class Int1 {

    // Agrupador para las clases con alimentos

    String marca;
    double precio;
    int calorias;
    LocalDate caducidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "Tipo de Marca: " + marca + "\nPrecio: " + precio + "$\nFecha de Caducidad: "
                + caducidad;
    }

}