public class App {
    public static void main(String[] args) throws Exception {

        LibroDigital librito = new LibroDigital("Indigo de ser humano", "Osamu Dazai", 1948, "PDF", 4.67);
        
        librito.mostrarInfoLibro();
        librito.mostrarInfo();
    }
}
