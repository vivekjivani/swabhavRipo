const MongoClient = require('mongodb').MongoClient;
const uri = "mongodb+srv://admin:root@cluster0-sjbot.mongodb.net/test?retryWrites=true&w=majority";
const client = new MongoClient(uri, { useNewUrlParser: true });
client.connect((err) => {
    if (err) {
        throw err;
    }
    console.log('Connected');
    const collection = client.db("task_managemnet_system").collection("user");
    collection.insertOne(data,(result)=>{
        console.log(result);
    });
    client.close();
});