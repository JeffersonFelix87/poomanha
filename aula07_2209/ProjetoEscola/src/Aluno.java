public class Aluno {
    private int ra;
    private String nome;
    private String email;
    private String senha;

    //construtores
    public Aluno(){

    }
    public Aluno(int ra, String senha){
        this.ra = ra;
        this.senha = senha;
    }
    public Aluno(int ra, String nome, String email, String senha){
        this(ra, senha);
        this.nome = nome;
        this.email = email;
    }

    //gets e sets
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Dados do aluno \n" +
                "Nome: " + nome + "\n" +
                "Ra: " + ra + "\n" +
                "Email: " + email + "\n";
    }
}
