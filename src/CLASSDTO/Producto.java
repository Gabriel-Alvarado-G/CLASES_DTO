package CLASSDTO;

public class Producto {
    private String Calidad;
    private int Stock;
    private String Descripcion_Producto;
    private String Proveedor;
    private double Peso_Producto;
    private double Precio_Producto;
    
    public void setCalidad(String Calidad){
        this.Calidad = Calidad;
    }
    
    public void setStock(int Stock){
        this.Stock = Stock;
    }
    
    public void setDescripcion_Producto(String Descripcion_Producto){
        this.Descripcion_Producto = Descripcion_Producto;
    }
    
    public void setProveedor(String Proveedor){
        this.Proveedor = Proveedor;
    }
    
    public void setPeso_Producto(double Peso_Producto){
        this.Peso_Producto = Peso_Producto;
    }
    
    public void setPrecio_Producto(double Precio_Producto){
        this.Precio_Producto = Precio_Producto;
    }
    
    public String getCalidad(){
        return Calidad;
    }
    
    public int getStock(){
        return Stock;
    }
    
    public String getDescripcion_Producto(){
        return Descripcion_Producto;
    }
    
    public String getProveedor(){
        return Proveedor;
    }
    
    public double getPeso_Producto(){
        return Peso_Producto;
    }
    
    public double getPrecio_Producto(){
        return Precio_Producto;
    }
}

/**
 * @author Gabriel (A.Neuer)
 */ 