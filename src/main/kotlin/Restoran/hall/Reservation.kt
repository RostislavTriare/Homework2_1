package hall

class Reservation(
    var listOfTables: Array<Tables>,
    var reserved:Boolean,
    var timeReservedFrom:Long,
    var timeReservedTo:Long
) {
}