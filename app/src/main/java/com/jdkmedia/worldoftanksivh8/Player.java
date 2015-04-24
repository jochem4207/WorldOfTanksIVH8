package com.jdkmedia.worldoftanksivh8;

/**
 * Created by jochem on 23-04-15.
 */
public class Player {

    private int account_id;
    private String nickname;

    public Player(int account_id, String nickname){
        this.account_id = account_id;
        this.nickname = nickname;
    }

    public String toString() {
        return this.account_id + this.nickname;
    }
}
