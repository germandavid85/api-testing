package org.apitesting.client.namespace.municipio;

/**
 * Created by gpotesf on 2/17/17.
 */
public class Municipio {
    private String nombre;
    private String codigoNombre;
    private String codigoDepartamento;


    public Municipio() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoNombre() {
        return codigoNombre;
    }

    public void setCodigoNombre(String codigoNombre) {
        this.codigoNombre = codigoNombre;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartament) {
        this.codigoDepartamento = codigoDepartament;
    }
}
