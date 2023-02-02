public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        //Setters
        miPersona.setEdad(25);
        miPersona.setNombre("Pipo Pescador");
        miPersona.setTelefono("0303-345");
        //Salida por consola con Getters
        System.out.println("La persona tiene " + miPersona.getEdad() + " años");
        System.out.println("La persona se llama " + miPersona.getNombre());
        System.out.println("Su número telefónico es: " + miPersona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}