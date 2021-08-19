
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Censo {

    public List<Ciudadano> ciudadanos =  new ArrayList<>();
        
    public static void main(String[] args) {
         Censo censo = new Censo();
         censo.procesar();
    }
    
   public void procesar(){
       Scanner sc =  new Scanner(System.in);
       /*while(sc.hasNextLine()){
           String comando = sc.nextLine();
           String[] datos = comando.split("&");
            if(comando.equals("2"))
            listarCiudadano();
        else if(datos[0].equals("1")){
            agregarCiudadano(datos); 
        }
        }*/
       
       String comando = sc.nextLine();
           String[] datos = comando.split("&");
            if(comando.equals("2"))
            listarCiudadano();
        else if(datos[0].equals("1"))
            agregarCiudadano(datos);
    }
           
    
    public void agregarCiudadano(String [] datos){
        String anio = datos[2];
        String sexo = datos[3];
        String nombre =  datos[4];
        String documento = datos[5];
          
        if(datos[1].equals("Mayor")){
                MayorDeEdad persona = new MayorDeEdad(anio, sexo, nombre, documento);
                ciudadanos.add(persona);
                procesar();
                
        }
        else if(datos[1].equals("Menor")){
                MenorDeEdad persona = new MenorDeEdad (anio, sexo, nombre, documento);
                ciudadanos.add(persona);
                procesar();
            }
    } 
      
    public void listarCiudadano(){
         
        System.out.println("***Censo de ciudadano***");
        for(Ciudadano c : ciudadanos){
            System.out.println("\t" + c.toString());
        }
        
        procesar();
    }
} 
       
       
  



        
    
    

