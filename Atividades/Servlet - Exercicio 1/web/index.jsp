<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Calculadora</title>
	<style type="text/css">
		body {
			background-color: gray;
		}
		h2{
			margin-top: 100px;
			margin-left: 400px;
			margin-right: 400px;
			text-align: center;
		}
		#divCampos {
			margin-left: 400px;
			margin-right: 400px;
			border-style: solid;
			background-color: lightgray;
		}
		#numsDiv, #opcoes {
			margin: 20px;
		}
		#pNum, #lblCalculo, #sNum, #lblResultado{
			margin-right: 20px;
		}
		button{
			margin: 5px;
		}
	</style>
</head>
    <body>
        <form action="Somar" method="GET">
            <h2>Somar</h2>
            <div id="divCampos">
		<div id="numsDiv">
			<input id="pNum" type="number" name="a" placeholder="1° N">
			<label id="lblCalculo" name="calculo"></label>
			<input id="sNum" type="number" name="b" placeholder="2° N">
		</div>
		<div id="opcoes">
                    <button id="idSomar" onclick="somar()" name="somar">Somar (+)</button>
		</div>
            </div>
        </form>
        <form action="Subtracao" method="GET">
            <h2>Subtrair</h2>
            <div id="divCampos">
		<div id="numsDiv">
			<input id="pNum" type="tex" name="a" placeholder="1° N">
			<label id="lblCalculo" name="calculo"></label>
			<input id="sNum" type="tex" name="b" placeholder="2° N">
		</div>
		<div id="opcoes">
                    <button id="idSubtrair"  onclick="subtrair()" name="subtrair">Subtrair (-)</button>
		</div>
            </div>
        </form>
        <form action="Divisao" method="GET">
            <h2>Dividir</h2>
            <div id="divCampos">
		<div id="numsDiv">
			<input id="pNum" type="tex" name="a" placeholder="1° N">
			<label id="lblCalculo" name="calculo"></label>
			<input id="sNum" type="tex" name="b" placeholder="2° N">
		</div>
		<div id="opcoes">
                    <button id="idDividir" onclick="dividir()" name="dividir">Dividir (/)</button>
		</div>
            </div>
        </form>
        <form action="Multiplicacao" method="GET">
            <h2>Multiplicar</h2>
            <div id="divCampos">
		<div id="numsDiv">
			<input id="pNum" type="tex" name="a" placeholder="1° N">
			<label id="lblCalculo" name="calculo"></label>
			<input id="sNum" type="tex" name="b" placeholder="2° N">
		</div>
		<div id="opcoes">
                    <button id="idMultiplicar" onclick="multiplicar()" name="multiplicar">Multiplicar (*)</button>
		</div>
            </div>
        </form>
    </body>
</html>
