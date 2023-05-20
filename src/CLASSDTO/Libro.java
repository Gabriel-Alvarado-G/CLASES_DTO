package CLASSDTO;

public class Libro {
    private String Autor;
    private int Año_Publicacion;
    private int Numero_Paginas;
    private String Editorial;
    private int Codigo;
    private String Genero;
    
    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    
    public void setAño_Publicacion(int Año_Publicacion){
        this.Año_Publicacion = Año_Publicacion;
    }
    
    public void setNumero_Paginas(int Numero_Paginas){
        this.Numero_Paginas = Numero_Paginas;
    }
    
    public void setEditorial(String Editorial){
        this.Editorial = Editorial;
    }
    
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }
    
    public void setGenero(String Genero){
        this.Genero = Genero;
    }
    
    public String getAutor(){
        return Autor;
    }
    
    public int getAño_Publicacion(){
        return Año_Publicacion;
    }
    
    public int getNumero_Paginas(){
        return Numero_Paginas;
    }
    
    public String getEditorial(){
        return Editorial;
    }
    
    public int getCodigo(){
        return Codigo;
    }
    
    public String getGenero(){
        return Genero;
    }    
}

/**
 * @author Gabriel (A.Neuer)
 */ 