# Pequeño ejemplo de lambdas

# Opera dos números con una función que recibe como parámetro
# n1 - Primer número a operar
# n2 - Segundo número a operar
# f - Función con la que se opera
def opera(n1, n2, f):
    return f(n1, n2)

n1 = 3.0
n2 = 5.0

print(opera(n1, n2, lambda x, y: x + y))
print(opera(n1, n2, lambda x, y: x - y))
print(opera(n1, n2, lambda x, y: x * y))
print(opera(n1, n2, lambda x, y: x / y))
