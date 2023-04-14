package ficheroBasico;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class escritura {

	public static void main(String[] args) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\garfe\\Desktop\\Fichero.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++) {
                pw.println("Linea: " + i + " de 10");
            }

        } catch (IOException ioe) {
        	System.out.print("[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" + ioe);
        } finally {
           try {
        	   if (null != fichero)
        		   fichero.close();
           }catch (IOException ioe2){ 
	        	 System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
	       }
        }

	}

}
