const { SUCCESS, SERVER_ERROR, NOT_FOUND } =
  require("../utils/config").STATUS_CODES;
const messageBundle = require("../locales/en");
const userOperations = require("../db/services/user_crud");
const userController = {
  show(request, response) {
    response.send("U r on Show Section");
  },
  async login(request, response) {
    const user = request.body;
    try {
      const doc = await userOperations.login(user);
      if (doc) {
        response
          .status(SUCCESS)
          .json({ message: messageBundle["login.welcome"], name: doc.name });
      } else {
        response
          .status(NOT_FOUND)
          .json({ message: messageBundle["login.invaliduser"] });
      }
      console.log("JSON is ", json);
    } catch (err) {
      response
        .status(SERVER_ERROR)
        .json({ message: messageBundle["login.invaliduser"] });
    }
    // response.send("U r on Login Section " + JSON.stringify(json));
  },
  register(request, response) {
    // response.send("U r on Register Section");
    let userObject = {
      emailid: request.body.email,
      password: request.body.pwd,
      name: request.body.name,
    };
    const promise = userOperations.register(userObject);
    promise
      .then((doc) => {
        response
          .status(SUCCESS)
          .json({ message: messageBundle["register.welcome"], doc: doc });
      })
      .catch((err) => {
        response
          .status(SERVER_ERROR)
          .json({ message: messageBundle["register.fail"] });
      });
  },
};

module.exports = userController;
