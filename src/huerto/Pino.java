   
package huerto;

public class Pino extends arbol{
    //clase hija derivada o subclase
    //colocamos arbol con un extend para hacerla referente a la clase herencia
    
    int no_frutos=0;
    
    
    //crear unn  metodo 
    //se llaman igual pero actuan diferente 
    
    /*POLIMORFISMO
     * EL METODO TIENE EL MISMO NOMBRE QUE UN METODO 
     * DE SU SUPERCLASE
     * PERO REACCIONA DE MANERA DIFERENTE */
    void daFruto() {
        System.out.println("Doy"+ this.no_frutos+ "ningun fruto");
    }
    
    
    
    
    
    
    
    
    
    
}
