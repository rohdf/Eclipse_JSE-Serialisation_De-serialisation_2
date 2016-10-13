package nsis.metier;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisation {
    public static void main(String argv[]) throws ClassNotFoundException { 
        try { 
              FileInputStream f = new FileInputStream("/home/rfrimat/leChienMédor.serialisation"); 
              ObjectInputStream o = new ObjectInputStream(f); 
              Animal animal = (Animal)o.readObject(); 
              o.close(); 
              System.out.println(animal.getNom()+" est "+animal.getCouleur()); 
        } 
        catch (IOException e) { 
              System.out.println(e); 
        } 
  } 
}
