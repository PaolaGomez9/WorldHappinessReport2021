
package csv;

import java.util.ArrayList;
import java.util.List;

public class CSV extends Thread{

    public static void main(String[] args) {
        // TODO code application logic here
        Leer l = new Leer();
        paises p = new paises();
        ArrayList<Leer>pais= new ArrayList<Leer>();
        
        pais.add(new Leer("Brazil", "Sur-America","0.710","66.300","0.608","0.218","0.714"));
        pais.add(new Leer("Bulgaria","Central and Eastern Europe","0.931","67.000","0.788","-0.096","0.932"));
	
         //Leer.Import();
        //Leer.Export(pais);
	//p.start();
		
		
        
    }
    
}
