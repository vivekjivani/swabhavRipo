"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Employee_1 = require("./Employee");
var addrees1 = new Employee_1.Address('surat', 'gujarat');
var employee1 = new Employee_1.Employee(101, 'vivek', addrees1);
console.log(employee1);
console.log("Old Id : " + employee1.Id);
employee1.Id = 100;
console.log("New Id : " + employee1.Id);
