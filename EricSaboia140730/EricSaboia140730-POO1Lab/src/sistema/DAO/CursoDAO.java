package sistema.DAO;

import java.util.ArrayList;

import sistema.modelos.Curso;

public class CursoDAO {
	private ArrayList<Curso> cursos = new ArrayList<Curso>();

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void salvar(Curso curso){
		cursos.add(curso);
	}
	
	//Retonar o curso com ID idCurso
	public Curso getCursoById (int idCurso)
	{
		for(int i=0; i< cursos.size(); i++)
			if(idCurso == cursos.get(i).getCodigo())
				return cursos.get(i);
		
		return null;
	}

}
