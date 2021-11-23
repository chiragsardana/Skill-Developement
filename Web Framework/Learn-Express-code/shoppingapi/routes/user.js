const express = require('express');
const router = express.Router()
router.get('/show', (request,response)=>{
    response.send("U r on Show Section");
})
module.exports = router;