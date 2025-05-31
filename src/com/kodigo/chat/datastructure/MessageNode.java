package com.kodigo.chat.datastructure;

import com.kodigo.chat.model.IMessage;


public class MessageNode {
   private final IMessage message;
   private MessageNode next;

    public MessageNode(IMessage message) {
        this.message = message;
        this.next = null;
    }

    public MessageNode getNext() {
        return next;
    }

    public IMessage getMessage() {
        return message;
    }

    public void setNext(MessageNode next) {
        this.next = next;
    }
}
