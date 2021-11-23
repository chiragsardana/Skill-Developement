const express = require("express");
const router = express.Router();
const { orders } = require("../../controllers/order");
const { DETAILS, HISTORY } = require("../../utils/config").ROUTES.ORDER;
router.get(DETAILS + "/:orderid", orders);
module.exports = router;
