const MongoClient = require('mongodb').MongoClient;
const uri = "mongodb+srv://admin:root@cluster0-sjbot.mongodb.net/test?retryWrites=true&w=majority";
const client = new MongoClient(uri, { useNewUrlParser: true });

class EmployeeDBService {
    constructor() {
        this.collection;
        this._connect();

    }
    _connect() {
        client.connect((err) => {
            if (err) {
                throw err;
            }
            console.log('Connected');
            this.collection = client.db("swabhav").collection("DEPT");
            this.getAllEmployee();
        });
    }

    addEmployee(dId, employee) {
        return new Promise((resolve, reject) => {
            this.collection.update(
                { DEPTNO: dId },
                { $push: { EMP: employee } }
            )
                .then(
                    (result) => {
                        resolve(employee);
                    }
                ).catch(
                    (err) => {
                        reject(err);
                    }
                );
        });
    }

    deleteEmployeeById(dId, eId) {
        eId = parseInt(eId);
        return new Promise((resolve, reject) => {
            this.collection.updateOne({ DEPTNO: dId }, { $pull: { 'EMP': { EMPNO: eId } } })
                .then(
                    (result) => {
                        // console.log(result);
                        resolve(result);
                    }
                )
                .catch(
                    (err) => {
                        // console.log(err);
                        reject(err);
                    }
                );
        });
    }

    deleteDepartmentById(dId) {
        return new Promise((resolve, reject) => {
            this.collection.remove({ DEPTNO: dId })
                .then(
                    (result) => {
                        resolve(result);
                    }
                ).catch(
                    (err) => {
                        reject(err);
                    }
                );
        });
    }

    addDepartment(department) {
        department['EMP'] = [];
        return new Promise((resolve, reject) => {
            this.collection.insertOne(department)
                .then(
                    (result) => {
                        resolve(result);
                    }
                )
                .catch(
                    (err) => {
                        reject(err);
                    }
                );
        });
    }

    getAllDepartment() {
        return new Promise((resolve, reject) => {
            this.collection.find({}, {
                projection: {
                    _id: 0,
                    DEPTNO: 1,
                    DNAME: 1,
                    LOC: 1
                }
            }).toArray(function (err, result) {
                if (err) {
                    reject(err);
                }
                // console.log(result);
                resolve(result);
            });
        });

    }

    getAllEmployee() {
        return new Promise((resolve, reject) => {
            this.collection.find({}, {
                projection: {
                    _id: 0,
                    EMP: 1
                }
            }).toArray(function (err, result) {
                if (err) {
                    reject(err);
                }
                let employee = [];
                result.forEach(element => {
                    element.EMP.forEach(element => {
                        employee.push(element);
                    });
                });
                resolve(employee);
            });
        });
    }

    getDepartmentById(dId) {
        return new Promise((resolve, reject) => {
            this.collection.find({ DEPTNO: dId }, {
                projection: {
                    _id: 0,
                    DEPTNO: 1,
                    DNAME: 1,
                    LOC: 1
                }
            }).toArray(function (err, result) {
                if (err) {
                    reject(err);
                }
                resolve(result);
            });
        });
    }

    getEmployeeInDepartment(dId) {
        return new Promise((resolve, reject) => {
            this.collection.find({ DEPTNO: dId }, {
                projection: {
                    _id: 0,
                    EMP: 1
                }
            }).toArray(function (err, result) {
                if (err) {
                    reject(err);
                }
                // resolve(result);
                let employee = [];
                result.forEach(element => {
                    element.EMP.forEach(element => {
                        employee.push(element);
                    });
                });
                resolve(employee);
            });
        });
    }

    getEmployeeById(dId, eId) {
        return new Promise((resolve, reject) => {

            this.collection.find({ DEPTNO: dId }, {
                projection: {
                    _id: 0,
                }
            }).toArray((err, result) => {
                if (err) {
                    reject(err);
                }
                let employee;
                result[0].EMP.forEach((element) => {
                    console.log(element.EMPNO + ' ' + eId);
                    if (element.EMPNO == eId) {
                        employee = element;
                    }
                })
                resolve(employee);
            });
        });
    }
}

const service = new EmployeeDBService();
module.exports = service;