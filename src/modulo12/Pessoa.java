package modulo12;

public class Pessoa {
    private String nome;
    private char sexo; // 'M' para Masculino, 'F' para Feminino

    // Construtor
    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para sexo
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Método toString para exibir as informações da pessoa
    @Override
    public String toString() {
        return "Nome: " + nome + ", Sexo: " + sexo;
    }
}
