package examen.ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class ejercicio1 {
    
    public static void main(String[] args) throws IOException {
        	procesarArchivoTexto("res/ejercicio1.txt");
    }
    
    public static void procesarArchivoTexto(String archivo) throws FileNotFoundException, IOException {
        String linea;
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        Map <String, String> compuestosQuimicos = new TreeMap<String, String>();
        Set <String> elementosQuimicos = new HashSet<String>();
        while((linea = br.readLine())!=null) {
        	String[] partes = linea.split(":");
        	String compuesto = partes[0].trim();
            String elementos = partes[1].trim();
            compuestosQuimicos.put(compuesto,elementos);
            String[] elementosArray = elementos.split(" ");
            for(int i=0; i<elementosArray.length; i++) {
            	elementosQuimicos.add(elementosArray[i]);
            }
        }
        //Iteración1
        System.out.println("Iteración 1");
        compuestosQuimicos.forEach((i,j) -> System.out.println("Compuesto-> "+ i + ": " + j));
        //iteración 2
        System.out.println("");
        System.out.println("Iteración 2");
        Iterator <Entry<String, String>> entradas = compuestosQuimicos.entrySet().iterator();
        while(entradas.hasNext()) {
        	Entry<String, String> entrada = entradas.next();
        	System.out.println("Compuesto-> " + entrada.getKey() + ": " + entrada.getValue());
        }
        //iteración 3        
        System.out.println("");
        System.out.println("Iteración 3");
        for(Entry<String, String> e:compuestosQuimicos.entrySet()) {
        
        System.out.println("Compuesto-> " + e.getKey() + ": " + e.getValue());
        }
        //Todos los elementos
        System.out.println("");
        System.out.println("Elementos:");
        System.out.println(elementosQuimicos);
        br.close();
    }
}
