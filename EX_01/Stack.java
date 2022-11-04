
import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> exercici1 = (LinkedList<T>) new LinkedList<String>();

    public Stack() {
        super();
    }


    public <T> void isEmpty() {
        if(exercici1.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            System.out.println("La lista no está vacía");
        }
    }

    public <T> void removeFirst() {
        System.out.println("El primer elemento de la lista "+ exercici1.removeFirst() + " ha sido eliminado");
    }

    public <T> void getFirst() {
        System.out.println("El primer elemento de la lista es: " +exercici1.getFirst());
    }

    public T add(T Pol){
        return Pol;
    }

    public String toString(){
        String contenido="";
        exercici1  = null;

        while(exercici1!=null){
            contenido+=isEmpty()+ "\n" + removeFirst()+ "\n" + getFirst()+ "\n" + add();

        }

        return contenido;
    }

}