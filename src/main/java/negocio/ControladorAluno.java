package negocio;

import dados.IRepositorioAluno;
import dados.RepositorioAluno;
import negocio.aluno.Aluno;

public class ControladorAluno {
  private IRepositorioAluno repositorioAluno;

  public ControladorAluno(){
    this.repositorioAluno = new RepositorioAluno();
  }

  public void inserirAluno(Aluno aluno) {
    this.repositorioAluno.inserirAluno(aluno);
  }

}
