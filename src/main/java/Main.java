import negocio.Fachada;
import negocio.IFachada;
import negocio.aluno.Aluno;
import negocio.aluno.Endereco;

public class Main {

  public static void main(String[] args) {
    Aluno aluno = new Aluno("001", "luisa",
        new Endereco("Rua da Moeda", 50));
    IFachada fachada = new Fachada();
    fachada.inserirAluno(aluno);
  }

}
