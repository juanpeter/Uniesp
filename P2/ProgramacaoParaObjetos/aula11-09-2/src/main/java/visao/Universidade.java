package visao;
 
import modelo.Aluno;

public class Universidade {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 444, "Sistemas para Internet");
        
        System.out.println(a1.matricularAluno());
        
        Aluno a2 = new Aluno("Marcos", 333, "sistemas para Internet");
        
        System.out.println(a1.matricularAluno());
        System.out.println(a2.matricularAluno());
    }
}
