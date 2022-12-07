package Entidades;

/**
 *
 * @author tu
 */
public class Libro {
    //Atributos
    public long ISBN;
    public long NumPag;
    public String Titulo;
    public String Autor;
    //Constructor Vacio
    public Libro() {
    }
    //Constructor Con Parametros
    public Libro(int ISBN, int NumPag, String Titulo, String Autor) {
        this.ISBN=ISBN;
        this.NumPag = NumPag;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", NumPag=" + NumPag + ", Titulo=" + Titulo + ", Autor=" + Autor + '}';
    }
    
    
}
