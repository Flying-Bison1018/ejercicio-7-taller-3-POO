/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author PC
 */
public class Producto {
   private long codigo;
    private String nombre;
    private float precioCompra;
    private float porcentajeUtilidad;
    
    public Producto(){
        this.codigo = 0;
        this.nombre = "";
        this.precioCompra = 0;
        this.porcentajeUtilidad = 0;
    }
    
    public long getCodigo(){
        return codigo;
    }
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public float precioCompra(){
        return precioCompra;
    }
    public void setPrecioCompra(float precioCompra){
        this.precioCompra = precioCompra;
    }
    public float getPorcentajeUtilidad(){
        return porcentajeUtilidad;
    }
    public void setPorcentajeUtilidad(float porcentajeUtilidad){
        this.porcentajeUtilidad = porcentajeUtilidad;
    }
    public float precioVenta(){
        float precioVentaPublico = precioCompra * porcentajeUtilidad;
        return precioVentaPublico;
    }
    public void imprimir(){
        System.out.println();
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio Compra: " + precioCompra);
        System.out.println("Porcentaje Utilidad: " + porcentajeUtilidad);
        System.out.println("Precio venta: " + precioVenta());
    } 
}
