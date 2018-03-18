# Patrones de diseño en Java

El objetivo de este repositorio es poner ejemplos de patrones de diseño programados en Java, para que sirvan de referencia a todo aquel que los necesite.


Para entender los patrones rápido en Java es muy recomendable el libro **<a target="_blank" href="https://www.amazon.es/gp/product/0596007124/ref=as_li_tl?ie=UTF8&camp=3638&creative=24630&creativeASIN=0596007124&linkCode=as2&tag=anderraso-21&linkId=02b89990c9c1134fb3eb79fb8615bc59">Head First Design Patterns</a><img src="//ir-es.amazon-adsystem.com/e/ir?t=anderraso-21&l=am2&o=30&a=0596007124" width="1" height="1" border="0" alt="" style="border:none !important; margin:0px !important;" />**.

Las contribuciones son bienvenidas y apreciadas.

## Patrones implementados

### Comportamiento 

- [x] Observer
- [ ] State
- [x] Strategy

### Estructurales

- [x] Adapter
- [x] Composite
- [ ] Facade

### Generadores

- [ ] Iterator
- [x] Simple Factory
- [x] Singleton

## ¿Quieres contribuir?

La estructura del repositorio es la siguiente:

- patrones
  - tipo (generador, estructural...)
    - nombre (strategy, state...)
      - nombre_del_ejemplo (pizzeria...)
        - archivos_del_ejemplo

**Ejemplo:** para añadir un nuevo `Simple Factory` llamado `carta_factory`, se debe crear el paquete `patrones/generadores/simple_factory/carta_factory`.


