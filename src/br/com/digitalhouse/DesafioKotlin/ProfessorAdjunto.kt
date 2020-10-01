package br.com.digitalhouse.DesafioKotlin

class ProfessorAdjunto(nome: String,sobrenome: String,tempoDeCasa: Int,codigoProfessor: Int,var horasMonitoria: Int) : Professor(nome,sobrenome,tempoDeCasa,codigoProfessor) {

    override fun equals(professor: Any?): Boolean {
        professor as ProfessorAdjunto
        return this.codigoProfessor == professor.codigoProfessor
    }
}