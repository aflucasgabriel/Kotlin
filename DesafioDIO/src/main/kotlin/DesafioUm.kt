/*
object ReceitaFederal{
    fun calcularImposto(salario: Double): Double{
        var aliquota = when{
            (salario >= 0 && salario <= 1100) -> 0.05F
            (salario > 1100 && salario <= 2500) -> 0.10F
            else -> 0.15F
        }
        return aliquota * salario
    }
}

fun main(){
    val valorSalario = readLine()!!.toDouble();
    val valorBeneficios = readLine()!!.toDouble();

    val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
    val saida = valorSalario - valorImposto + valorBeneficios;

    println(String.format("%.2f", saida))

}
*/
fun main() {
    val media = readLine()!!.toDouble();

    when {
        media < 5 -> println("REP");
        media >= 5 && media < 7 -> println("REC");
        else -> println("APR");
    }
}