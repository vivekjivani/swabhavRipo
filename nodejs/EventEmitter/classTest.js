let account = require('./class');

let account1 = new account(123, 'vivek', 1000);

account1.on('balanceChanged', (newBalance) => {
    console.log('balance changed : ' + newBalance);
});

account1.displayInfofunction();

account1.deposit(1000);

account1.withdrawal(200);

