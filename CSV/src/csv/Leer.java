
package csv;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leer {
    private String nombrePais;
    private String nombreRegion;
    private String SS;
    private String HFE;
    private String FTM;
    private String gener;
    private String Cp;
    
    ArrayList<paises> p = new ArrayList<paises>();
    ArrayList<Leer> leer = new ArrayList<Leer>();
   
    public Leer(){// contructor vacio para acceder a las funciones del sistema 
    
    }
    
    public Leer(String nombrePais, String nombreRegion, String SS, String HFE, String FTM, String gener, String Cp) {
        this.nombrePais = nombrePais;
        this.nombreRegion = nombreRegion;
        this.SS = SS;
        this.HFE = HFE;
        this.FTM = FTM;
        this.gener = gener;
        this.Cp = Cp;
        
    }
    // generamos los get and seet para una mayor comodidad a la hora de trabajar 
     public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getSS() {
        return SS;
    }

    public void setSS(String SS) {
        this.SS = SS;
    }

    public String getHFE() {
        return HFE;
    }

    public void setHFE(String HFE) {
        this.HFE = HFE;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getCp() {
        return Cp;
    }

    public void setCp(String Cp) {
        this.Cp = Cp;
    }

    public String getFTM() {
        return FTM;
    }

    public void setFTM(String FTM) {
        this.FTM = FTM;
    }
    
    
    //Utilizaremos los metodos de javacsv con la siguiente funcion 
    public static void Import(){
    //Utilizaremos el bloque Try- catch para asi evitar errores 
    try{
    ArrayList<Leer> pais  = new ArrayList<Leer>();
        CsvReader leerListaP = new CsvReader("C:\\Users\\marce\\Desktop\\UNAH Paola\\CSV\\world-happiness-report-2021.csv");
        leerListaP.readHeaders();// Este metodo se encarga de recorrer el archivo csv
        
    //Recorremos el archivo mediante un bucle de repeticion while 
    while(leerListaP.readRecord()){
    //Declaramos varibles de tipo String  definidas en el en el documento asiganado 
    String CountryName, RegionalIndicator,SocialSupport,HealthyLife,FreedomChoices,Generosity,Percepcup;
   CountryName = leerListaP.get(0);// extrae el nombre
   RegionalIndicator = leerListaP.get(1);// extrae la region 
   SocialSupport = leerListaP.get(7);// extrae el social support
   HealthyLife = leerListaP.get(8);// Extrae el Healthlife
   FreedomChoices = leerListaP.get(9);// extrae el frendomchoice
   Generosity = leerListaP.get(10);// Extrae el genorosity
   Percepcup= leerListaP.get(11);// extrae el percepcup
   
   //Añadiremos nueva informacion a la lista mediante el metodo add de  ArrayList
   pais.add(new Leer(CountryName, RegionalIndicator, SocialSupport, HealthyLife, FreedomChoices, Generosity, Percepcup));
   
    }    
   leerListaP.close();
   // Atraves de un For each o mejorado recorreremos la lista
   
   for(Leer conteo : pais ){
       System.out.println(conteo.getNombrePais() + "," 
        + conteo.getNombreRegion() + "," 
        +conteo.getSS() +","
        + conteo.getHFE() + ","
        + conteo.getFTM() +","
        + conteo.getGener() + ","
        + conteo.getCp());
   }
    }catch(FileNotFoundException e) {
      e.printStackTrace();
    }catch(IOException e) {
      e.printStackTrace();
       }
    }
   //Crearemos el metodo Export que exportara  paises
    public static void Export(List<Leer> paises){
    // Crearemos una varible ExitArchive tipo String apuntanddo al nombre del archivo 
    String ExitArchive = "C:\\Users\\marce\\Desktop\\UNAH Paola\\CSV\\world-happiness-report-2021.csv" ;   
    boolean x = new File(ExitArchive).exists();
    //El metodo exists(); verifica si el archivo existe 
    try{
    CsvWriter exit = new CsvWriter(new FileWriter(ExitArchive,true),',');
    
    exit.write("Country Name");
    exit.write("Regional Indicator");
    exit.write("Social Support");
    exit.write("Healthy life expectancy");
    exit.write("Freedom To make life choices");
    exit.write("Generosity");
    exit.write("Percepctions of Corruption");

    exit.endRecord();
    // El metodo endRecord(); segun definicion de la api de java deja de escribir en el archivo 
    
    for (Leer conteo : paises){//Recorremos la lista mediante un for mejorado nuevamente 
   exit.write(conteo.getNombrePais());
   exit.write(conteo.getNombreRegion());
   exit.write(conteo.getSS());
   exit.write(conteo.getHFE());
   exit.write(conteo.getFTM());
   exit.write(conteo.getGener());
   exit.write(conteo.getCp());
   // invocaremos el Metodo endRecord(); para dejar de escribir 
   exit.endRecord();
   
    }
    exit.close();
    
      }catch(IOException e){
      e.printStackTrace();
      }
    
    }
    
    
}
