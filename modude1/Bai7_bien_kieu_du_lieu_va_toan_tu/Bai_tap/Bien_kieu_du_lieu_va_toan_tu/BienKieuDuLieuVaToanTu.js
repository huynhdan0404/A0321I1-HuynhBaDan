let toan;
let hoa;
let ly;
toan = prompt('Nhap diem toan');
hoa = prompt('Nhap diem hoa');
ly = prompt('Nhap diem ly');
let a = parseInt(toan);
let b = parseInt(hoa);
let c = parseInt(ly);
let avg = (a + b + c)/3;

document.write('diem trung binh: ' + avg);
//
// let a;
// a = prompt('nhap gia tri');
// let b = parseInt(a);
// let f = b*9/5 + 32;
// document.write('gia tri' + f)