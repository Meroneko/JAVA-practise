let sampleBase = document.querySelector(".result");
let sampleButton1 = document.querySelector("#change-reset");
let sampleButton2 = document.querySelector("#change-add");
let sampleButton3 = document.querySelector("#change-minus");

const baseText = "値：";
let resultValue = 0;

sampleButton1.addEventListener("click", (event) => {
  // 値を初期化
  resultValue = 0;
  changeResult();
});
sampleButton2.addEventListener("click", (event) => {
  calculationValue(1);
  changeResult();
});
sampleButton3.addEventListener("click", (event) => {
  calculationValue(-1);
  changeResult();
});

function calculationValue(setValue) {
  resultValue += setValue;
}

function changeResult() {
  sampleBase.textContent = baseText + resultValue.toString();
}
