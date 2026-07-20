# Llanquihue Tour

## Descripción del proyecto

Llanquihue Tour es un prototipo de sistema desarrollado en Java que permite gestionar las principales entidades de una agencia turística ubicada en la Región de Los Lagos.

El sistema permite administrar clientes, tours y reservas mediante una estructura modular aplicando principios fundamentales de Programación Orientada a Objetos (POO), tales como encapsulamiento, herencia, composición, interfaces, colecciones y polimorfismo.

El objetivo del proyecto es representar una base técnica reutilizable para una futura implementación más completa del sistema de gestión turística.

---

# Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Programación Orientada a Objetos
- Colecciones Java (ArrayList y HashMap)
- Archivos de texto (.txt)

---

# Estructura del proyecto

```
LlanquihueTour
│
├── datos
│   └── tours.txt
│
├── src
│   │
│   ├── app
│   │   └── Main.java
│   │
│   ├── model
│   │   ├── Persona.java
│   │   ├── Cliente.java
│   │   ├── Guia.java
│   │   ├── Proveedor.java
│   │   ├── Direccion.java
│   │   ├── Rut.java
│   │   ├── Tour.java
│   │   └── Reserva.java
│   │
│   ├── data
│   │   ├── GestorClientes.java
│   │   ├── GestorTours.java
│   │   └── GestorReservas.java
│   │
│   ├── interfaces
│   │   └── Registrable.java
│   │
│   ├── exceptions
│   │   └── RutInvalidoException.java
│   │
│   └── utils
│       └── ArchivoUtil.java
```

---

# Funcionalidades principales

## Gestión de clientes

El sistema permite:

- Registrar clientes.
- Almacenar información personal.
- Consultar clientes registrados.
- Validar datos del RUT mediante una excepción personalizada.

---

## Gestión de tours

Permite:

- Cargar tours desde un archivo de texto.
- Registrar tours mediante un HashMap.
- Buscar tours utilizando su código identificador.
- Mostrar información de los tours disponibles.

---

## Gestión de reservas

Permite:

- Crear reservas asociando un cliente con un tour.
- Almacenar fecha y cantidad de personas.
- Consultar reservas registradas.

---

# Aplicación de Programación Orientada a Objetos

## Encapsulamiento

Todas las clases utilizan atributos privados (`private`) y métodos públicos mediante getters y setters.

---

## Herencia

Se implementó una jerarquía donde la clase Persona funciona como clase base.

Ejemplo:

```
              Persona
                 |
     -------------------------
     |           |           |
  Cliente      Guia     Proveedor
```

---

## Composición

Se utilizaron relaciones entre objetos:

- Persona contiene un objeto Rut y Dirección.
- Reserva contiene un Cliente y un Tour.

---

## Interfaces

Se creó la interfaz `Registrable`, implementada por:

- Cliente.
- Guia.
- Proveedor.

Métodos utilizados:

- registrar()
- mostrarDatos()

---

## Polimorfismo

Se implementó una lista polimórfica:

```java
List<Registrable> personas = new ArrayList<>();
```

Esto permite almacenar distintos objetos que comparten una misma interfaz.

También se utiliza:

```java
instanceof
```

para identificar el tipo específico de cada objeto.

---

# Colecciones utilizadas

## ArrayList

Utilizado para administrar:

- Clientes.
- Reservas.

Ejemplo:

```java
ArrayList<Cliente>
```

---

## HashMap

Utilizado para administrar tours mediante su código:

```java
HashMap<String, Tour>
```

---

# Archivos utilizados

El sistema utiliza archivos `.txt` como fuente inicial de datos.

Ejemplo:

`tours.txt`

```
T001;Saltos del Petrohué;Puerto Varas;25000;8
T002;Frutillar Cultural;Frutillar;18000;6
T003;Volcán Osorno;Puerto Varas;32000;10
```

Los datos son leídos mediante la clase:

```
ArchivoUtil
```

---

# Instrucciones para ejecutar el proyecto

1. Clonar el repositorio:

```
git clone URL_DEL_REPOSITORIO
```

2. Abrir el proyecto utilizando IntelliJ IDEA.

3. Verificar que el JDK esté correctamente configurado.

4. Ejecutar la clase:

```
src/app/Main.java
```

5. Utilizar el menú mostrado en consola para interactuar con el sistema.

---

# Menú del sistema

```
===== LLANQUIHUE TOUR =====

1. Registrar cliente
2. Mostrar clientes
3. Mostrar tours
4. Crear reserva
5. Mostrar reservas
6. Mostrar personas registradas
7. Salir
```

---

# Autor

Ignacio Sandoval

Proyecto desarrollado para la asignatura de Desarrollo Orientado a Objetos I.
