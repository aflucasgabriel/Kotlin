fun main() {
    print("Titulo: ")
    val titulo = readLine() ?: ""
    print("Autor: ")
    val autor = readLine() ?: ""

    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro:")

    val slug = println("${slugTitulo}_${slugAutor}")

    //TODO("Formatar/Imprimir as slugs considerando o padrão de saída deste desafio.")
}

fun String.generateSlug(): String {

    //TODO("Lógica para que qualquer String tenha a capacidade de gerar uma slug (seguindo-este-padrao).")
    return this
        .toLowerCase()
        .replace(Regex("[^a-zA-Z0-9]+"), "-")
        .replace(Regex("^- | -$"), "")



}