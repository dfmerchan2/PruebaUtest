package co.com.utest.models.builder;

import co.com.utest.models.Direcciones;
import co.com.utest.utils.Builder;

public class DireccionesBuilder implements Builder<Direcciones> {

    private String ciudad;
    private String codigoPostal;
    private String pais;

    public static DireccionesBuilder direcciones(){
        return new DireccionesBuilder();
    }

    public DireccionesBuilder conCiudad(String ciudad){
        this.ciudad = ciudad;
        return this;
    }

    public DireccionesBuilder conCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
        return this;
    }

    public DireccionesBuilder conPais(String pais){
        this.pais = pais;
        return this;
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

    @Override
    public Direcciones builder() {
        return new Direcciones(this);
    }
}
