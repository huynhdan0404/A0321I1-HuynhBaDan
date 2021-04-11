function cong() {
    let a = document.getElementById('number1').value;
    let b = document.getElementById('number2').value;
    let c = parseInt(a);
    let d = parseInt(b);
    document.getElementById('kq').innerHTML = 'ResultAddition:' + c + d ;
};
function tru() {
    let a = document.getElementById('number1').value;
    let b = document.getElementById('number2').value;
    let c = parseInt(a);
    let d = parseInt(b);
    document.getElementById('kq').innerHTML = 'Reult Subtraction:' + c - d ;
};
function nhan() {
    let a = document.getElementById('number1').value;
    let b = document.getElementById('number2').value;
    let c = parseInt(a);
    let d = parseInt(b);
    document.getElementById('kq').innerHTML = 'Reult Multiplication:' + c * d ;
};
function chia() {
    let a = document.getElementById('number1').value;
    let b = document.getElementById('number2').value;
    let c = parseInt(a);
    let d = parseInt(b);
    document.getElementById('kq').innerHTML = 'Reult Division:' + c / d ;
};