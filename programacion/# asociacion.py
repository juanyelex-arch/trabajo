# asociacion
# Un Estudiante tiene varios Cursos y un Curso tiene varios Estudiantes.

def pedir_texto(mensaje):
    while True:
        valor = input(mensaje).strip()
        if valor:
            return valor
        print("  No puede estar vacío, intenta de nuevo.")


class Estudiante:
    def __init__(self, nombre):
        self.nombre = nombre
        self.cursos = []

    def inscribir_curso(self, curso):
        if curso not in self.cursos:
            self.cursos.append(curso)
            curso.agregar_estudiante(self)


class Curso:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def agregar_estudiante(self, estudiante):
        if estudiante not in self.estudiantes:
            self.estudiantes.append(estudiante)


def buscar_por_nombre(lista, nombre):
    for item in lista:
        if item.nombre.lower() == nombre.lower():
            return item
    return None


estudiantes = []
cursos = []

while True:
    print("\n1. Crear estudiante")
    print("2. Crear curso")
    print("3. Inscribir estudiante en curso")
    print("4. Ver resumen")
    print("5. Salir")
    opcion = input("Elige una opción: ").strip()

    if opcion == "1":
        estudiantes.append(Estudiante(pedir_texto("Nombre del estudiante: ")))
    elif opcion == "2":
        cursos.append(Curso(pedir_texto("Nombre del curso: ")))
    elif opcion == "3":
        est = buscar_por_nombre(estudiantes, pedir_texto("Estudiante: "))
        cur = buscar_por_nombre(cursos, pedir_texto("Curso: "))
        if est and cur:
            est.inscribir_curso(cur)
            print(f"  {est.nombre} inscrito en {cur.nombre}.")
        else:
            print("  Estudiante o curso no encontrado.")
    elif opcion == "4":
        for e in estudiantes:
            print(f"Cursos de {e.nombre}: {[c.nombre for c in e.cursos]}")
        for c in cursos:
            print(f"Estudiantes en {c.nombre}: {[e.nombre for e in c.estudiantes]}")
    elif opcion == "5":
        break
    else:
        print("  Opción no válida.")