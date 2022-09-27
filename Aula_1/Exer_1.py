import math

n = input('Digite um número: ')
n = int(n)

e = math.pow(n, 3)

if e > 100:
    print(f'Valor do Usuario: {n} elevado ao cubo é maior que 100: {e}')

else:
    print(f'Valor do Usuario: {n} elevado ao cubo é menor que 100: {e}')
    
