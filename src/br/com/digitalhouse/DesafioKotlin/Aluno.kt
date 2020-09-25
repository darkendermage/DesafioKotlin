package br.com.digitalhouse.DesafioKotlin

class Aluno (var codigoAluno: Int,var nome:String,var sobrenome:String) {


    constructor(nome:String,sobrenome:String,codigoAluno: Int) {
        if (this.codigoAluno == codigoAluno)
            println("Os códigos são iguais.")
        else {
            println("Os códigos são de cursos diferentes.")
        }
    }


}