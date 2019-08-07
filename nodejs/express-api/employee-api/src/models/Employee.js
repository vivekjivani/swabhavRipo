class Employee {
    constructor(employeeNumber, employeeName, employeeJob, employeeManager, hiredate, salary, commission, departmentNumber){
        this._employeeNumber = employeeNumber;
        this._employeeName = employeeName;
        this._employeeJob = employeeJob;
        this._employeeManager = employeeManager;
        this._hiredate = hiredate;
        this._salary = salary;
        this._commission = commission;
        this._departmentNumber = departmentNumber;
    };
    get employeeNumber(){
        return this._employeeNumber;
    }
    set employeeNumber(employeeNumber){
        this._employeeNumber = employeeNumber;
    }
    get employeeName(){
        return this._employeeName;
    }
    set employeeName(employeeName){
        this._employeeName = employeeName;
    }
    get employeeJob(){
        return this._employeeJob;
    }
    set employeeJob(employeeJob){
        this._employeeJob = employeeJob;
    }
    get employeeManager(){
        return this._employeeManager;
    }
    set employeeManager(employeeManager){
        this._employeeManager = employeeManager;
    }
    get hiredate(){
        return this._hiredate;
    }
    set hiredate(hiredate){
        this._hiredate = hiredate;
    }
    get salary(){
        return this._salary;
    }
    set salary(salary){
        this._salary = salary;
    }
    get commission(){
        return this._commission;
    }
    set commission(commission){
        this._commission = commission;
    }
    get departmentNumber(){
        return this._departmentNumber;
    }
    set departmentNumber(departmentNumber){
        this._departmentNumber =  departmentNumber;
    }
}

module.exports = Employee;