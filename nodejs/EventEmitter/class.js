'use strict';
let EventEmitter = require('events');
class Account extends EventEmitter {
    constructor(accountNumber, name, balance) {
        super();
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.MIN_BALANCE = 500;
    }

    displayInfofunction() {
        console.log('accountNumber : ' + this.accountNumber);
        console.log('name : ' + this.name);
        console.log('balance : ' + this.balance);
    }

    deposit(amount) {
        console.log('--------------------------------');
        console.log('Deposit : ' + amount);
        this.balance += amount;
        this.emit('balanceChanged', this.balance);
    }

    withdrawal(amount) {
        console.log('--------------------------------');
        console.log('withdrawal : ' + amount);
        if ((this.balance - amount) <= this.MIN_BALANCE) {
            console.log('Insufficient Balance');
            return;
        }
        this.balance -= amount;
        this.emit('balanceChanged', this.balance);
    }
}


module.exports = Account;