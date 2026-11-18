public class Libro {

    public String titulo = "";
    public String autor = "";
    public int anio = 0;

    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public void mostrarInfoLibro(){
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El autor del libro es: "+autor);
        System.out.println("El año que salio fue: "+anio);
    }

}
