'use strict';

let mysql = require('mysql');

let con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    database: "swabhav"
});

con.connect(function (err) {

    if (err) throw err;
    console.log("Connected!");

    // let sql = "INSERT INTO DEPT VALUES('50','MANAGMENT','LA')"
    // let sql = "DELETE FROM DEPT "
    //             +" WHERE LOC='LA'";

    // let sql = "SELECT * FROM DEPT";

    // let sql = "UPDATE DEPT "
    //             +" SET LOC='LA' "
    //             +" WHERE LOC='WAKANDA'";

    // let sql = "SELECT employee1.ENAME AS EmployeeName, employee2.ENAME "
    //             +" AS Boss FROM EMP AS employee1 "
    //             +" LEFT JOIN EMP AS employee2 "
    //             +" ON employee1.MGR = employee2.EMPNO";

    // let sql ="SELECT T1.ENAME, T2.ENAME "
    //         +" AS BOSS FROM EMP AS T1 "
    //         +" JOIN EMP AS T2"
    //         +" ON T1.MGR = T2.EMPNO";

    let sql = "SELECT employee.ENAME, department.DNAME FROM EMP AS employee"
        + " JOIN DEPT AS department"
        + " ON employee.DEPTNO = department.DEPTNO";

    con.query(sql, function (err, result) {
        if (err) throw err;
        console.log("Query Executed..");
        console.log(result);
    });

    con.end();
});

console.log('End Of Program');