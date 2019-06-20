function add(x, y) {
    console.log("inside 2 params");
    return x + y;
}

function add(x, y, z) {
    console.log("inside 3 params");
    return x + y + z
}

function add() {
    console.log(arguments[0]);
    let ret = 0
    for (i of arguments) {
        ret += i
    }
    return //<------------------ semi-colon injection
    ret
}

let x = `this is a new 
string that is very long
and will span many lines`;