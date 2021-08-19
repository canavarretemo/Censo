
public class MenorDeEdad extends Ciudadano{
    
    String tarjetaDeIdentidad;
    
    public MenorDeEdad(String anio, String sexo, String nombre, String documento) {
       super(anio, sexo, nombre);
       this.tarjetaDeIdentidad = documento;
    }
 
    @Override
    public String toString() {
        return "Ciudadano Menor - Nombre: " + this.nombre + "\n\taño de nacimiento: " + 
         this.anioNacimiento + "\n\tSexo: " + this.sexo + "\n\tNum C.C. : " + this.tarjetaDeIdentidad;
    }
}
