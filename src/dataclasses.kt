fun main() {
 //var cars=
    carList(listOf(
        Cars("Toyota","Mazda","KBT-678",165),
        Cars("Toyota","Subaru","KAX-78",80),
        Cars("Isuzu","forester","KCA-68",555)
    ))

}
data class Cars(var make:String,var model:String,var registration:String,var speed:Int)
fun carList(cars:List<Cars>){
  var filtered=cars.filter {car -> car.speed >100}// filtering but making sure to pass a criteria
    //println(filtered)
    var filtered1=cars.filterNot { car -> car.make.startsWith("i") }
    println(filtered1)
    var sorted=cars.sortedByDescending { cars -> cars.make }
    println(sorted)
    var sorted1=cars.sortedBy { cars -> cars.model }
    println(sorted1)
    var max=cars.maxByOrNull { cars -> cars.speed }
    println(max)
}
