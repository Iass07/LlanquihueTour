package model;

public class Direccion {

    private String calle;
    private int numero;
    private String ciudad;
    private String region;

    // Constructor vacío
    public Direccion() {
    }

    // Constructor con parámetros
    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    // Getters
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getRegion() {
        return region;
    }

    // Setters
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // Método toString
    @Override
    public String toString() {
        return "Dirección{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
