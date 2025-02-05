package candidatura;

import java.util.List;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        List<Candidato> candidatos = CadastroCandidato.registrarCandidatos();
        selecaoCandidatos(candidatos);
    }

    static void selecaoCandidatos(List<Candidato> candidatos){

        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        
        for (Candidato candidato : candidatos) {
            System.out.println("O candidato " + candidato.getNome()+ " solicitou este valor de salario: " + candidato.getSalarioPretendido());

            if (salarioBase >= candidato.getSalarioPretendido()) {
                System.out.println("O candidato " + candidato.getNome() + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            if (candidatosSelecionados >= 5){
                break;
            }

        }
        /*      
         while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ValorPretendido.valorPretendido();
            
            System.out.println("O candidato "+ candidato + " solicitou este valor de salario: " +salarioPretendido);
            if(salarioBase>= salarioPretendido) {
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        */
    }
}
