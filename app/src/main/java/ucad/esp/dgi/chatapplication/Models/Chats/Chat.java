package ucad.esp.dgi.chatapplication.Models.Chats;

import java.io.Serializable;
import java.util.ArrayList;

import ucad.esp.dgi.chatapplication.Models.Users.User;

public class Chat implements Serializable {
    private String chatId;

    private ArrayList<User> userObjectArrayList = new ArrayList<>();

    public Chat(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return chatId;
    }

    public ArrayList<User> getUserObjectArrayList() {
        return userObjectArrayList;
    }


    public void addUserToArrayList(User mUser) {
        userObjectArrayList.add(mUser);
    }
}
