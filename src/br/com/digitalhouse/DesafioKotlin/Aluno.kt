package br.com.digitalhouse.DesafioKotlin

class Aluno (var codigoAluno: Int,var nome:String,var sobrenome:String) {

    override fun equals(aluno: Any?): Boolean {
        aluno as Aluno
        return this.codigoAluno == aluno.codigoAluno
    }


}