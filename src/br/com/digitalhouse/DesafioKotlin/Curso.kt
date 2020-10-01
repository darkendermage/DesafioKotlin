package br.com.digitalhouse.DesafioKotlin


class Curso (var codigoCurso: Int,var qtdeMaxAlunos: Int,var nome:String) {

    var profTitular : ProfessorTitular? = null
    val profAdjunto : ProfessorAdjunto? = null
    var listaAlunos = mutableListOf<Aluno>()

    override fun equals(curso: Any?): Boolean {
        curso as Curso
        return this.codigoCurso == curso.codigoCurso
    }

    fun adicionaAluno(aluno: Aluno): Boolean {
        return if(listaAlunos.size < qtdeMaxAlunos) {
            print("Aluno adicionado a aula com sucesso.")
            this.listaAlunos.add(aluno)
        } else {
            println("Esta aula está cheia,favor escolher outra.")
            false
        }
    }

    fun excluiAluno(aluno: Aluno) {
        listaAlunos.remove(aluno)
    }


}