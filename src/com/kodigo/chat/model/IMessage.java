package com.kodigo.chat.model;

import java.time.LocalDateTime;

public interface IMessage {
    //v2 paso 1 Open-Close principle
    User getSender();

    String getContent();

    String getFormattedText();
}
