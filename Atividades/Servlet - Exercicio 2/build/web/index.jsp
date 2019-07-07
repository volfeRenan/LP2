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
        <form action="Calculadora" method="GET">
            <h2>Calculadora</h2>
            <div id="divCampos">
		<div id="numsDiv">
			<input id="pNum" type="number" name="a" placeholder="1° N">
                        <select id="operador" name="operador" >
                            <option value="+">+</option>
                            <option value="-">-</option>
                            <option value="*">*</option>
                            <option value="/">/</option>
                        </select>
			<input id="sNum" type="number" name="b" placeholder="2° N">
                        <button id="lblResultado" action="" name="lblResultado" value="=">=</button>
		</div>
            </div>
        </form>
    </body>
</html>
