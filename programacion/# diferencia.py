# diferencia
# Usuario USA a Impresora y Documento solo dentro de un método,
# no los guarda como atributos: eso es una dependencia.

def pedir_texto(mensaje):
    while True:
        valor = input(mensaje).strip()
        if valor:
            return valor
        print("  No puede estar vacío, intenta de nuevo.")


class Documento:
    def __init__(self, contenido):
        self.contenido = contenido


class Impresora:
    def imprimir(self, documento):
        print(f"Imprimiendo: {documento.contenido}")


class Usuario:
    def __init__(self, nombre):
        self.nombre = nombre

    def generar_reporte(self, impresora, documento):
        print(f"{self.nombre} envía a imprimir...")
        impresora.imprimir(documento)


nombre = pedir_texto("Nombre del usuario: ")
contenido = pedir_texto("Contenido del documento: ")

usuario = Usuario(nombre)
documento = Documento(contenido)
impresora = Impresora()

print()
usuario.generar_reporte(impresora, documento)