fun main(){
    var vehicle=Car("Ferrari","512BB","Red",5)
    vehicle.carry(6)
    vehicle.identity()
    println(vehicle.calculateParkingFees(4))
    var transport=Bus("Hundai","Coastor","White",32)
    println(transport.maxTripFare(500.0))
    println(transport.calculateParkingFees(2))

}

  open class Car( var make:String,var model:String,var color:String,var capacity:Int) {
      fun carry(people: Int) {
          if (people <= capacity) {
              println("carrying $people passengers")
          } else if (people >= capacity) {
              var exceed = people - capacity

              println("over capacity by $exceed people")
          }
      }

      fun identity() {
          println("I am a $color $make $model")
      }

    open fun calculateParkingFees(hours: Int): Int {
          var ParkingFees = hours * 20
          return ParkingFees
      }
  }
class Bus( make:String, model:String, color:String, capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        var maximumAmountFare=capacity*fare
        return maximumAmountFare
    }
    override fun calculateParkingFees(hours: Int):Int{
        var ParkingFees=capacity*hours
        return ParkingFees
    }
}





