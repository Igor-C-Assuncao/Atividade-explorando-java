package negocio;

import negocio.aluno.Aluno;

public interface IFachada {

  public void inserirAluno(Aluno aluno);

  public void alterarAluno(Aluno aluno);

  public void removerAluno(String matricula);

  public Aluno buscarAluno(String matricula);
}
