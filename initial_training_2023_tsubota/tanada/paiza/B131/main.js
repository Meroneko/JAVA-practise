process.stdin.resume();
process.stdin.setEncoding('utf8');
// 自分の得意な言語で
// Let's チャレンジ！！
var lines = [];
var reader = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});
reader.on('line', (line) => {
    lines.push(line);
});
reader.on('close', () => {
    //路線の数
    const lineNum = +lines[0].split(" ")[0];
    //運賃表を2次元配列に
    const stationMap = [];
    for (let i = 0; i < lineNum; i++) {
        stationMap.push(lines[i + 1].split(" ").map(Number));
    }
    //運賃
    let cost = 0;
    //出発駅
    let departureStation = 0;
    for (let i = lineNum + 2; i < lines.length; i++) {
        let arrivalInput = lines[i].split(" ");
        //到着路線
        arrivalLine = +arrivalInput[0] - 1;
        //到着駅
        arrivalStation = +arrivalInput[1] - 1;
        //到着路線の出発駅から到着駅の運賃の差額を絶対値に
        cost += Math.abs(stationMap[arrivalLine][departureStation] - stationMap[arrivalLine][arrivalStation]);
        departureStation = arrivalStation;
    }
    console.log(cost);
});