package CLASSDTO;

public class Universidad {
    private String Ubicacion;
    private String Modalidad;
    private int Duracion;
    private String Carreras;
    private String Tipo_Titulos;
    private String Tipo_Universidad;
    
    public void setUbicacion(String Ubicacion){
        this.Ubicacion = Ubicacion;
    }
    
    public void setModalidad(String Modalidad){
        this.Modalidad = Modalidad;
    }
    
    public void setDuracion(int Duracion){
        this.Duracion = Duracion;
    }
    
    public void setCarreras(String Carreras){
        this.Carreras = Carreras;
    }
    
    public void setTipo_Titulos(String Tipo_Titulos){
        this.Tipo_Titulos = Tipo_Titulos;
    }
    
    public void setTipo_Universidad(String Tipo_Universidad){
        this.Tipo_Universidad = Tipo_Universidad;
    }
    
    public String getUbicacion(){
        return Ubicacion;
    }
    
    public String getModalidad(){
        return Modalidad;
    }
    
    public int getDuracion(){
        return Duracion;
    }
    
    public String getCarreras(){
        return Carreras;
    }
    
    public String getTipo_Titulos(){
        return Tipo_Titulos;
    }
    
    public String getTipo_Universidad(){
        return Tipo_Universidad;
    }
}

/**
 * @author Gabriel (A.Neuer)
 */ 