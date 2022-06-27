package mediatorPattern.antipattern;

public class MediatorMain {
    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoom();

        ChatUser user1 = new ChatUser("1", "Alex");
        ChatUser user2 = new ChatUser("2", "Brian");
        ChatUser user3 = new ChatUser("3", "Charles");
        ChatUser user4 = new ChatUser("4", "David");

        chatroom.sendMessage(user1, "Hello brian", user2);
        chatroom.sendMessage(user2, "Hey buddy", user1);
    }
}
