const mongoose = require("mongoose");
const dbOptions = {
  maxPoolSize: 5,
};
mongoose.connect("mongodb+srv://SBK:sardana80@shop-cluster.ezlft.mongodb.net/myFirstDatabase?retryWrites=true&w=majority", dbOptions, (err) => {
  if (err) {
    console.log("DB Connection Failed..", err);
  } else {
    console.log("Connection Created...");
  }
});
module.exports = mongoose;
