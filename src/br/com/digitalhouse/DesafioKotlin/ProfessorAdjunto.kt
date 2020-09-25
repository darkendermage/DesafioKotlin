package br.com.digitalhouse.DesafioKotlin

class ProfessorAdjunto(override var nome: String,override var sobrenome: String,override var tempoDeCasa: Int, override var codigoProfessor: Int,var horasMonitoria: Int) : Professor {

    constructor()

    fun comparaProfessor(codigoProfessor: Int) {
        if(this.codigoProfessor == codigoProfessor)
            println("Os códigos são iguais.")
        else {
            println("Os códigos são de professores diferentes.")
        }

    }
}