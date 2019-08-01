const MongoClient = require('mongodb').MongoClient;
const uri = "mongodb+srv://admin:root@cluster0-sjbot.mongodb.net/test?retryWrites=true&w=majority";
const client = new MongoClient(uri, { useNewUrlParser: true });
client.connect((err) => {
    if (err) {
        throw err;
    }
    console.log('Connected');
    const collection = client.db("Contact").collection("Contact");
    collection.find({}).toArray(function (err, result) {
        if (err) throw err;
        console.log(result);
    });
    client.close();
});