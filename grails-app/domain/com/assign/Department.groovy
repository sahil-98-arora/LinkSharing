package com.assign

class Department {

    String departmentName
    long departmentId
    String location

    static hasMany = [employees : Employee]

    static constraints = {
        departmentName nullable: false, maxSize:255
        departmentId nullable: false, unique: true,generator: 'uuid'
        location nullable: false, maxSize: 255
    }
}
