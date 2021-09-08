
package producto;

import java.util.Scanner;


public class PruebaProducto {

  
    public static void main(String[] args) {
       
      Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Tamanio vector"); n = entrada.nextInt();
        Producto p[] = new Producto[n];
        for(int i = 0; i < p.length; i++){
            p[i] = new Producto();
            System.out.println("Codigo: ");p[i].setCodigo(entrada.nextInt());
            System.out.println("Nombre: ");p[i].setNombre(entrada.next());
            System.out.println("Precio Compra: ");p[i].setPrecioCompra(entrada.nextFloat());
            System.out.println("Porcentaje Utilidad: ");p[i].setPorcentajeUtilidad(entrada.nextFloat());            
        }        
        System.out.println();
        System.out.println("--Inventario--");
        for(int i = 0; i < p.length; i++){
            p[i].imprimir();
        }     
    }
    
}
