package org.example.part_7_Collections.lesson40homework.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.example.part_7_Collections.lesson40homework.task2.UserUtils.*;

public final class ChatUtils {
    
    private ChatUtils() {}
    
    public static List<User> getListUsers18Plus(List<Chat> chats) {
        List<User> users = new ArrayList<>();
        for (Chat chat : chats) {
            users.addAll(chat.getUsers());
        }
        ListIterator<User> iter = users.listIterator();
        while (iter.hasNext()) {
            User user = iter.next();
            if (user.getAge() < 18) {
                iter.remove();
            }
        }
        return users;
    }

    public static List<Chat> getChats() {
        List<Chat> chats = Arrays.asList(
                new  Chat("Voice chat", getRandomUserList(10)),
                new  Chat("Top people", getRandomUserList(10)),
                new  Chat("All VIP", getRandomUserList(10)),
                new  Chat("Zoo chat", getRandomUserList(10)),
                new  Chat("Text chat", getRandomUserList(10))
        );
        return chats;
    }
}
