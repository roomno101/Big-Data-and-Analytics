// develop a java program to collect and analyze user data, such as listening habits and preferences.
import java.util.*;
class User{
    private String username;
    private List<String> listenedsongs;
    private Map<String,Integer> genreCounts;
    public User(String username){
        this.username = username;
        this.listenedsongs = new ArrayList<>();
        this.genreCounts = new HashMap<>();
    }
    public String getUsername(){
        return username;
    }
    public void listenToSong(String song,String genre){
        listenedsongs.add(song);
        genreCounts.put(genre,genreCounts.getOrDefault(genre, 0)+1);
    }
    public List<String> getListenedSongs(){
        return listenedsongs;
    }
    public Map<String,Integer> getGenreCounts(){
        return genreCounts;
    }
}
public class assignment11 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        user1.listenToSong("Song1", "Pop");
        user1.listenToSong("Song2", "Rock");
        user1.listenToSong("Song3", "Pop");
        user1.listenToSong("Song4", "Pop");

        User user2 = new User("user2");
        user2.listenToSong("Song1", "Pop");
        user2.listenToSong("Song5", "Jazz");
        user2.listenToSong("Song6", "Pop");
        analyzeListeningHabits(user1);
        analyzeListeningHabits(user2);

    }
    public static void analyzeListeningHabits(User user) {
        System.out.println("User " + user.getUsername());
        System.out.println("Listened Songs : ");
        for(String song : user.getListenedSongs()){
            System.out.println("-> "+song);
        }
        System.out.println("Genre Counts : ");
        for(Map.Entry<String, Integer> entry : user.getGenreCounts().entrySet()){
            System.out.println("-> "+entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();
    }
}
// Output:
// User: user1
// Listened Songs: 
// Song1
// Song2
// Song3
// Song4
// Genre Counts: 
// -Pop: 3
// -Rock: 1

// User: user2
// Listened Songs: 
// Song1
// Song5
// Song6
// Genre Counts: 
// -Pop: 2
// -Jazz: 1