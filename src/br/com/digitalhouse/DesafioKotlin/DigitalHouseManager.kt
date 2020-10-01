package br.com.digitalhouse.DesafioKotlin

import java.util.*

class DigitalHouseManager {
        var listaAlunos = mutableListOf<Aluno>()
        var listaProfessores = mutableListOf<Professor>()
        var cursos= mutableListOf<Curso>()
        var matriculas= mutableListOf<Matricula>()

    //Funções curso
    fun registraCurso(nome: String, codigoCurso: Int, qtdeMaxAlunos: Int) {
        val curso = Curso(codigoCurso,qtdeMaxAlunos,nome)
        cursos.add(curso)
        println("Curso Registrado com o código:  ${curso.codigoCurso}")
    }

    fun excluiCurso(codigoCurso: Int) {
        for (curso in cursos) {
            if (curso.codigoCurso == codigoCurso) {
                cursos.remove(curso)
                println("Curso de código: ${curso.codigoCurso} removido com sucesso.")
            }
        }
    }


    //Funções aluno
    fun registraAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(codigoAluno, nome, sobrenome)
        listaAlunos.add(aluno)
        println("Aluno registrado com o código: ${aluno.codigoAluno}")
    }

    fun matriculaAluno(codigoAluno: Int, codigoCurso: Int) {
        for (aluno in listaAlunos) {
            if (aluno.codigoAluno == codigoAluno) {
                for (curso in cursos) {
                    if (curso.codigoCurso == codigoCurso) {
                        var matricular = Matricula(aluno, curso, Date())
                        matriculas.add(matricular)
                        println("Matrícula realizada com sucesso no curso: ${curso.nome}")
                    }
                }
            }
        }
    }



    //Funções Professor
    fun registraProfAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, qtdeHoras: Int) {
        val adjunto = ProfessorAdjunto(nome, sobrenome, tempoDeCasa = 0, codigoProfessor, qtdeHoras)
        listaProfessores.add(adjunto)
        println("Professor Adjunto Registrado com o código:  ${adjunto.codigoProfessor}")
    }

    fun registrarProfTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val titular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaProfessores.add(titular)
        println("Professor Titular registrado com o código:  ${titular.codigoProfessor}")
    }

    fun excluiProf(codigoProfessor: Int){
        listaProfessores.removeAll{ it.codigoProfessor == codigoProfessor }
        println("Professor com código $codigoProfessor excluído com êxito.")
    }

    fun alocarProf(codigoCurso: Int, codProfTitulares: Int, codProfAdjuntos: Int) {
        for (professor in listaProfessores) {
            if (professor.codigoProfessor == codProfTitulares) {
                for (curso in cursos) {
                    if (curso.codigoCurso == codigoCurso) {
                        professor as ProfessorTitular
                        curso.profTitular == professor
                        println("Professor Titular foi Alocado.")}
                }
            }
            if (professor.codigoProfessor == codProfAdjuntos) {
                        for (curso in cursos) {
                            if (curso.codigoCurso == codigoCurso) {
                                professor as ProfessorAdjunto
                                curso.profAdjunto == professor
                                println("Professor Adjunto foi Alocado.")
                            }
                        }
            }
        }
    }
}