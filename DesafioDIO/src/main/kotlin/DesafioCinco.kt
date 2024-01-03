class User(val id: Int, val name: String)

/*
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object)
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

    private val users = mutableListOf<User>()
    private var nextUserId = 1

    fun addUser(name: String) {
        val newUser = User(nextUserId++,name)
        users.add(newUser)
        //TODO("Implementar a lógica de adicionar um novo usuário na lista mutável $users.")
    }

    fun listUsers() {
        for(func in users){
            println("${func.id} - ${func.name}")
        }
        //TODO("Implementar a impressão dos $users, seguindo o padrão definido no enunciado.")
    }
}

fun main() {
    print("Digite a quantidade de usuarios que deseja cadastrar: ")
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        print("Digite o nome do usuario ${i}: ")
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }
    println("Lista de Usuarios cadastrados: ")
    UserManager.listUsers()
}