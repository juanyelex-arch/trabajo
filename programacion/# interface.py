# interface
from abc import ABC, abstractmethod


def pedir_texto(mensaje):
    while True:
        valor = input(mensaje).strip()
        if valor:
            return valor
        print("  No puede estar vacío, intenta de nuevo.")


def pedir_entero(mensaje):
    while True:
        try:
            return int(input(mensaje))
        except ValueError:
            print("  Escribe un número entero válido.")


class Reproducible(ABC):
    """Interfaz: define el contrato que deben cumplir las clases hijas."""

    @abstractmethod
    def reproducir(self):
        pass

    @abstractmethod
    def detener(self):
        pass


class Cancion(Reproducible):
    def __init__(self, titulo):
        self.titulo = titulo

    def reproducir(self):
        print(f"Reproduciendo la canción: {self.titulo}")

    def detener(self):
        print(f"Deteniendo la canción: {self.titulo}")


class Video(Reproducible):
    def __init__(self, titulo):
        self.titulo = titulo

    def reproducir(self):
        print(f"Reproduciendo el video: {self.titulo}")

    def detener(self):
        print(f"Deteniendo el video: {self.titulo}")


cantidad = pedir_entero("¿Cuántos elementos quieres crear? ")
elementos = []

for _ in range(cantidad):
    tipo = pedir_texto("Tipo (cancion/video): ").lower()
    titulo = pedir_texto("Título: ")
    if tipo == "cancion":
        elementos.append(Cancion(titulo))
    elif tipo == "video":
        elementos.append(Video(titulo))
    else:
        print("  Tipo no válido, se omite.")

print()
for e in elementos:
    e.reproducir()
    e.detener()