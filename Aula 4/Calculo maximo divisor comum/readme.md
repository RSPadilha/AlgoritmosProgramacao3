# Cálculo do Máximo Divisor Comum
O máximo divisor comum de dois números é o maior número inteiro que realiza a divisão exata dos dois números originais.

Um algoritmo eficiente para achar o máximo divisor comum funciona da seguinte forma:

    Sejam dois números inteiros P e Q.
    Calcula-se o resto da divisão de P por Q.
    Se o resto da divisão for zero, Q é o máximo divisor comum.
    Senão, reinicia-se o processo, com P sendo o valor de Q, e Q sendo o valor do resto da divisão.

Implemente uma funcão recursiva que receba dois números inteiros e retorne o máximo divisor comum entre os dois.