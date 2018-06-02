/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author josejina
 */
public class Trabajador {

    private String nombre;
    private String puesto;
    private String telefono;
    private Date fecha_nacim;
    private Date fecha_contrato;
    private String nss;

    public Trabajador(String nombre, String nss) {
        this.nombre = nombre;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFecha_nacim() {
        return fecha_nacim;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public String getNss() {
        return nss;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.nss, other.nss)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", puesto=" + puesto + ", telefono=" + telefono + ", fecha_nacim=" + fecha_nacim + ", fecha_contrato=" + fecha_contrato + ", nss=" + nss + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFecha_nacim(Date fecha_nacim) {
        this.fecha_nacim = fecha_nacim;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }
    
    
    
    
}
