package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCandidato {
    public static List<Candidato> registrarCandidatos(){
        Scanner scanner = new Scanner(System.in);
        List<Candidato> candidatos = new ArrayList<>();

        System.out.println("Quantos candidatos quer cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o salario pretendido: ");
            double salarioPretendido = scanner.nextDouble();
            scanner.nextLine();

            candidatos.add(new Candidato(nome,salarioPretendido));
            
        }

        return candidatos;
    } 
}
