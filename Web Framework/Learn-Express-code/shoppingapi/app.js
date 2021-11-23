const { response } = require('express');
const express = require('express');
const app = express();// express function and its return an app, it creates a new app for our application



app.use(express.static('public'));//I m using a middleware

app.use('/', require('./routes/user'));


app.listen(9999, (err)=>{
    if(err){
        console.log("App Crash");
    }else{
        console.log("Server Started")
    }
})