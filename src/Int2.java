public class Int2 extends Int1 {
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

    @Override
    public String toString() {
        return super.toString() + "\nTipo de envase: " + envase + "\nVolumen: " + volumen;
    }
}