package br.com.digitalhouse.DesafioKotlin

class ProfessorTitular(nome: String,sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int,var especialidade: String) : Professor(nome,sobrenome,tempoDeCasa,codigoProfessor) {

    override fun equals(professor: Any?): Boolean {
        professor as ProfessorTitular
        return this.codigoProfessor == professor.codigoProfessor
    }

}