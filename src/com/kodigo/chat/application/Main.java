package com.kodigo.chat.application;


import com.kodigo.chat.model.Chat;
import com.kodigo.chat.model.IMessage;
import com.kodigo.chat.model.TextMessage;
import com.kodigo.chat.model.User;
import com.kodigo.chat.service.ChatService;
import com.kodigo.chat.service.UserService;

public class Main {
    public static void main(String[] args) {

        // Creamos nuestros servicios: repositorios y manejo de usuarios y chats
        UserService userService = new UserService();
        ChatService chatService = new ChatService();

        //Creamos nuestros objetos usuarios
        User luis = userService.createUser("1", "Luis");
        User ana = userService.createUser("2", "Ana");

        Chat chat = chatService.createChat();
        chatService.addUserToChat(chat.getId(), luis);
        chatService.addUserToChat(chat.getId(), ana);

        IMessage txtMesagge1 = new TextMessage(luis, "Holaaa, Qué tal?!");

        chatService.sendMessage(chat.getId(), txtMesagge1);
        chatService.sendMessage(chat.getId(), new TextMessage(ana, "Bieeeeen"));
        chatService.sendMessage(chat.getId(), new TextMessage(luis,"Que bien :) bye."));

        for (IMessage message : chatService.getMessage(chat.getId())){
            System.out.println(message.getFormattedText());
        }

    }
}