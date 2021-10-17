package people
import hall.Tables
class Client(
    fullName: String,
    phone: String,
    personID: Int,
    tableID:Byte,
    var bsd: String
) : Person(fullName, phone , personID){

}