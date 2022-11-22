package negocio;

import negocio.aluno.Aluno;

public class Fachada implements IFachada{
  private ControladorAluno controladorAluno;

  public Fachada(){
    this.controladorAluno = new ControladorAluno();
  }

  @Override
  public void inserirAluno(Aluno aluno) {
    this.controladorAluno.inserirAluno(aluno);
  }

  @Override
  public void alterarAluno(Aluno aluno) {

  }

  @Override
  public void removerAluno(String matricula) {

  }

  @Override
  public Aluno buscarAluno(String matricula) {
    return null;
  }
}
