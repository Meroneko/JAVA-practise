let sampleBase = document.querySelector("label");
let sampleButton1 = document.querySelector("#change-text1");
let sampleButton2 = document.querySelector("#change-text2");
let sampleButton3 = document.querySelector("#change-text3");

sampleButton1.addEventListener("click", (event) => {
  sampleBase.textContent = "バナナ";
});
sampleButton2.addEventListener("click", (event) => {
  sampleBase.textContent = "りんご";
});
sampleButton3.addEventListener("click", (event) => {
  sampleBase.textContent = "いちご";
});
