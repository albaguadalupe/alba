
package Huerto;

public class Naranja {
 

    private String color;
    private String sabor;
    private double peso;
    private String tipo;
    //contructor 
    //generar  un constructor 
    public Naranja (String tipo ){
        //pasar un tipo de manzana
        this.tipo=tipo;
        //inicializar el sabor 
       sabor="acida";
       peso=2;

       
       //-----
       this.setColor(tipo);
       
    }
    
///////////////////////////////////////////////////////////////////////////////////////////
    // metodos
    //metodo madurar
    public void madurar (){
       this.sabor="dulce";
       this.peso=300;
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
    
    this.sabor="agrio";
    this.peso=150;
    this.color="cafe obscuro ";
   
   System.out.println("Me estoy pudriendo, mi sabor"+"ahora es:"+this.sabor+"mi color cambio"+"a:"+this.color+"y mi peso"+"disminuye a"+this.peso);
} 
///////////////////////////////////////////////////////////////////////////////////////////////////  
    
    public String getColor() {
        return color;
    }

    public void setColor(String tipo ) {//recibir codigo 
        
        if(tipo.compareToIgnoreCase("navel")==0){
          
        this.color="naranja";     

    }
        if(tipo.compareToIgnoreCase("valencia")==0){
            this.color="naranja obscura";
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

    
    
    
    
    
    
    

