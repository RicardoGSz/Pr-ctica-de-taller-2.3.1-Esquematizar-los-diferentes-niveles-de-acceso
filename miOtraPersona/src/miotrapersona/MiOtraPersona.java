package miotrapersona;
import java.lang.reflect.Method;

class Persona {
    //edad, sexo, estatura, peso, pais de origen
    int edad;
    String S;
    protected double estatura;
    private float peso;
    String Origen;
    
    //Creacion de set de cada atributo
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setSexo(String S){
        this.S = S;
    }
    
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public void setOrigen(String Origen){
        this.Origen = Origen;
    }
    
    //Creacion get de cada atributo
    public int getEdad(){
        return edad;
    }
    
    public String getSexo(){
        return S;
    }
    
    public double getEstatura(){
        return estatura;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public String getOrigen(){
        return Origen;
    }
}

class Rutinas {
    String alimento;
    int dormir;
    int min_bano;
    
    protected static void setComer(String alimento){
        System.out.println("Hoy se comio: "+alimento);
    }
    
    private void setDormir(int dormir){
        this.dormir = dormir;
    }
    
    public void setTomarShower(int min_bano){
        this.min_bano = min_bano;
    }
    
    public int getTomarShower(){
        return min_bano;
    }
}
public class MiOtraPersona {
    public static void main(String[] args) throws Exception{
        Persona perso = new Persona();
        Rutinas hacer = new Rutinas();
        
        perso.setEdad(20);
        perso.setEstatura(1.80);
        perso.setOrigen("Chiapas");
        perso.setPeso(78);
        perso.setSexo("Hombre");
        
        
        hacer.setTomarShower(20);
        Method method = Rutinas.class.getDeclaredMethod("setDormir", int.class);
        method.setAccessible(true);
        method.invoke(hacer, 3);
        
        System.out.println("Edad: "+perso.getEdad());
        System.out.println("Estatura: "+perso.getEstatura());
        System.out.println("Origen: "+perso.getOrigen());
        System.out.println("Peso: "+perso.getPeso());
        System.out.println("Sexo: "+ perso.getSexo());
        System.out.println("Los minutos que tardo banadose fueron: "+hacer.getTomarShower());
        System.out.println("Las horas que durmio fueron: "+hacer.dormir);
        hacer.setComer("Pizza");
    }
    
}
