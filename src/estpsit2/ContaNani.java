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
public class ContaNani implements Runnable {
    public ContaNani(){
    } 
    public void run (){
    for(int i=0;i<7;i++){
    System.out.println((i+1) + " " + Thread.currentThread().getName());
  }
 }   
}
