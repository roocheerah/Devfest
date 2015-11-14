package com.example.ruchirakulkarni.devfest;

import com.firebase.client.Firebase;

/**
 * Created by ruchirakulkarni on 11/14/15.
 */
public class Chat {
    private String user;

    public Chat(String user){
        this.user = user;
    }

    public void enterChat(String text, Firebase myFirebaseRef) {
        if (text.isEmpty()) {
            return;
        }

        myFirebaseRef.child(this.user).setValue(text);

    }

}
