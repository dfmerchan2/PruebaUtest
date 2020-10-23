package co.com.utest.models;

import co.com.utest.models.builder.PersonalBuilder;

public class Personal {

    private String nombre;
    private String apellido;
    private String correo;
    private String fecha;

    public Personal(PersonalBuilder personalBuilder) {
        this.nombre = personalBuilder.getNombre();
        this.apellido = personalBuilder.getApellido();
        this.correo = personalBuilder.getCorreo();
        this.fecha = personalBuilder.getFecha();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFecha() {
        return fecha;
    }
}
