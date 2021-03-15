
package huerto;

public class Naranjo extends arbol{
    //clase hija derivada o subclase
    //colocamos arbol con un extend para hacerla referente a la clase herencia
    
    static int no_naranjas=30;
    
    
    //crear unn  metodo 
    //se llaman igual pero actuan diferente 
    
    /*POLIMORFISMO
     * EL METODO TIENE EL MISMO NOMBRE QUE UN METODO 
     * DE SU SUPERCLASE
     * PERO REACCIONA DE MANERA DIFERENTE */
    void daFruto() {
        System.out.println("Doy"+ this.no_naranjas+ "naranjas al año");
    }
      public void agregaNaranjo(String tipo){
   Naranja n1=new Naranja(tipo);
    /// crear contador de manzanas 
    /// variable de instancia: hay una copia para cada objeto 
    //variable de clase: variable compartidad static ----ejemplo(contador de pernas)modificado por todos los objetos
    no_naranjas++;
    //se iran incrementando 
    n1.madurar();
    n1.podrir();
    }
}
    
    
    
    
    
    
    
    