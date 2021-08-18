import Cola.Cola;
import Lista.Lista;
import Lista.Nodo;

public class Main {
   public static void main(String[] args) {
        /*Lista lista = new Lista();
        System.out.println(lista.estaVacia());
        System.out.println(lista.tamano());


        for(int i=1; i<=11; i++)
        {
            lista.insertarFin(i);
        }
        lista.mostrarCircularAdelante(1);
        lista.mostrarReverso(1);

    */
       Cola cola = new Cola();
           System.out.println(cola.estaVacia());
           for (int i = 1; i <= 5; i++) {
               cola.insertarFin(i);
           } cola.mostrarCircularAdelante(1);



   }
}
