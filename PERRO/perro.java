public class perro {

    private String nombre;
    private String raza;
    private String ladrido = "woof";
    private Double peso;

public perro(String n,String r, Double peso){
    this.nombre = n;
    this.raza = r;
    this.peso = peso;
}
public perro(String n,String r,String ladrido, Double peso){
    this.nombre = n;
    this.raza = r;
    this.ladrido = ladrido;
    this.peso = peso;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String getRaza(){
    return raza;
}
public void setRaza(String raza){
    this.raza = raza;
}
public Double getPeso(){
    return peso;
}
public void setPeso(Double peso){
    this.peso = peso;
}
public Ladrar(){
    System.out.printl(ladrido);
}
public void Ladrar(String ladrido){
    System.out.printl(ladrido);
}
}