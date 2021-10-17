package people

class Employee(
    fullName: String,
    phone: String,
    personID: Int,
    var typeOfWork:String
) : Person(fullName, phone , personID) {

}