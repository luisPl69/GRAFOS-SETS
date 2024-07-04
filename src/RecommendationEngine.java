import java.util.ArrayList;
import java.util.List;

public class RecommendationEngine {

    public List<User> recommendFriends(User user, Graph graph) {
        List<User> recommendedFriends = new ArrayList<>();
        for (User potentialFriend : graph.getUsers()) {
            if (!user.getFriends().contains(potentialFriend) && !user.equals(potentialFriend)) {
                double similarity = calculateSimilarity(user, potentialFriend);
                if (similarity > 0.5) { // Ejemplo de umbral para recomendar
                    recommendedFriends.add(potentialFriend);
                }
            }
        }
        return recommendedFriends;
    }

    public double calculateSimilarity(User user1, User user2) {
        List<String> interests1 = user1.getInterests();
        List<String> interests2 = user2.getInterests();
        int commonInterests = 0;
        for (String interest : interests1) {
            if (interests2.contains(interest)) {
                commonInterests++;
            }
        }
        return (double) commonInterests / Math.min(interests1.size(), interests2.size());
    }
}
