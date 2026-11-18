public class LibroDigital extends Libro {

    public String formato = "";
    public double tamanioMB = 0.0;

    public LibroDigital(String titulo, String autor, int anio, String formato, double tamanioMB){
        super(titulo, autor, anio);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    public void mostrarInfo(){
        System.out.println("El formato del Libro es: "+formato);
        System.out.println("El tamaño del archivo es:"+tamanioMB);
    }
}
