/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit2;

/**
 *
 * @author nicco
 */
public class EsTpsit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Thread thread1 =new Thread (new ContaNani(), "Cucciolo");
    Thread thread2 =new Thread (new ContaNani(), "brontolo");
    Thread thread3 =new Thread (new ContaNani(), "dotto");
    Thread thread4 =new Thread (new ContaNani(), "Eolo");
    Thread thread5 =new Thread (new ContaNani(), "Mammaolo");
    Thread thread6 =new Thread (new ContaNani(), "Pisolo");
    Thread thread7 =new Thread (new ContaNani(), "Gongolo");
}
