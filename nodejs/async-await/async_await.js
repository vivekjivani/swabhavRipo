function add(number1, number2){
    return new Promise( (resolve, reject) => {
        if(number1<0 || number2<0){
            reject({ error : 'invalied number' });
        }else{
            resolve(number1+number2);
        }
    } );
}

async function main(){
    console.log('inside Main');
    
    console.log('befor result');
    let r1 = await add(1,2);
    console.log('after result');
    console.log(r1);
}

main();

console.log('End of Program');
