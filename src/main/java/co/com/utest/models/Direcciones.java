package co.com.utest.models;

import co.com.utest.models.builder.DireccionesBuilder;

public class Direcciones {

    private String ciudad;
    private String codigoPostal;
    private String pais;

    public Direcciones(DireccionesBuilder direccionesBuilder) {
        this.ciudad = direccionesBuilder.getCiudad();
        this.codigoPostal = direccionesBuilder.getCodigoPostal();
        this.pais = direccionesBuilder.getPais();
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getPais() {
        return pais;
    }
}
