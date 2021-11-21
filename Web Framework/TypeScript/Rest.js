function Test() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var i = 0; i < names.length; i++) {
        console.log(names[i]);
    }
}
Test("X");
Test("Y", "Z");
