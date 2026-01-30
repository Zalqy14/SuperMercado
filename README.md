# SuperMercado

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Herencia%20%26%20Interfaces-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completado-green?style=for-the-badge)

**Sistema de gestión de productos de supermercado**  
_Proyecto educativo que demuestra conceptos avanzados de Programación Orientada a Objetos en Java_

</div>

---

## Descripción

Este proyecto implementa un sistema de gestión de productos para un supermercado utilizando **herencia de clases** e **interfaces** en Java. El diseño utiliza **dos jerarquías de clases paralelas** para separar productos alimenticios de productos no alimenticios.

### Características principales

- **Herencia multinivel**: Múltiples niveles de herencia (`Int1` -> `Int2` -> `Vino`)
- **Jerarquías paralelas**: Dos árboles de clases separados para alimentos y no alimentos
- **Interfaces**: Contratos que definen comportamientos (`EsAlimento`, `Esliquido`, `Descuento`)
- **Sobrescritura de métodos**: `toString()` y `getCalorias()` personalizados
- **Cálculo automático de calorías**: Según tipo de cereal o grados de alcohol

---

## Estructura del Proyecto

```
SuperMercado/
├── src/
│   ├── App.java              # Punto de entrada - Demo de productos
│   │
│   ├── INTERFACES
│   │   ├── Descuento.java    # Gestión de descuentos
│   │   ├── EsAlimento.java   # Propiedades alimenticias (calorias, caducidad)
│   │   └── Esliquido.java    # Propiedades de líquidos (envase, volumen)
│   │
│   ├── JERARQUÍA 1: ALIMENTOS
│   │   ├── Int1.java         # Clase base (marca, precio, calorias, caducidad)
│   │   ├── Int2.java         # Extiende Int1 + envase, volumen
│   │   ├── Cereales.java     # Producto alimenticio sólido
│   │   └── Vino.java         # Producto alimenticio líquido
│   │
│   └── JERARQUÍA 2: NO ALIMENTOS
│       ├── Int11.java        # Clase base (marca, precio, descuento, envase, volumen)
│       └── Detergente.java   # Producto de limpieza líquido
│
├── bin/                       # Archivos compilados
└── README.md
```

---

## Arquitectura y Jerarquía de Clases

### Diagrama de Clases

```
                            INTERFACES
    ┌───────────────┐   ┌───────────────┐   ┌───────────────┐
    │   Descuento   │   │   Esliquido   │   │  EsAlimento   │
    ├───────────────┤   ├───────────────┤   ├───────────────┤
    │+setDescuento()│   │+setVolumen()  │   │+setCaducidad()│
    │+getDescuento()│   │+getVolumen()  │   │+getCaducidad()│
    │+getPrecioDesc │   │+setEnvase()   │   │+getCalorias() │
    └───────────────┘   │+getEnvase()   │   │+setCalorias() │
                        └───────────────┘   └───────────────┘


            JERARQUÍA 1: ALIMENTOS           JERARQUÍA 2: NO ALIMENTOS
            ─────────────────────            ─────────────────────────

                 ┌─────────┐                      ┌─────────┐
                 │  Int1   │                      │  Int11  │
                 ├─────────┤                      ├─────────┤
                 │-marca   │                      │-marca   │
                 │-precio  │                      │-precio  │
                 │-calorias│                      │-descuento│
                 │-caducid.│                      │-envase  │
                 │+toString│                      │-volumen │
                 └────┬────┘                      │+toString│
                      │                           └────┬────┘
         ┌────────────┼────────────┐                   │
         │            │            │                   │
         ▼            ▼            │                   ▼
    ┌─────────┐  ┌─────────┐       │            ┌───────────┐
    │Cereales │  │  Int2   │       │            │Detergente │
    ├─────────┤  ├─────────┤       │            ├───────────┤
    │-tipoCer.│  │-envase  │       │            │-descuento │
    │+getCalor│  │-volumen │       │            │implements:│
    │+toString│  │+toString│       │            │ Descuento │
    │implements│ └────┬────┘       │            │ Esliquido │
    │EsAlimento│      │            │            └───────────┘
    └─────────┘       │            │
                      ▼            │
                 ┌─────────┐       │
                 │  Vino   │       │
                 ├─────────┤       │
                 │-tipoVino│       │
                 │-grados  │       │
                 │+getCalor│       │
                 │+toString│       │
                 │implements:      │
                 │ Esliquido       │
                 │ EsAlimento      │
                 └─────────┘       │
```

---

## Descripción de Componentes

### Interfaces

| Interface    | Propósito                | Métodos                                                              |
| ------------ | ------------------------ | -------------------------------------------------------------------- |
| `Descuento`  | Gestiona descuentos      | `setDescuento()`, `getDescuento()`, `getPrecioDescuento()`           |
| `EsAlimento` | Propiedades de alimentos | `setCaducidad()`, `getCaducidad()`, `getCalorias()`, `setCalorias()` |
| `Esliquido`  | Propiedades de líquidos  | `setVolumen()`, `getVolumen()`, `setEnvase()`, `getEnvase()`         |

