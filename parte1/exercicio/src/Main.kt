import kotlin.math.pow
import kotlin.math.sqrt

fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return 0.5 * base * altura
}

fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    val altura = (sqrt(3.0) / 2.0) * lado
    return calcularAreaTriangulo(lado, altura)
}

fun calcularAreaTrianguloIsoceles(base: Double, lado: Double): Double {
    val altura = sqrt(lado.pow(2) - (base / 2.0).pow(2))
    return calcularAreaTriangulo(base, altura)
}

fun calcularAreaTrianguloEscaleno(lado1: Double, lado2: Double, lado3: Double): Double {
    val semiPerimetro = (lado1 + lado2 + lado3) / 2.0
    val area = sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3))
    return area
}

fun calcularAreaCircunferencia(raio: Double): Double {
    return Math.PI * raio.pow(2)
}

fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2.0
}

fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) / 2.0) * altura
}

fun main() {
    val areaRetangulo = calcularAreaRetangulo(5.0, 10.0)
    println("Área do Retângulo: $areaRetangulo")

    val areaTriangulo = calcularAreaTriangulo(6.0, 8.0)
    println("Área do Triângulo: $areaTriangulo")

    val areaTrianguloEquilatero = calcularAreaTrianguloEquilatero(4.0)
    println("Área do Triângulo Equilátero: $areaTrianguloEquilatero")

    val areaTrianguloIsoceles = calcularAreaTrianguloIsoceles(5.0, 6.0)
    println("Área do Triângulo Isóceles: $areaTrianguloIsoceles")

    val areaTrianguloEscaleno = calcularAreaTrianguloEscaleno(7.0, 8.0, 9.0)
    println("Área do Triângulo Escaleno: $areaTrianguloEscaleno")

    val areaCircunferencia = calcularAreaCircunferencia(3.0)
    println("Área da Circunferência: $areaCircunferencia")

    val areaLosango = calcularAreaLosango(5.0, 7.0)
    println("Área do Losango: $areaLosango")

    val areaTrapezio = calcularAreaTrapezio(6.0, 4.0, 5.0)
    println("Área do Trapézio: $areaTrapezio")
}
