fun someCondition() = true


fun main(){
    var a: String = "Inicio" // var quer dizer q é uma variável mutável
    println(a)

    a = "A mutavel"
    println(a)



    val b: Int = 6 // val é uma variável imutável.
    println(b)


    val c = 3
    println(c)

// uma variavel precisa ser iniciada, diferente do caso abaixo que sera atribuido um valor de acordo
// com o retorno da condição

    val d: Int

    if(someCondition()){
        d = 25
    }else{
        d = 35
    }

    println(d)



}