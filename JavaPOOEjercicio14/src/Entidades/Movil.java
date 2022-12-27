/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que 
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda 
almacenar cada producto con su información. Crear una entidad Movil con los atributos 
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será 
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número 
correspondiente al código. A continuación, se implementarán los siguientes métodos: 
* Un constructor por defecto. 
* Un constructor con todos los atributos como parámetro. 
* Métodos getters y setters de cada atributo. 
* Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
  instanciar un objeto Celular y poder cargarlo en nuestro programa. 
* Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/
package Entidades;

public class Movil {
    //Atributos
    private String marca;
    private int precio;
    private int modelo;
    private int memoriaRam;
    private int storage;
    private int [] codigo = new int[7];
    //Constructo por defecto
    public Movil() {
    }
    //Constructor con todos los atributos como parámetro
    public Movil(String marca, int precio, int modelo, int memoriaRam, int storage) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.storage = storage;
    }
    //Métodos getters y setters de cada atributo.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    //Metodo ToString

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + "$, modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + storage + "GB" + '}';
    }
    
}
