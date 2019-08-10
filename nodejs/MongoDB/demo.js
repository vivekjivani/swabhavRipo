const mongoose = require('mongoose')
const schema = mongoose.Schema
const uri = 'mongodb+srv://admin:root@cluster0-sjbot.mongodb.net/test?retryWrites=true&w=majority'




usersSchema = new schema({
  firstName: String,
  lastName: String,
  gender: {
    type: String,
    enum: ['Male', 'Female', 'Other'],
  },
  birthDate: Date,
  phone: {
    type: Number,
    max: 10,
    required: [true, 'Why not Phone number?'],
  },
  emailId: {
    type: String,
    required: [true, 'Why not Email?'],
  },
  address: {
    street: String,
    city: String,
    state: String,
    country: String,
  },
  password: String,
  isDelete: Boolean,
  Task: [
    {
      title: String,
      description: String,
      startDate: Date,
      dueDate: Date,
      assignee: String,
      priority: {
        type: String,
        enum: ['Important', 'Idel'],
      },
      tags: String,
      isCompleted: Boolean,
      SubTask: [
        {
          title: String,
          description: String,
          startDate: Date,
          dueDate: Date,
          assignee: String,
          isCompleted: Boolean
        }
      ]
    }
  ]
});


let vivek = new userModel({
  userid: 1,
  firstName: 'vivek',
  lastName: 'jivani',
  gender: 'male',
  birthDate: new Date(1998 - 04 - 03),
  phone: 9090909090,
  emailId: 'vivekjivani17@gmail.com',
  address: {
    street: '123 Nagardas St, andheri(E)',
    city: 'mumbai',
    state: 'maharashtra',
    country: 'India',
  },
  password: 'vivek@1122',
  isDelete: true,
});

mongoose.connect(uri, { useNewUrlParser: true }, (error) => {
  if (err) {
    throw error;
  }
  console.log('database connected');
});

let con = mongoose.connection;

vivek.save((err, result) => {
  if (err) {
    throw err;
  }
  console.log('Document Save');
});