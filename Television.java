/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.util.Scanner;

/**
 *
 * @author manop
 */
public class Television {
    private boolean encendidoApagado;
    private int volumen;
    private int canal;
    private String marca;
    static Scanner scan = new Scanner(System.in);
    public Television(){
        encendidoApagado=false;
        volumen=5;
        canal=2;
        marca="s/m";//Sin marca :0
    }
    public Television(int c, int v, String m){
        System.out.println("Canal: ");
        canal=scan.nextInt();
        System.out.println("Volumen: ");
        volumen=scan.nextInt();
        encendidoApagado=false;
    }
    public void encender(){
        encendidoApagado=true;
    }
    public void apagar(){

    }
    public void cambiarCanal(int nuevoCanal){
        
    }
    public void avanzarCanal(){
        if(canal==99){
            canal=0;
        }
        else{
            canal++;
        }
    }
    public void retrocederCanal(){
        if(canal==0){
            canal=99;
        }
        else{
           canal--; 
        }
    }
    public void subirVolument(){
        if(volumen<50){
            volumen++;
        }
    }
    public void bajarVolumen(){
        if(volumen>0){
            volumen--;
        }
    }
    public void mostrarEstado(){
        
    }
}

