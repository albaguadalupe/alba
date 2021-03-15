/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huerto;

/**
 *
 * @author ALBA
 */
public class manzana {
    
//manzano <>-- manzana  agregacion
    private String color;
    private String sabor;
    private double peso;
    private String tipo;
    //contructor 
    //generar  un constructor 
    public manzana(String tipo ){
        //pasar un tipo de manzana
        this.tipo=tipo;
        //inicializar el sabor 
       sabor="acida";
       // el peso de una manzana
       peso=2;
       //comoo el color depende dle tipo de manzana 
       // el color de una manzana cuando nace
       
       //-----
       this.setColor(tipo);
       
    }

    // metodos
    //metodo madurar
    public void madurar (){
       this.sabor="dulce";
       this.peso=200;
      System.out.println("Estoy madurando,ahora mi sabor es"+this.sabor+"y mi peso es"+ this.peso);
        
      //colocar el metodo caer de arbol 
      this.CaerDeArbol();
      
      
    }
    
///////////////////////////////////////////////////////////////////////////////////////////  
    ///metodo de caer del arbol
    
    public void CaerDeArbol(){
        System.out.println("Me estoy cayendo"+"porque ya estoy madura");
    }
    
///////////////////////////////////////////////////////////////////////////////////////////
   public void podrir(){
    
    this.sabor="amargo";
    this.peso=100;
    this.color="cafe";
   
   System.out.println("Me estoy pudriendo, mi sabor"+"ahora es:"+this.sabor+"mi color cambio"+"a:"+this.color+"y mi peso"+"disminuye a"+this.peso);
} 
///////////////////////////////////////////////////////////////////////////////////////////////////  
    
    public String getColor() {
        return color;
    }

    public void setColor(String tipo ) {//recibir codigo 
        
        if(tipo.compareToIgnoreCase("golden")==0){
            //metodo para comnprar lo que tiene golden en tipo y si es igual a 0 entonces seran amarillas
        this.color="amarillas";     
 //depende de su tipo 
    }
        if(tipo.compareToIgnoreCase("washington")==0){
            this.color="rojo";
    }
        if(tipo.compareToIgnoreCase("granny")==0){
            this.color="verde";// un color de acuedo al tpo de manzana que es 
    }
        
    }
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}







