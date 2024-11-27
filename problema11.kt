#Tangente a una curva: Dada una función y un punto, calcula la ecuación
#de la recta tangente en ese punto

from sympy import symbols, diff, solve 

def tangente(f, x0, h=1e-5):
    m = derivada_aproximada(f, x0)
    b = f(x0) - m * x0
    return lambda x: m * x + b

f = lambda x: x**2
tangente_a_x0 = tangente(f, 2)
print(tangente_a_x0(2))
