<html>
<head>
<title>CreditCard-Home Page</title>
</head>
<body>
<div style="height:40%; background-color:cyan; padding-left: 40px">
<h1 style="padding-top: 20px">Check for Credit Card Eligibility</h1>
<br>
<form method="POST" action="checkEligibility">
<table border="1px solid black">
<tr>
<td>Enter PAN Number: <input type="text" name="panNo" id="panNo" pattern="[A-Za-z0-9]{10}" required></td>
</tr>
<tr>
<td><button type="submit" id="submit">Check</button></td>
</tr>
</table>
</form>

<div>
</body>
</html>