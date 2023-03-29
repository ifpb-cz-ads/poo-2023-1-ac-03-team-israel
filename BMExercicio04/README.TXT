4. Declare uma variável chamada long1 do tipo long e a inicialize com 100. 
Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com 
200. Agora faça int2 receber int1 mais long1 e explique os resultados. 
Arrume o código para que não ocorra o erro anterior

Uma váriavel int pode ser convertida em uma variavel long, porém uma variavel long não pode ser convertida em uma int, apenas em flot ou double, 
o java realiza sempre contas no maior tipo que aparece durante operações, portanto o programa não compila porque a variavel int está perdendo informação.