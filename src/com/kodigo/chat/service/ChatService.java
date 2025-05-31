package com.kodigo.chat.service;

import com.kodigo.chat.model.Chat;
import com.kodigo.chat.model.IMessage;
import com.kodigo.chat.model.User;

import java.util.*;

public class ChatService {
    private final Map<String, Chat> chats = new HashMap<>();

    public Chat createChat() {
        Chat chat = new Chat();
        chats.put(chat.getId(), chat);
        return chat;
    }

    //nuevo metodo
    public void addUserToChat(String chatId, User user){
        Chat chat = chats.get(chatId);
        if(chat != null) {
            chat.addParticipant(user);
        }
    }


    public void sendMessage(String chatId, IMessage message) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
            chat.addMessage(message);
        }
    }

    public List<IMessage> getMessage(String chatId) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
        return chat.getMessages().getAll();
        }

    return Collections.emptyList();
    }
}
