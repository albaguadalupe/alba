/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huerto;


public class manzano extends arbol{
    static int no_manzanas=50;
    void daFruto() {
        System.out.println("Doy"+ this.no_manzanas+ "manzanas al año");
                }
    public void agregamanzana(String tipo){
        manzana m1=new manzana(tipo);
    no_manzanas++;
    //se iran incrementando 
    m1.madurar();
    m1.podrir();
    }
}



