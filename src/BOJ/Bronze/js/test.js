let ip = require('fs').readFileSync('../example/test').toString().trim().split(' ');
let a=Number(ip[0]);
let b=Number(ip[1]);
console.log(a+b);
console.log(a-b);
console.log(a*b);
console.log(Math.trunc(a/b));
console.log(a%b);
