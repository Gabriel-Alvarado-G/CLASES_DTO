package CLASSDTO;

public class Avion {
    private String Tipo;
    private double Pasaje;
    private String Velocidad;
    private String Altitud;
    private int Cantidad_Motores;
    private String Matricula;
    
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    
    public void setPasaje(double Pasaje){
        this.Pasaje = Pasaje;
    }
    
    public void setVelocidad(String Velocidad){
        this.Velocidad = Velocidad;
    }
    
    public void setAltitud(String Altitud){
        this.Altitud = Altitud;
    }
    
    public void setCantidad_Motores(int Cantidad_Motores){
        this.Cantidad_Motores = Cantidad_Motores;
    }
    
    public void setMatricula(String Matricula){
        this.Matricula = Matricula;
    }
    
    public String getTipo(){
        return Tipo;
    }
    
    public double getPasaje(){
        return Pasaje;
    }
    
    public String getVelocidad(){
        return Velocidad;
    }
    
    public String getAltitud(){
        return Altitud;
    }
    
    public int getCantidad_Motores(){
        return Cantidad_Motores;
    }
    
    public String getMatricula(){
        return Matricula;
    }
}

/**
 * @author Gabriel (A.Neuer)
 */ 