### Clases Base

| Clase   | Jerarquía    | Hereda de | Atributos                                           | Métodos sobrescritos |
| ------- | ------------ | --------- | --------------------------------------------------- | -------------------- |
| `Int1`  | Alimentos    | -         | `marca`, `precio`, `calorias`, `caducidad`          | `toString()`         |
| `Int2`  | Alimentos    | `Int1`    | + `envase`, `volumen`                               | `toString()`         |
| `Int11` | No Alimentos | -         | `marca`, `precio`, `descuento`, `envase`, `volumen` | `toString()`         |

### Clases de Producto

| Clase        | Hereda de | Implementa                | Atributos propios    | Métodos sobrescritos          |
| ------------ | --------- | ------------------------- | -------------------- | ----------------------------- |
| `Cereales`   | `Int1`    | `EsAlimento`              | `tipoCereal`         | `getCalorias()`, `toString()` |
| `Vino`       | `Int2`    | `Esliquido`, `EsAlimento` | `tipoVino`, `grados` | `getCalorias()`, `toString()` |
| `Detergente` | `Int11`   | `Descuento`, `Esliquido`  | -                    | -                             |

---

## Conceptos de POO Aplicados

### 1. Herencia Multinivel

```java
// Int2 hereda de Int1
public class Int2 extends Int1 {
    String envase;
    double volumen;

    @Override
    public String toString() {
        return super.toString() + "\nTipo de envase: " + envase + "\nVolumen: " + volumen;
    }
}

// Vino hereda de Int2 (herencia multinivel)
public class Vino extends Int2 implements Esliquido, EsAlimento {
    String tipoVino;
    int grados;
}
```

### 2. Sobrescritura de Métodos (@Override)

**Cálculo de calorías según tipo de cereal:**

```java
public class Cereales extends Int1 implements EsAlimento {
    String tipoCereal;

    @Override
    public int getCalorias() {
        if (tipoCereal.equals("espelta")) return 5;
        else if (tipoCereal.equals("maiz")) return 8;
        else if (tipoCereal.equals("trigo")) return 12;
        else return 15;
    }
}
```

**Cálculo de calorías según grados de alcohol:**

```java
public class Vino extends Int2 implements Esliquido, EsAlimento {
    int grados;

    @Override
    public int getCalorias() {
        return grados * 10;  // 14 grados = 140 calorías
    }
}
```

### 3. Cadena de toString() con super

```java
// Cereales llama a Int1.toString()
@Override
public String toString() {
    return "Tipo de Producto: Cereal\n" +
           "Tipo de Cereal: " + tipoCereal + "\n" +
           "Calorias: " + calorias + "\n" +
           super.toString();  // Llama a Int1.toString()
}

// Vino llama a Int2.toString() que a su vez llama a Int1.toString()
@Override
public String toString() {
    return "Tipo de Producto: Vino\n" +
           "Tipo de Vino: " + tipoVino + "\n" +
           super.toString();  // Llama a Int2.toString()
}
```

---

## Resumen de la Jerarquía

### Jerarquía 1: Alimentos

```
Int1 (marca, precio, calorias, caducidad)
  │
  ├── Cereales (+ tipoCereal) -> getCalorias() según tipo
  │
  └── Int2 (+ envase, volumen)
        │
        └── Vino (+ tipoVino, grados) -> getCalorias() = grados * 10
```

### Jerarquía 2: No Alimentos

```
Int11 (marca, precio, descuento, envase, volumen)
  │
  └── Detergente (hereda todo de Int11)
```

---

## Ejemplo de Ejecución

```
═══════════════════════════════════════════
         SUPERMERCADO - PRODUCTOS
═══════════════════════════════════════════

VINOS
───────────────────────────────────────────
Tipo de Producto: Vino
Tipo de Vino: Rioja Reserva
Tipo de Marca: Marqués de Riscal
Precio: 12.5
Fecha de Caducidad: null
Tipo de envase: Botella de vidrio
Volumen: 0.75

CEREALES
───────────────────────────────────────────
Tipo de Producto: Cereal
Tipo de Cereal: maiz
Calorias: 0
Tipo de Marca: Kellogg's
Precio: 3.5
Fecha de Caducidad: 2026-06-15
Calorias: 8

DETERGENTES
───────────────────────────────────────────
Tipo de Producto: Detergente
Marca: Fairy
Precio: 3.99€
Envase: Botella de plástico
Volumen: 1.0L
Descuento: 15.0%
```

---

## Licencia

Este proyecto es de uso educativo.

---

<div align="center">

**Desarrollado para aprender POO en Java**

</div>
