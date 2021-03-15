/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huerto;

public class arbol {
    //clase madre o superclase es arbol 
    
    //atributos
    String colorTronco;
    String colorHojas;
    double altura;
    int edad;
    boolean frutal =false;
    
    //generar metodos
    //setter and getters de los atributos 
    //para que aparezan de manera automatica
    //insert code y seleccionar set and getters para cada uno

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public String getColorTronco() {
        return colorTronco;
    }

    public void setColorTronco(String colorTronco) {
        this.colorTronco = colorTronco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isFrutal() {
        return frutal;
    }

    public void setFrutal(boolean frutal) {
        this.frutal = frutal;
    }
          
    
    //colocar un metodo 
    void daFruto() {
System.out.println("NO DOY FRUTO");
    }
//METODO CRECER
    void crece() {
        System.out.println("ESTOY CRECIENDO FRONDOSO");
    }
    
    //otro metodo 
        void daSombra() {
            System.out.println("DANDOTE SOMBRITA");
            
        }
    
  
    
    
    
   
   
    
    
}
