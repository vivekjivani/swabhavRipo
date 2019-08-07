'use strict';
let mysql = require('mysql');
let sql = '';
class EmployeeService {
    constructor() {
        this.contactList = [];
        this.conn = mysql.createConnection({
            host: "localhost",
            user: "root",
            password: "root",
            database: "swabhav"
        });
        // this.getAllEmployee();
        // this.getEmployeeById(7369);
    }

    getAllEmployee() {
        return new Promise((resolve, reject) => {
            sql = 'select e.EMPNO,e.ENAME,e.JOb,e.MGR,e.HIREDATE,e.SAL,e.COMM,d.DNAME as DEPT from EMP as e join DEPT as d on e.DEPTNO = d.DEPTNO';
            this.conn.query(sql, (err, result) => {
                if (err) {
                    reject(err);
                }
                // console.log(result);
                resolve(result);
            })
        });
    }

    getAllDepartment() {
        return new Promise((resolve, reject) => {
            sql = 'select * from DEPT';
            this.conn.query(sql, (err, result) => {
                if (err) {
                    reject(err);
                }
                resolve(result);
            });
        });
    }

    getDepartmentById(id) {
        return new Promise((resolve, reject) => {
            sql = 'select * from DEPT where DEPTNO = ' + id;
            this.conn.query(sql, (err, result) => {
                if (err) {
                    reject(err);
                }
                resolve(result);
            });
        });
    }

    getEmployeeById(employeeId) {
        return new Promise((resolve, reject) => {
            sql = 'select * from EMP as e join DEPT as d on e.DEPTNO = d.DEPTNO where e.EMPNO = ' + employeeId;
            this.conn.query(sql, (err, result) => {
                if (err) {
                    reject(err);
                }
                console.log(result);
                resolve(result);
            })
        });
    }

    getEmployeeInDepartment(id) {
        return new Promise((resolve, reject) => {
            sql = 'select d.*,e.* from DEPT as d join EMP as e on d.DEPTNO = e.DEPTNO where e.DEPTNO = ?';
            // values = [id];
            this.conn.query(sql, [id], (err, result) => {
                if (err) {
                    reject(err);
                }
                resolve(result);
            });
        });
    }

    addDepartment(department) {
        return new Promise((resolve, reject) => {
            sql = 'insert into DEPT values(?)';
            let values = [department.DEPTNO, department.DNAME, department.LOC];
            this.conn.query(sql, [values], (err, result) => {
                if (err) {
                    console.log(err);
                    reject(err);
                }
                resolve(department);
            });
        });
    }

    deleteDepartmentById(id){
        return new Promise((resolve, reject)=>{
            sql = 'delete from DEPT where DEPT.DEPTNO=?';
            let value = [id];
            this.conn.query(sql, value, (err, result)=>{
                if(err){
                    reject(err);
                }
                resolve(result);
            });
        });
    }

    addEmployee(employee) {
        return new Promise((resolve, reject) => {
            sql = 'insert into EMP values(?)';
            let values = [employee.EMPNO, employee.ENAME, employee.JOB, employee.MGR, employee.HIREDATE, employee.SAL, employee.COM, employee.DEPTNO];
            this.conn.query(sql, [values], (err, result) => {
                if (err) {
                    reject(err);
                }
                resolve(employee);
            });
        });
    }

    deleteEmployeeById(dId,eId){
        return new Promise((resolve, reject)=>{
            sql = 'delete from EMP where EMP.EMPNO=?';
            let value = [eId];
            this.conn.query(sql, value, (err, result)=>{
                if(err){
                    reject(err);
                }
                resolve(result);
            });
        });
    }
}

let service = new EmployeeService();
module.exports = service;