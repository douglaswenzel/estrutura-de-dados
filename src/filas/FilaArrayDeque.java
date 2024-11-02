import java.util.ArrayDeque;
import java.util.Queue;

public class FilaArrayDeque {
    public static void main (String[] args) {
        Queue<Integer> fila = new ArrayDeque<>();
        fila.offer(10);
        fila.offer(20);
        fila.offer(30);
        
        
        while (!fila.isEmpty()){
            System.out.println("Atendendo: " + fila.poll());
            
        }
        
        
        
        
    }
    
}
