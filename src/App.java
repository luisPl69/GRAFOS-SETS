import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Crear algunos usuarios
        User marco = new User("Marco", 30, Arrays.asList("Leer", "Viajar", "Cocinar"));
        User bob = new User("Bob", 25, Arrays.asList("Futbol", "Cocinar", "Peliculas"));
        User charlie = new User("Charlie", 28, Arrays.asList("Futbol", "Peliculas", "Musica"));

        // Crear un grafo y añadir usuarios
        Graph graph = new Graph();
        graph.addUser(marco);
        graph.addUser(bob);
        graph.addUser(charlie);

        // Conectar usuarios
        graph.addConnection(marco, bob);
        graph.addConnection(marco, charlie);

        // Imprimir amigos de Marco
        System.out.println("Friends of Marco: " + graph.getFriends(marco));

        // Recomendar amigos para Marco
        System.out.println("Recommended friends for Marco: " + graph.recommendFriends(marco));
    }
}
