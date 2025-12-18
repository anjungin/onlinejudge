// let input = require('fs').readFileSync('../example/백도어예제.txt').toString().trim().split('\r\n');
// let pointQty=input[0].split(' ').map(Number)[0]; //분기점 개수
// let way=input[0].split(' ').map(Number)[1]; //길 개수
// let eyesight=input[1].split(' ').map(Number); //시야
// let wayList=[]//길 리스트
// let payList=[]
// let time=0;
//
// for (let i = 0; i < way; i++) {
//     wayList[i]=[];
//     wayList[i][0]=input[i+2]?.split(' ').map(Number)[0];
//     wayList[i][1]=input[i+2]?.split(' ').map(Number)[1];
//     wayList[i][2]=input[i+2]?.split(' ').map(Number)[2];
// }
//
// for (let i = 0; i < pointQty; i++) {
//     for (let j = 0; j < pointQty; j++) {
//         if (i==0) payList[j]=(wayList.find(v=>v[0]==i&&v[1]==j)?.[2]) ?? 0;
//         else {
//             let total=0;
//             let pay=(wayList.find(v=>v[0]==i&&v[1]==j)?.[2]) ?? 0;
//             if (payList[j])
//         }
//     }
// }
//
// console.log(payList)
//
//
