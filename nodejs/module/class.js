'use strict';
class Account {
    constructor(accountNumber, name, balance) {
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
        
        console.log('Deposit : '+amount);
        console.log('Old Balance : ' + this.balance);
        this.balance += amount;
        console.log('New Balance : ' + this.balance);
    }

    withdrawal(amount) {
        console.log('--------------------------------');
        console.log('withdrawal : '+amount);
        if (amount <= this.MIN_BALANCE) {
            console.log('Insufficient Balance');
            return;
        }
        console.log('Old Balance : ' + this.balance);
        this.balance -= amount;
        console.log('New Balance : ' + this.balance);
    }
}

module.exports = Account;