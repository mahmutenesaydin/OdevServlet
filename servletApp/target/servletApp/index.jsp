<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BOYACI</title>
</head>
<style>
    .renkBtn:hover{
        background: green;
    }
    .renkBtn:active {
        color: red;
    }
    .buyutTxt:hover {
        width: 200px;
        height: 20px;
    }
    .renkCmb:active {
        color: blue;
    }
</style>
<body>
<form action="/yaz" method="Post">
    <table>
        <label for="deger" >Sekil Seciniz:</label>
        <select name="deger" id="deger" class="renkCmb">
            <option value="Kare">Kare</option>
            <option value="Dikdortgen">Dikdortgen</option>
            <option value="Daire">Daire</option>
        </select>
        <tr>
            <td align="right">1.Kenar:</td>
            <td><input type="text" name="kenar" class="buyutTxt"></td>
        </tr>
        <tr>
            <td align="right">2.Kenar:</td>
            <td><input type="text" name="kenar2" class="buyutTxt"></td>
        </tr>
        <tr>
            <td align="right">Yaricap:</td>
            <td><input type="text" name="yaricap" class="buyutTxt"></td>
        </tr>
    </table>
    <input type="submit" value="Gonder" class="renkBtn">
</form>
<form action="/listele">
    <input type="submit" value="Getir" class="renkBtn">
</form>
</body>
</html>