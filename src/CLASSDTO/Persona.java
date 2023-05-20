
package CLASSDTO;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Cedula;
    private String Correo;
    private int Celular;
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
  
    public void setCedula(int Cedula){
        this.Cedula = Cedula;
    }
    
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
    public void setCelular(int Celular){
        this.Celular = Celular;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public int getCedula(){
        return Cedula;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
    public int getCelular(){
        return Celular;
    }
}

/**
 * @author Gabriel (A.Neuer)
 */ 