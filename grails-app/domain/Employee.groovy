class Employee {
    String empName
    long empNumber
    String location

    static hasMany = [departments : Department]

    static constraints = {
        empName nullable: false, maxSize:255
        empNumber nullable: false
        location nullable: false, maxSize: 255
    }
}
