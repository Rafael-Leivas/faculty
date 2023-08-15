//Escreva uma função que receba a idade de uma pessoa em anos e retorne em dias

function idadeEmDias(idade){

    var diasAno = 365;

    console.log("A sua idade em dias é: ", idade * diasAno);
}
// idadeEmDias(18);

//Escreva uma função onde você vai receber os valores de horas trabalhadas e quanto o funcionário recebe por hora.

function salario(horasTrabalhadas, valorHora) {

    console.log("O valor em que o usuário vai receber em", horasTrabalhadas, "horas vai ser: ","R$",horasTrabalhadas * valorHora,);
}
// salario(150, 40.5);

//Coloque um numero e este número deve retornar o mês do número, EX: 1 = janeiro

function meses(numeroMes){
    var array = ["janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"];
    console.log(array[numeroMes]);
}
meses(1);A