/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpool;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Threadpool {

   public  String angka;
   
   public void setName(String newName){
       angka = newName;
   }
   public String getName(){
       return angka;
   }
   
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(5);
        for (int i = 1; 1< 5; i++){
            service.submit(new kelaspemroses(1));
            Threadpool testangka=new Thereadpool();
        testangka.setName(" Adalah bilangan ganjil");
        for (int angka=1;angka <100; angka=angka+2) {
            System.out.println(angka+testangka.getName());
        }
        }
        
        System.out.println("semua telah di eksekusi");
        service.shutdown();
        
        try {
            service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Selesai");
        }
    }
    

