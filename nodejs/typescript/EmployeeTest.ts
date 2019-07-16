import { Employee, Address } from './Employee'
let addrees1 = new Address('surat', 'gujarat');
let employee1 = new Employee(101, 'vivek', addrees1);
console.log(employee1);
console.log("Old Id : " + employee1.Id);
employee1.Id = 100;
console.log("New Id : " + employee1.Id);

