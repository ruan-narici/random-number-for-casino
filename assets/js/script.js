const boxNumbers = document.querySelector('.box-numbers');
const firstNumber = document.querySelector('#number1');
const secondNumber = document.querySelector('#number2');
const btnGenerate = document.querySelector('#generate');
const colorRed = `var(--colorRed)`;
const colorBlack = `var(--colorBlack)`;
const colorGreen = `var(--colorGreen)`

getRandomNumber = (min,max) => {
    return Math.floor(Math.random() * (max - min) + min);
}

setNumberColor = (element) => {
        element.innerHTML = getRandomNumber(0, 36);
        let n = element.innerHTML;
        let calcN = n % 2;
        if (n == 0) {
            element.style.backgroundColor = colorGreen;
        } else if (calcN === 0 && n <= 18) {
            console.log(n + " é par");
            element.style.backgroundColor = colorRed;
        } else if (calcN === 1 && n >= 18) {
            console.log(n + " é impar");
            element.style.backgroundColor = colorRed;
        } else {
            element.style.backgroundColor = colorBlack;
        }
}

generateNumber = () => {
    btnGenerate.addEventListener('click', () => {
        setNumberColor(firstNumber);
        setNumberColor(secondNumber);
        boxNumbers.classList.remove('hide');
    })
}

//EXECUTE
generateNumber();
