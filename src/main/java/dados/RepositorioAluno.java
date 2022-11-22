package dados;

import java.util.ArrayList;
import java.util.List;
import negocio.aluno.Aluno;

public class RepositorioAluno implements IRepositorioAluno{
  private List<Aluno> alunos;

  public RepositorioAluno(){
    this.alunos = new ArrayList<>();
  }

  @Override
  public void inserirAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }
}
