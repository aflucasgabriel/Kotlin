// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
/*
enum class Nivel {BASICO, INTERMEDIARIO, AVANCADO}
enum class duracao { QUINZE, TRINTA, SESSENTA}

data class Usuario (val nome: String)

data class ConteudoEducacional(val nome: String, val duracaoConteudo: duracao, val nivelConteudo: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivelFormacao: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun imprimirAlunos(){
        for (aluno in inscritos){
            println(aluno.nome)
        }
    }
    fun imprimirConteudo(): {
        for (cont in conteudos){
            println("${cont.nome}, ${cont.duracaoConteudo}, ${cont.nivelConteudo}")
        }
    }
}

fun main() {

    val conteudoInicial = ConteudoEducacional("Introdução a Java", duracaoConteudo = duracao.QUINZE, nivelConteudo = Nivel.BASICO)
    val conteudoIntermediario = ConteudoEducacional("Herança", duracaoConteudo = duracao.TRINTA, nivelConteudo = Nivel.INTERMEDIARIO)
    val conteudoAvancado = ConteudoEducacional("Estruturas de Dados", duracaoConteudo = duracao.SESSENTA, nivelConteudo = Nivel.AVANCADO)

    val listaDeConteudos = mutableListOf<ConteudoEducacional>()
        listaDeConteudos.add(conteudoInicial)
        listaDeConteudos.add(conteudoIntermediario)
        listaDeConteudos.add(conteudoAvancado)


    val formacao1 = Formacao("Curso de Java Para Iniciantes", listaDeConteudos, nivelFormacao = Nivel.BASICO )
    val formacao2 = Formacao("Herança em Kotlin", listaDeConteudos, nivelFormacao = Nivel.INTERMEDIARIO )
    val formacao3 = Formacao("Estrutura de Dados em C", listaDeConteudos, nivelFormacao = Nivel.BASICO )

    val lucas = Usuario("Lucas")
    val maria = Usuario("Maria")
    val joao = Usuario("João")

    formacao1.matricular(lucas)
    formacao2.matricular(maria)
    formacao3.matricular(joao)

    println("====================================")
    println("Formação 1")
    println("====================================")

    println("INFORMAÇÕES")
    println("${formacao1.nome} - ${formacao1.nivelFormacao}")
    println("Conteudo da Formação:")
    println(formacao1.imprimirConteudo())
    println("Alunos Matriculados na Formação:")
    println(formacao1.imprimirAlunos())

    println("====================================")
    println("Formação 2")
    println("====================================")
    println("${formacao2.nome} - ${formacao2.nivelFormacao}")
    println("Conteudo da Formação:")
    println(formacao2.imprimirConteudo())
    println("Alunos Matriculados na Formação:")
    println(formacao2.imprimirAlunos())

    println("====================================")
    println("Formação 3")
    println("====================================")
    println("${formacao3.nome} - ${formacao3.nivelFormacao}")
    println("Conteudo da Formação:")
    println(formacao3.imprimirConteudo())
    println("Alunos Matriculados na Formação:")
    println(formacao3.imprimirAlunos())



}

 */