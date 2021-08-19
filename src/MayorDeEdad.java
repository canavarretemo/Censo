
public class MayorDeEdad extends Ciudadano{

    String cedula;
    
   public MayorDeEdad(String anio, String sexo, String nombre, String documento) {
       super(anio, sexo, nombre);
       this.cedula = documento;
    }
    
    @Override
    public String toString() {
        return "Ciudadano Mayor - Nombre: " + this.nombre + "\n\taño de nacimiento: " + 
         this.anioNacimiento + "\n\tSexo: " + this.sexo + "\n\tNum C.C.: " + this.cedula;
    }

    
       
    
    
    
}
