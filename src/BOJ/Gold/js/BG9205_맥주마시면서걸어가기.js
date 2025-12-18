let input = require('fs').readFileSync('../example/맥주마시면서걸어가기예제.txt').toString().trim().split('\r\n');
let testCaseQty=input[0];
let conStoreQty=input[1];

for (let i = 0; i < testCaseQty*5; i+=5) {
    let home=input[3+i].split(' ').map(Number);
    let conStore=input[4+i].split(' ').map(Number);
    let festival=input[5+i].split(' ').map(Number);

    let toFes = Math.abs(festival[0]-home[0])+Math.abs(festival[1]-home[1]);
    let toCon = Math.abs(conStore[0]-home[0])+Math.abs(conStore[1]-home[1]);
    let conToFes = Math.abs(conStore[0]-festival[0])+Math.abs(conStore[1]-festival[1]);
    if(toFes/50>20) {
        if (toCon/50>20){
            console.log("sad");
        }else if (conToFes/50>20) {
            console.log("sad");
        }else {
            console.log("happy");
        }
    }else{
        console.log("happy")
    }
}


