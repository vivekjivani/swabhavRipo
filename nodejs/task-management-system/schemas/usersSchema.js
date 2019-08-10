let mongoose = require('mongoose');
let schema = mongoose.Schema;

let usersSchema = new schema({
    userName: {
        type: String,
        unique: true,
        required: [true, 'Why not UserName?'],
        trim: true
    },
    gender: {
        type: String,
        enum: ['Male', 'Female', 'Other'],
        trim: true
    },
    birthDate: Date,
    phone: {
        type: Number,
        unique: true,
        maxlength: 10,
        required: [true, 'Why not Phone number?']
    },
    emailId: {
        type: String,
        unique: true,
        required: [true, 'Why not Email?'],
        trim: true
    },
    address: {
        street: String,
        city: String,
        state: String,
        country: String,
    },
    password: {
        type: String,
        required: [true, 'Why not Password?'],
        trim: true
    },
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

let UserModel = mongoose.model('user', usersSchema);
module.exports = UserModel;