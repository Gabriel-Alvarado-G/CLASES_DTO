package CLASSDTO;

public class Cine {
    private int Numero_Boletos;
    private int Numero_Sala;
    private String Clasificacion;
    private String Nombre_Pelicula;
    private double Precio_Entradas;
    private String Procedencia;
    
    public void setNumero_Boletos(int Numero_Boletos){
        this.Numero_Boletos = Numero_Boletos;
    }
    
    public void setNumero_Sala(int Numero_Sala){
        this.Numero_Sala = Numero_Sala;
    }
    
    public void setClasificacion(String Clasificacion){
        this.Clasificacion = Clasificacion;
    }
    
    public void setNombre_Pelicula(String Nombre_Pelicula){
        this.Nombre_Pelicula = Nombre_Pelicula;
    }
    
    public void setPrecio_Entradas(double Precio_Entradas){
        this.Precio_Entradas = Precio_Entradas;
    }
    
    public void setProcedencia(String Procedencia){
        this.Procedencia = Procedencia;
    }
    
    public int getNumero_Boletos(){
        return Numero_Boletos;
    }
    
    public int getNumero_Sala(){
        return Numero_Sala;
    }
    
    public String getClasificacion(){
        return Clasificacion;
    }
    
    public String getNombre_Pelicula(){
        return Nombre_Pelicula;
    }
    
    public double getPrecio_Entradas(){
        return Precio_Entradas;
    }
    
    public String getProcedencia(){
        return Procedencia;
    }
}

/**
 * @author Gabriel (A.Neuer)
 */ 