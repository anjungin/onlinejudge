let p = require('fs').readFileSync('../example/test').toString().trim().split(' ').map(Number);
let ascending=true;
let mixed=false;

p.forEach((v,idx)=>{
    if (v!=idx+1 && v!=8-idx) {
        ascending = false;
        mixed = true;
    } else if (v!=idx+1) {
        ascending = false;
    }
})

if (mixed){
    console.log("mixed")
}else if (ascending){
    console.log("ascending")
}else {
    console.log("descending")
}