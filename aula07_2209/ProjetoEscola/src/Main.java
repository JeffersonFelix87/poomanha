

public class Main {
    public static void main(String[] args) {

        //Instanciar 03 alunos
        Aluno aluno1 = new Aluno();
        aluno1.setRa(1);
        aluno1.setNome("Ricardo");
        aluno1.setEmail("emaildoricardo@gmail.com");

        Aluno aluno2 = new Aluno(2, "12345");

        Aluno aluno3 = new Aluno(
                3,
                "Pedro",
                "emailpedro@gmail.com",
                "12345"
        );
        System.out.println(aluno1 + "\n");
        System.out.println(aluno2 + "\n");
        System.out.println(aluno3 + "\n");

    }
}