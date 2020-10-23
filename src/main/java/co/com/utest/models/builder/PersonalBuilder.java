package co.com.utest.models.builder;

import co.com.utest.models.Personal;
import co.com.utest.utils.Builder;

public class PersonalBuilder implements Builder<Personal> {

    private String nombre;
    private String apellido;
    private String correo;
    private String fecha;

    public static PersonalBuilder personal(){
        return  new PersonalBuilder();
    }

    public PersonalBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public PersonalBuilder conApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public PersonalBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public PersonalBuilder conFecha(String fecha){
        this.fecha = fecha;
        return this;
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

    @Override
    public Personal builder() {
        return new Personal(this);
    }
}
