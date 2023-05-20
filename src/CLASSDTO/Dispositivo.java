package CLASSDTO;

public class Dispositivo {
    private String Marca;
    private int Capacidad;
    private String Modelo;
    private String Calidad_Fotografica;
    private String Sistema_Operativo;
    private String Resolucion_Pantalla;
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    
    public void setCapacidad(int Capacidad){
        this.Capacidad = Capacidad;
    }
    
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    
    public void setCalidad_Fotografica(String Calidad_Fotografica){
        this.Calidad_Fotografica = Calidad_Fotografica;
    }
    
    public void setSistema_Operativo(String Sistema_Operativo){
        this.Sistema_Operativo = Sistema_Operativo;
    }
    
    public void setResolucion_Pantalla(String Resolucion_Pantalla){
        this.Resolucion_Pantalla = Resolucion_Pantalla;
    }
    
    public String getMarca(){
        return Marca;
    }
    
    public int getCapacidad(){
        return Capacidad;
    }
    
    public String getModelo(){
        return Modelo;
    }
    
    public String getCalidad_Fotografica(){
        return Calidad_Fotografica;
    }
    
    public String getSistema_Operativo(){
        return Sistema_Operativo;
    }
    
    public String getResolucion_Pantalla(){
        return Resolucion_Pantalla;
    }
}

/**
 * @author Gabriel (A.Neuer)
 */ 