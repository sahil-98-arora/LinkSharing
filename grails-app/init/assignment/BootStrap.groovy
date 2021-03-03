package assignment

import com.assign.Department
import com.assign.Employee

class BootStrap {

    def destroy = {
    }
    
    def init = {
        new Employee(empName: "Sahil", empNumber: "123245234", location: "Noida").save(flush: true)
    }
}
