
import Entidades.Movil;
import Servicio.servicioMovil;

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
public class Principal {
    public static void main(String[] args) {
        //Se instancia un objeto auxiliar con las funciones del celular
        servicioMovil AU = new servicioMovil();
        //Se instancia un celular y se asigna las funciones antes creadas
        Movil M1 = AU.cargarCelular();
        //Se llama al metodo ingresar codigo para que el usuario ingrese el codigo del celular
        AU.ingresarCodigo(M1);
        //Se llama al metodo mostrar para ver que informacion se ingreso
        AU.mostrar(M1); 
    }   
}
