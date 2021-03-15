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
public class Huerto {

    public static void main (String args[]){ 
        
        arbol a1=new arbol();
        System.out.println("Ha nacido un arbol");
        //llamar a tres de sus metodos 
         a1.colorTronco="cafe";
      a1.colorHojas="amarillas";
        a1.crece();
        a1.daSombra();
        a1.daFruto();  // no doy fruto
        
        
          System.out.println("---------------------------------------------------------------------------------");
        
        //crear un arbol de manzana
   manzano m1=new manzano();
      System.out.println("Ha nacido un manzano");
       m1.colorTronco="cafe obscuro";
      m1.colorHojas="cafes";
      m1.crece(); //heredo los metodos del arbol 
      m1.daSombra();
      m1.daFruto(); //doy 50 manzanas al año
      m1.agregamanzana("golden");
      m1.daFruto();
      //static para las variables de un objeto
      
               System.out.println("----------------------------------------------------------------------------");
       //crear un arbol naranjo
   Naranjo n1=new Naranjo();
      System.out.println("Ha nacido un naranjo");
      n1.crece(); //heredo los metodos del arbol 
      n1.daSombra();
      n1.daFruto(); //doy 30 naranjos  al año
      n1.colorTronco="cafe claro";
      n1.colorHojas="verdes";
       n1.agregaNaranjo("valencia");
      n1.daFruto();
               System.out.println("----------------------------------------------------------------------------");
      
             //crear un arbol pera
   Peral b1=new Peral();
      System.out.println("Ha nacido un peral");
      b1.crece(); //heredo los metodos del arbol 
      b1.daSombra();
      b1.daFruto(); //doy 100 peras   al año
      b1.colorTronco="cafe";
      b1.colorHojas="verdes olivo";
    b1.agregaPera("romana");
      b1.daFruto();
               System.out.println("----------------------------------------------------------------------------");
          //crear un pino
   Pino g1=new Pino();
      System.out.println("Ha nacido un pino");
      a1.crece(); //heredo los metodos del arbol 
      a1.daSombra();
      a1.colorTronco="cafe";
      a1.colorHojas="verdes";
   a1.daFruto();
  }
}
