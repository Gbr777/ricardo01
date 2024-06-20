<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Salário</title>
</head>
<body>
    <h1>Calculadora de Salário</h1>
    <form action="calculate" method="post">
        <label for="salary">Salário Atual:</label>
        <input type="text" id="salary" name="salary" required><br><br>
        <label for="percentage">Percentual de Reajuste (%):</label>
        <input type="text" id="percentage" name="percentage" required><br><br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
