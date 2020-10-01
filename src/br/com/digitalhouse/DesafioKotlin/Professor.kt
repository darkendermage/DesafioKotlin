package br.com.digitalhouse.DesafioKotlin

abstract class Professor (var nome: String,var sobrenome: String,var tempoCasa: Int,var codigoProfessor: Int) {

        override fun equals(p: Any?): Boolean {
            p as Professor
            return this.codigoProfessor == p.codigoProfessor
        }
}