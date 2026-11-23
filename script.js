function calcular(operacion) {

    const num1 = parseFloat(document.getElementById("num1").value);
    const num2 = parseFloat(document.getElementById("num2").value);

    let resultado = 0;

    switch(operacion) {
        case "suma":
            resultado = num1 + num2;
            break;

        case "resta":
            resultado = num1 - num2;
            break;

        case "multiplicacion":
            resultado = num1 * num2;
            break;

        case "potencia":
            resultado = Math.pow(num1, num2);
            break;
    }

    document.getElementById("resultado").innerText = resultado;
}