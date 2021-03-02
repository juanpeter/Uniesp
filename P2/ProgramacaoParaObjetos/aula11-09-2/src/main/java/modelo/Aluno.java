package modelo;

public class Aluno {
    
    //1.Pensar nos atributos
    //nome, matricula, curso
    //final torna o atributo constante (ele não varia)
    private final String nome;
    private double matricula;
    private String curso;
    
    //2.Pensar Construtor
    //é ele quem vai permitir a criação dos objetos
    public Aluno(String n, double m, String c) {
        this.nome = n;
        this.matricula = m;
        this.curso = c;
    }
    
    public String matricularAluno() {
        //operações
        return (this.nome + " foi matriculado");
    }
}
