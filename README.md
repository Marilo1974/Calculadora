# Calculadora
Claculadora que permite sumar, restar, multiplicar y potencias

# Historial de desarrollo del proyecto Calculadora

Este documento describe los principales commits y merges realizados durante el desarrollo del proyecto.

## 1. Commit inicial

Se creó el repositorio con la estructura básica del proyecto.

```bash
git add .
git commit -m "Initial commit"
git push origin main
```

---

## 2. Desarrollo de la funcionalidad "Cambio1"

Se creó una nueva rama para desarrollar cambios en el proyecto.

```bash
git checkout -b feature/cambio1
```

Se realizaron modificaciones y se registraron en Git:

```bash
git add .
git commit -m "Cambio1"
git push origin feature/cambio1
```

Posteriormente se abrió un Pull Request y se fusionó con la rama principal.

### Merge Pull Request #1

```bash
git checkout main
git merge feature/cambio1
git push origin main
```

Resultado en el historial:

```text
Merge pull request #1 from feature/cambio1
```

---

## 3. Desarrollo de la clase Calculadora

Se creó una nueva rama para implementar la clase `Calculadora.java`.

```bash
git checkout -b feature/calculadora
```

Se añadió el archivo y se registró el cambio.

```bash
git add Calculadora.java
git commit -m "Create Calculadora.java"
git push origin feature/calculadora
```

---

## 4. Actualización desde la rama principal

Antes de fusionar los cambios, se sincronizó la rama de trabajo con los cambios más recientes de `main`.

```bash
git checkout feature/calculadora
git pull origin main
```

En GitHub aparece reflejado como:

```text
Incoming Changes origin/main
```

---

## 5. Merge Pull Request #2

Una vez revisado el código, se creó un segundo Pull Request para integrar la nueva funcionalidad en la rama principal.

```bash
git checkout main
git merge feature/calculadora
git push origin main
```

Resultado en el historial:

```text
Merge pull request #2 from feature/calculadora
```

---

## Grafo simplificado

```text
o  Merge pull request #2
|
o  Create Calculadora.java
|
o  Incoming Changes origin/main
|
o  Merge pull request #1
|\
| o Cambio1
|/
o Initial commit
```

## Resumen

| Commit / Merge | Descripción |
|---------------|-------------|
| Initial commit | Creación inicial del proyecto |
| Cambio1 | Primer conjunto de cambios |
| Merge pull request #1 | Integración de Cambio1 en main |
| Incoming Changes origin/main | Sincronización con la rama principal |
| Create Calculadora.java | Creación de la lógica de la calculadora |
| Merge pull request #2 | Integración de la calculadora en main |