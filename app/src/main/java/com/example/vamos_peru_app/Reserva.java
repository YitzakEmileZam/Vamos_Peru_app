package com.example.vamos_peru_app;

public class Reserva {

//private int idReserva;
private String nombres,apellidoMaterno,apellidoPaterno,tipoDocum,
        numDocum,genero,celular,correo,cantPersonas,diaReserva,
        numDiasReserva,horaReserva;
//no esta el elegirComida
    public Reserva() {
    }

    public Reserva(String cantPersonas, String nombres, String apellidoMaterno, String apellidoPaterno, String tipoDocum, String numDocum, String genero, String celular, String correo, String diaReserva, String numDiasReserva, String horaReserva) {
        //this.idReserva = idReserva;
        this.cantPersonas = cantPersonas;
        //this.codReserva = codReserva;
        this.nombres = nombres;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.tipoDocum = tipoDocum;
        this.numDocum = numDocum;
        this.genero = genero;
        this.celular = celular;
        this.correo = correo;
        this.diaReserva = diaReserva;
        this.numDiasReserva = numDiasReserva;
        //this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
    }

    /*public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }*/

    public String getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(String cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    //public int getCodReserva() {
        //return codReserva;
    //}

    /*public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }*/

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getTipoDocum() {
        return tipoDocum;
    }

    public void setTipoDocum(String tipoDocum) {
        this.tipoDocum = tipoDocum;
    }

    public String getNumDocum() {
        return numDocum;
    }

    public void setNumDocum(String numDocum) {
        this.numDocum = numDocum;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDiaReserva() {
        return diaReserva;
    }

    public void setDiaReserva(String diaReserva) {
        this.diaReserva = diaReserva;
    }

    public String getNumDiasReserva() {
        return numDiasReserva;
    }

    public void setNumDiasReserva(String numDiasReserva) {
        this.numDiasReserva = numDiasReserva;
    }

    /*public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }*/

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }
}
