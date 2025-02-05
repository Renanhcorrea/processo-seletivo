package candidatura;

public class Candidato {
    private String nome;
    private double salarioPretendido;

    // Construtor
    public Candidato (String nome, double salarioPretendido){
        this.nome = nome;
        this.salarioPretendido = salarioPretendido;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }

    public double getSalarioPretendido() {
        return salarioPretendido;
    }
    
}
