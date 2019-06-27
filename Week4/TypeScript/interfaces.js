"use strict";
var _this = this;
exports.__esModule = true;
var classes_1 = require("./classes");
var SuperRevature = /** @class */ (function () {
    function SuperRevature() {
    }
    return SuperRevature;
}());
var revature;
revature = { hasLearned: true, associates: [classes_1["default"]], curriculum: "Java", doThis: function () { console.log(_this.associates[0].getSsn()); } };
revature = { hasLearned: true, associates: [classes_1["default"]], curriculum: "Java", isFun: true };
console.log(classes_1["default"].getSsn);
