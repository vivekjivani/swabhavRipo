let Account = require('./class');

let acccount = new Account(123, 'vivek', 1000);

acccount.on('balanceChanged', (newBalance) => {
    console.log('balance changed : ' + newBalance);
});

acccount.displayInfofunction();

acccount.deposit(1000);

acccount.withdrawal(200);

