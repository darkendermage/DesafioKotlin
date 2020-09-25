package br.com.digitalhouse.DesafioKotlin


class Curso (var codigoCurso: Int,var qtdeMaxAlunos: Int,var nome:String) {

    var profTitular = ProfessorTitular()
    var profAdjunto = ProfessorAdjunto()
    var listaAlunos = mutableListOf<Aluno>()

    constructor(nome:String,sobrenome:String,codigoCurso: Int) {
        if(this.codigoCurso == codigoCurso)
            println("Os códigos são iguais.")
        else {
            println("Os códigos são de cursos diferentes.")
        }
    }


}