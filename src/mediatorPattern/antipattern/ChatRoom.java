package mediatorPattern.antipattern;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom {


    public void sendMessage(ChatUser sender, String msg, ChatUser receiver)
    {
        System.out.println(sender.getName() + " :: Sending Message : " + msg);
        receiver.receive(msg);
    }

}
