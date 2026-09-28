# clase 
from abc import ABC, abstractmethod


def pedir_texto(mensaje):
    while True:
        valor = input(mensaje).strip()
        if valor:
            return valor
        print("  No puede estar vacío, intenta de nuevo.")


def pedir_numero(mensaje):
    while True:
        try:
            return float(input(mensaje))
        except ValueError:
            print("  Escribe un número válido.")


class Empleado(ABC):
    """Clase abstracta: tiene atributos, un método concreto y uno abstracto."""

    def __init__(self, nombre):
        self.nombre = nombre

    def mostrar_nombre(self):  # método concreto (ya implementado)
        print(f"Empleado: {self.nombre}")

    @abstractmethod
    def calcular_salario(self):  # método abstracto (lo implementa cada hijo)
        pass


class Volador(ABC):
    """'Interfaz': todos sus métodos son abstractos, sin atributos ni lógica."""

    @abstractmethod
    def volar(self):
        pass


class Piloto(Empleado, Volador):
    def __init__(self, nombre, horas_vuelo, pago_por_hora):
        super().__init__(nombre)
        self.horas_vuelo = horas_vuelo
        self.pago_por_hora = pago_por_hora

    def calcular_salario(self):
        return self.horas_vuelo * self.pago_por_hora

    def volar(self):
        return f"{self.nombre} está pilotando el avión"


nombre = pedir_texto("Nombre del piloto: ")
horas = pedir_numero("Horas de vuelo: ")
pago = pedir_numero("Pago por hora: ")

piloto = Piloto(nombre, horas, pago)

print()
piloto.mostrar_nombre()  # viene de la clase abstracta
print(piloto.volar())  # viene de la interfaz
print(f"Salario: ${piloto.calcular_salario():,.0f}")