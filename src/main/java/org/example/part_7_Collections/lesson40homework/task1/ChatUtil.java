package org.example.part_7_Collections.lesson40homework.task1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class ChatUtil {

    private ChatUtil() {}

    /**
     * Удалить с помощью итератора из этого списка те чаты,
     * что содержат менее 1000 пользователей.
     * @param list список чатов.
     */
    public static void removeInactiveChats(List<Chat> list) {
        Iterator<Chat> iter = list.listIterator();
        while (iter.hasNext()) {
            Chat chat = iter.next();
            if (chat.getUserCount() < 1000) {
                iter.remove();
            }
        }
    }

    public static List<Chat> getChats() {
        List<Chat> chats = Arrays.asList(
                new Chat("Voice chat",1000),
                new Chat("Top people", 10),
                new Chat("All VIP", 1050),
                new Chat("Zoo chat", 5210),
                new Chat("Text chat", 0)
        );
        return chats;
    }


}
