class Pessoa():
    nome = None
    idade = None

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def envelhecer(self):
        self.idade += 1    

class Atleta(Pessoa):
    peso = None
    aposentado = None

    def __init__(self, nome, idade, peso):
        super().__init__(nome, idade)
        self.peso = peso
        #self.aposentado = False

    def aquecer(self):
        print('Atleta Aquecido')

    def aposentar(self):
        self.aposentado = True        

class Corredor(Atleta):
    def Correr(self):
        print('Corredor Correndo')

class Nadador(Atleta):
    def Nadador(self):    
        print('Nadador Nadando')

class Ciclista(Atleta):
    def Ciclista(self):
        print('Ciclista pedalando')

corredor1 = Corredor('Gilberto', 26, 80)
corredor1.aquecer()
corredor1.Correr()
print('Ficha: ')
print(f'{corredor1.nome}')
print(f'{corredor1.idade} anos')
print(f'{corredor1.peso},00')

Nadador1 = Nadador('Carlos', 29, 73)
Nadador1.aquecer()
Nadador1.Nadador()
print('Ficha: ')
print(f'{Nadador1.nome}')
print(f'{Nadador1.idade} anos')
print(f'{Nadador1.peso},00')
print(f'{Nadador1.aposentado}')
if Nadador1.aposentado:
    print('sim')
else:
    print('nao')    

Ciclista1 = Ciclista('Eduardo', 39, 85)
Ciclista1.aquecer()
Ciclista1.Ciclista()
print('Ficha: ')
print(f'{Ciclista1.nome}')
print(f'{Ciclista1.idade} anos')
print(f'{Ciclista1.peso},00')