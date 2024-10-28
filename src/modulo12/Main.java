package modulo12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Mapa para armazenar as listas separadas por sexo
        Map<Character, List<Pessoa>> gruposPorSexo = new HashMap<>();
        gruposPorSexo.put('M', new ArrayList<>());
        gruposPorSexo.put('F', new ArrayList<>());

        Scanner scanner = new Scanner(System.in);

        // Loop para inserir as pessoas
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            // Criando o objeto Pessoa
            Pessoa pessoa = new Pessoa(nome, sexo);

            // Adicionando a pessoa ao grupo correspondente
            if (sexo == 'M' || sexo == 'F') {
                gruposPorSexo.get(sexo).add(pessoa);
            } else {
                System.out.println("Sexo inválido! Use 'M' para Masculino ou 'F' para Feminino.");
            }

            // Pergunta se quer adicionar outra pessoa
            System.out.print("Deseja adicionar outra pessoa? (s/n): ");
            continuar = scanner.nextLine();
        }

        scanner.close();

        // Exibindo as listas separadas por sexo
        System.out.println("\n--- Pessoas do Sexo Masculino ---");
        for (Pessoa pessoa : gruposPorSexo.get('M')) {
            System.out.println(pessoa);
        }

        System.out.println("\n--- Pessoas do Sexo Feminino ---");
        for (Pessoa pessoa : gruposPorSexo.get('F')) {
            System.out.println(pessoa);
        }
    }
}
