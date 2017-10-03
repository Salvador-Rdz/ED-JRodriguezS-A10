/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jrodriguezs.a10;

/**
 *
 * @author Salvador
 */
public class EDJRodriguezSA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CList list = new CList(1);
        list.insert(2);
        list.insert(3);
        list.showList();
        list.showListbyAddress();
        list.deleteNode(2);
        list.showList();
        list.showListbyAddress();
        
    }
    
}
