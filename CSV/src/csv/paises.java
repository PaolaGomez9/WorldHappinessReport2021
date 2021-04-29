
package csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class paises extends Thread {
 double SS;
 double Hf;
 double FreeC;
 double G;
 double Cp;
 double PSS;
 double PHe;
 double PFreeC;
 double PGene;
 double PCorrup;
private String nameR;
private int NP;
public int eneArchivos;
private int pausa;
    
ArrayList<paises>regiones = new ArrayList<paises>();
     public paises(){  
      }
    public paises(String nameR, int NP) {
        this.nameR = nameR;
        this.NP = NP;
    }

    public int getPausa() {
        return pausa;
    }

    public void setPausa(int pausa) {
        this.pausa = pausa;
    }

    public String getNameR() {
        return nameR;
    }

    public void setNameR(String nameR) {
        this.nameR = nameR;
    }

    public int getNP() {
        return NP;
    }

    public void setNP(int NP) {
        this.NP = NP;
    }
    /* 
    por falta de tiempo este metodo no se pudo implementar, contiene errores al inicio su fincionalidad eera el poder sacar el promedio de cada una de las 
    casillas ya dichas en el documento pero la falta de informacion y de recursos nos incapacito para poder realizarlo
    
 public void Promedio(int numero){
    double AC=0;
    double AG=0;
    try{
    BufferedReader bfr = new BufferedReader(new  FileReader("C:\\Users\\marce\\Desktop\\UNAH Paola\\CSV\\world-happiness-report-2021.csv"));
    segemento = bfr.readLine();
    while(segemento!=null){
    //Contruimos un Array tipo String utilizando el metodo Split para dividir las cadenas atraves de la ','
    //
    String Datos[] = segemento.split(",");
    //Utilizaremos una función que se utiliza para convertir string a double
    
    SS = Double.parseDouble(Datos[7]);
    Hf = Double.parseDouble(Datos[8]);
    FreeC = Double.parseDouble(Datos[9]);
    G= Double.parseDouble(Datos[10]);
    Cp= Double.parseDouble(Datos[11]);
    //
    PSS = (SS + SS )/this.NP;
    PHe= (Hf+Hf)/this.NP;
    PFreeC=(FreeC +FreeC)/this.NP;
    PGene= (G+G)/this.NP;
    PCorrup = (Cp+Cp)/this.NP;    
    if(Cp>AC){
    AC=Cp;
    }
    if(G>AG){
    AG=G;
    }
    // imprimiendo 
    System.out.println("Promedio de Social Support:"+ PSS +"\n");
    System.out.println("Promedio de Healty Life expectancy: " + PHe +"\n");
    System.out.println("Promedio de Freedom to make choices: " + PFreeC +"\n");
    System.out.println("Promedio de Generosity: " + PGene +"\n");
    System.out.println("Promedio de Perception Of Corruption: " + PCorrup +"\n");
    System.out.println("Pais Con la Mas alta Percepcion de corrupcion: " + AC +"\n");
    System.out.println("Pais con la mas alta generosidad: " + AG +"\n");
    segemento = bfr.readLine();
    }
    }catch(FileNotFoundException ex) {
     System.err.println(ex.getMessage());
    } catch(IOException ex) {
     System.err.println(ex.getMessage());
    }
 }*/

 @Override
   public void run(){
   
   // Queriamos implementar hilos, pero el tema es demasiado complejo y el tiiempo no ajustaba para ello
   //pero en cambio seguiremos estudiando el tema para tener  una mayor comprenesion 
   
   }
   
    }
 
  
 


