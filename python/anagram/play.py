"""brincadeiras
A função recebe como parâmetro uma palavra, na forma de uma string, e retorna uma string de acordo com a seguinte regra:
?, se a palavra tem menos de 3 caracteres;
S, se a palavra é um palíndromo;
N, se a palavra não é um palíndromo.
"""

def palindromo(s):
    if len(s) < 3:
        return "?"

    # if s[::-1] == s:
    #     return "S"

    acc=''
    i = len(s)-1
    while i>=0:
        acc+=s[i]
        i-=1

    if acc == s:
        return "S"

    return "N"
