import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args){
        Queue<String> fila = new LinkedList<>();
        fila.offer("Alice");
        fila.offer("Bob");
        fila.offer("Carol");
        
        System.out.println("Próximo a ser atendido: " + fila.peek());
        
        while (!fila.isEmpty()){
            System.out.println("Atendendo: " + fila.poll());
        }
        
        
    }


}
