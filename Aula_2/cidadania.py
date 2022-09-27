class Pessoa():
    nome = None
    sexo = None
    idade = None

    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade

class Cidadao(Pessoa):
    cpf = None

    def __init__(self,  nome, sexo, idade, cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf


nome0 = input('Digite seu nome: ')
sexo0 = input('Digite qual seu sexo: ')
idade0 = input('Digite sua idade:')
cpf0 = input('Digite seu cpf: ')

cidadao1 = Cidadao(nome0, sexo0, idade0, cpf0)

print(cidadao1.idade)
print(cidadao1.nome)
print(cidadao1.sexo)
print(cidadao1.cpf)