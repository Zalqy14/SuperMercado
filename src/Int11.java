public class Int11 {
    String marca;
    double precio;
    double descuento;
    String envase;
    double volumen;

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecioDescuento() {
        return (precio - (precio * descuento));
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

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

    @Override
    public String toString() {
        return "Tipo de Producto: Detergente\n" +
                "Marca: " + marca + "\n" +
                "Precio: " + (precio - (precio * descuento)) + "$\n" +
                "Envase: " + envase + "\n" +
                "Volumen: " + volumen + "L\n" +
                "Descuento: " + (descuento * 100) + "%";
    }
}
