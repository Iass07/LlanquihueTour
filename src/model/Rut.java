package model;

import exceptions.RutInvalidoException;

public class Rut {

    private String numero;
    private char digitoVerificador;

    // Constructor vacío
    public Rut() {
    }

    // Constructor con validación
    public Rut(String numero, char digitoVerificador) throws RutInvalidoException {

        if (!validarNumero(numero)) {
            throw new RutInvalidoException("El número de RUT no es válido.");
        }

        this.numero = numero;
        this.digitoVerificador = digitoVerificador;
    }


    // Validar que el RUT tenga solo números y entre 7 y 8 dígitos
    private boolean validarNumero(String numero) {

        if (numero == null) {
            return false;
        }

        if (!numero.matches("\\d+")) {
            return false;
        }

        return numero.length() >= 7 && numero.length() <= 8;
    }


    // Getters
    public String getNumero() {
        return numero;
    }


    public char getDigitoVerificador() {
        return digitoVerificador;
    }


    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }


    public void setDigitoVerificador(char digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }


    public String getRutCompleto() {
        return numero + "-" + digitoVerificador;
    }


    @Override
    public String toString() {
        return getRutCompleto();
    }
}