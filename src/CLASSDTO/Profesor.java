package CLASSDTO;

public class Profesor {
    private String Materia;
    private int Horas_Trabajo;
    private String Jornada;
    private int Numero_Cursos;
    private double Salario;
    private char Estado;
    
    public void setMateria(String Materia){
        this.Materia = Materia;
    }
    
    public void setHoras_Trabajo(int Horas_Trabajo){
        this.Horas_Trabajo = Horas_Trabajo;
    }
    
    public void setJornada(String Jornada){
        this.Jornada = Jornada;
    }
    
    public void setNumero_Cursos(int Numero_Cursos){
        this.Numero_Cursos = Numero_Cursos;
    }
    
    public void setSalario(double Salario){
        this.Salario = Salario;
    }
    
    public void setEstado(char Estado){
        this.Estado = Estado;
    }
    
    public String getMateria(){
        return Materia;
    }
    
    public int getHoras_Trabajo(){
        return Horas_Trabajo;
    }
    
    public String getJornada(){
        return Jornada;
    }
    
    public int getNumero_Cursos(){
        return Numero_Cursos;
    }
    
    public double getSalario(){
        return Salario;
    }
    
    public char getEstado(){
        return Estado;
    }   
}

/**
 * @author Gabriel (A.Neuer)
 */ 