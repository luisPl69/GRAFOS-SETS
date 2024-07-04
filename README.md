# Proyecto Red Social - README

## Descripción
Este proyecto implementa una red social básica con clases para usuarios, gestión de relaciones entre usuarios mediante un grafo, y un motor de recomendación para sugerir amigos basados en intereses y similitudes.

## Clases Implementadas

### User
La clase `User` representa a un usuario con nombre, edad, intereses y lista de amigos. Permite añadir amigos y obtener información del usuario.

### Graph
La clase `Graph` gestiona la estructura de grafo para usuarios, permitiendo añadir usuarios, establecer conexiones (amistades) entre ellos y obtener amigos de un usuario específico.

### RecommendationEngine
El `RecommendationEngine` proporciona métodos para recomendar amigos basados en intereses y calcular la similitud entre usuarios utilizando el coeficiente de similitud de Jaccard.

## Detalles de Implementación

### Graph
- Utiliza una estructura de lista de adyacencia para representar las conexiones entre usuarios.
- Métodos implementados: `addUser`, `addConnection`, `getFriends`, `recommendFriends`.

### RecommendationEngine
- Calcula la similitud entre usuarios basada en sus intereses utilizando el coeficiente de Jaccard.
- Método implementado: `calculateSimilarity`, `recommendedFriends`.

## Ejecución del Proyecto
Para ejecutar el proyecto:
1. Clona el repositorio desde Git.
2. Configura las dependencias necesarias.
3. Ejecuta el programa principal desde la clase `Main` para ver resultados de recomendaciones y similitudes entre usuarios.

---

