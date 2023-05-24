package Nr2;

import java.util.List;
import java.util.ArrayList;

public class Numero_2_Entrega {

    public static void main(String[] args) {
        List<Mamifero> listaM = new ArrayList<Mamifero>();
        List<Peixe> listaP = new ArrayList<Peixe>();
        
        listaM.add(new Mamifero("Ovelha", 4, "Branco"));
        listaM.add(new Mamifero("Vaca", 4, "Preto e Branco"));
        
        listaP.add(new Peixe("Peixe Pedra", "Violento"));
        
        System.out.println("LISTA DOS MAMIFEROS");
        for(Mamifero m : listaM) {
            System.out.println(m);
        }
        System.out.println("\nLISTA DOS PEIXES");
        for (Peixe p : listaP) {
            System.out.println(p);
        }
        Tarefa.gravarObjecto(listaM, "Mamifero.dat");
        Tarefa.gravarObjecto(listaP, "Peixe.dat");
       
        System.out.println("LISTA DOS MAMIFEROS\n");
        List<Mamifero> obj = (List<Mamifero>) Tarefa.recuperarObjecto("Mamifero.dat");
        for (Mamifero m : obj) {
            System.out.println(m);
        }
        
        System.out.println("\nLISTA DOS PEIXES\n");
        List<Peixe> objP = (List<Peixe>) Tarefa.recuperarObjecto("Peixe.dat");
        for (Peixe p : objP) {
            System.out.println(p);
        }
    }
    
}
