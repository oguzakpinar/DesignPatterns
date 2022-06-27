package mediatorPattern.antipattern;

import mediatorPattern.pattern.IChatRoom;

public class ChatUser {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ChatUser(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }
}
