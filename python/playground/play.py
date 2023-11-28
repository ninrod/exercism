"""brincadeiras

O termo palíndromo aplica-se a uma palavra que pode ser lida, indiferentemente, da esquerda para a direita ou vice-versa, 
como as palavras sopapos, ama e radar.

Nesse contexto, considere a especificação de uma função intitulada palindromo, 
que analisa se uma palavra é um palíndromo ou não. 

A função recebe como parâmetro uma palavra, na forma de uma string, e retorna uma string de acordo com a seguinte regra:

?, se a palavra tem menos de 3 caracteres;
S, se a palavra é um palíndromo;
N, se a palavra não é um palíndromo.

Exemplos dos valores retornados pela função.
palindromo ("") → "?"
palindromo ("anilina") → "S"
palindromo ("mama") → "N"
palindromo ("mm") → "?"
"""

TEST_CASE = ['filipe', 'mm', 'mama', 'anilina','sopapos', 'ama', 'radar']

def palindromo(s):
    """verifica se esse bagulho é um palíndromo

    :s string a ser verificada
    :return: str - S se é palíndromo, N se não é, ? se tem menos de 3 chars.

    """
    if len(s) < 3:
        return "?"
    if s[::-1] == s:
        return "S"
    return "N"
