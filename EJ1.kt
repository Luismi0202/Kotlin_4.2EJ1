/*
Ejercicio 4.1
Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

Opcionalmente se puede crear el metodo toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
 */
class Rectangulo(var base: Double, var altura: Double){
    init {
        require(base > 0.0) { "La base debe ser mayor que 0" }
        require(altura > 0.0) { "La altura debe ser mayor que 0" }
    }
    var area = calcularArea(base,altura)
    var perimetro = calcularPerimetro(base,altura)

    override fun toString(): String {
        return "Area: ${this.area} Perimetro: ${this.perimetro}"
    }
}

fun calcularArea(base:Double, altura:Double):Double{
    var area = 0.0
    area = base * altura
    return area
}

fun calcularPerimetro(base:Double,altura:Double):Double{
    var lados1 = 0.0
    var lados2 = 0.0
    lados1 =  base * 2
    lados2 = altura * 2
    return lados1 + lados2
}

fun mostrarRectangulos(Rectangulos:List<Any>){
    var contador = 0
    for(Rectangulo in Rectangulos){
        contador+=1
        println("Rectangulo$contador -> $Rectangulo")
    }
}

fun main(){
    var rectangulos:MutableList<Any> = mutableListOf()
    val Rectangulo1 = Rectangulo(1.7,5.6)
    val Rectangulo2 = Rectangulo(5.0,6.7)
    val Rectangulo3 = Rectangulo(7.1,2.5)
    rectangulos.addAll(listOf(Rectangulo1, Rectangulo2, Rectangulo3))
    mostrarRectangulos(rectangulos)
}