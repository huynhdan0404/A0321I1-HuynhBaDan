function currency() {
    let a = document.getElementById('fcurrency').value;
    let b = document.getElementById('tcurrency').value;
    if (a == 'vn') {
        document.getElementById('tcurrency').value = 'usd';
    }else{
        document.getElementById('tcurrency').value = 'vn';
    };
}
function convert() {
    let amount = document.getElementById('amount').value;
    let fcurrency = document.getElementById('fcurrency').value;
    let tcurrency = document.getElementById('tcurrency').value;
    if (fcurrency == 'vn' && tcurrency == 'usd') {
            document.getElementById('kq').innerHTML = 'Result: ' + amount /   23000 + ' USD';

    };
    if (fcurrency == 'usd' && tcurrency == 'vn') {
            document.getElementById('kq').innerHTML= 'Result: ' + amount * 23000 + ' VND'
    };
}

