public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private Endereco endereco;
    private int idade;

    public Pessoa(String nome, String email, String telefone, Endereco endereco, int idade) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereco: " + endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) this.idade = idade;
        else throw new IllegalArgumentException("Idade invalida");
    }

    public void aniversario(){
        this.idade++;
    }

    public void setEndereco(Endereco endereco) {
        if(endereco == null){
            throw new IllegalArgumentException("Endereco invalido");
        } else{
            this.endereco = endereco;
        }
    }
}
