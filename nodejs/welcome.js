console.log("Welcome to nodejs");
//console.log(window);
console.log(global);
console.log(typeof global);

function1();
function function1(){
    console.log("inside function1");
}
var foo = "hello";
console.log(global);
console.log(this);
console.log(this == global);



