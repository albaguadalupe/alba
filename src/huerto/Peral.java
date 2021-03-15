
package huerto;

public class Peral extends arbol{
    //clase hija derivada o subclase
    //colocamos arbol con un extend para hacerla referente a la clase herencia
    
   static int no_peras=80;
    
    
    //crear unn  metodo 
    //se llaman igual pero actuan diferente 
    
    /*POLIMORFISMO
     * EL METODO TIENE EL MISMO NOMBRE QUE UN METODO 
     * DE SU SUPERCLASE
     * PERO REACCIONA DE MANERA DIFERENTE */
    void daFruto() {
        System.out.println("Doy"+ this.no_peras+ "peras  al año");
    }
    public void agregaPera(String tipo){
    // crear manzanas 
       Pera b1=new Pera(tipo);
    /// crear contador de manzanas 
    /// variable de instancia: hay una copia para cada objeto 
    //variable de clase: variable compartidad static ----ejemplo(contador de pernas)modificado por todos los objetos
    no_peras++;
    //se iran incrementando 
    b1.madurar();
    b1.CaerDeArbol();
    b1.podrir();
    
    }
}
    
    
    
    
    
    