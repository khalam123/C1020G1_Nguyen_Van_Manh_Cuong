let num = document.getElementById('text');
let fromcurrent = document.getElementById('fromcur');
let tocurrent = document.getElementById('tocur');
function convert() {
    let result;
    if (fromcurrent.value == "VietNam" ) {
        if(tocurrent.value == "USD") {
            result = parseInt(num.value) / 23000 + "$";
        }else{
            result = num.value + "VNĐ";
        }
    }else{
        if(tocurrent.value == "VietNam") {
            result = parseInt(num.value) * 23000 + "VNĐ";
        }else{
            result = num.value + "$";
        }
    }
    document.getElementById('result').innerHTML = "Result = " + result ;

}