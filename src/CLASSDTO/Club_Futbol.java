package CLASSDTO;

public class Club_Futbol {
    private double Presupuesto;
    private int Numero_Titulos;
    private int Numero_Jugadores;
    private int Capacidad_Estadio;
    private String Patrocinadores;
    private String Division_Actual;
    
    public void setPresupuesto(double Presupuesto){
        this.Presupuesto = Presupuesto;
    }
    
    public void setNumero_Titulos(int Numero_Titulos){
        this.Numero_Titulos = Numero_Titulos;
    }
    
    public void setNumero_Jugadores(int Numero_Jugadores){
        this.Numero_Jugadores = Numero_Jugadores;
    }
    
    public void setCapacidad_Estadio(int Capacidad_Estadio){
        this.Capacidad_Estadio = Capacidad_Estadio;
    }
    
    public void setPatrocinadores(String Patrocinadores){
        this.Patrocinadores = Patrocinadores;
    }
    
    public void setDivision_Actual(String Division_Actual){
        this.Division_Actual = Division_Actual;
    }
    
    public double getPresupuesto(){
        return Presupuesto;
    }
    
    public int getNumero_Titulos(){
        return Numero_Titulos;
    }
    
    public int getNumero_Jugadores(){
        return Numero_Jugadores;
    }
    
    public int getCapacidad_Estadio(){
        return Capacidad_Estadio;
    }
    
    public String getPatrocinadores(){
        return Patrocinadores;
    }
       
    public String getDivision_Actual(){
        return Division_Actual;
    }
}

/**
 * @author Gabriel (A.Neuer)
 */ 