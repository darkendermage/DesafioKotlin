package br.com.digitalhouse.DesafioKotlin

fun main() {

    val adm = DigitalHouseManager()


    //Registrando alunos
    adm.registraAluno("Yuri", "Santini", 1)
    adm.registraAluno("Vinicius", "Ortega", 2)
    adm.registraAluno("Presidente", "Lula", 3)

    //Registrando professores titulares
    adm.registrarProfTitular("Wagner", "Souza", 1, "C#")
    adm.registrarProfTitular("Vitória", "Gonçalves", 2, "GITHub")

    //Registrando professores adjuntos
    adm.registraProfAdjunto("João", "Victor", 3, 10)
    adm.registraProfAdjunto("José", "de Jesus", 4, 99)

    //Registrando cursos
    adm.registraCurso("Full Stack", 20001, 3)
    adm.registraCurso("Android", 20002, 2)

    //Colocando professores titulares e adjuntos em determinado curso
    adm.alocarProf(20001, 1, 3)
    adm.alocarProf(20002, 2, 4)

    //Matricula de alunos nos cursos
    adm.matriculaAluno(1, 20001)
    adm.matriculaAluno(2, 20001)
    adm.matriculaAluno(1, 20002)
    adm.matriculaAluno(2, 20002)
    adm.matriculaAluno(3, 20002)

    println("")
    println("Removendo Curso ********")
    adm.excluiCurso(20001)

    println("")
    println("Removendo Professor *******")
    adm.excluiProf(1)

}