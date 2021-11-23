const orders = (request, response) => {
  //const orderId = request.query.orderid; // QueryString Parameter
  const orderId = request.params.orderid; // Path Parameter
  response.send(new Date() + " OrderId Rec " + orderId);
};
const history = (request, response) => {
  response.send("History");
};
module.exports = { orders };
