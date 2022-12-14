package com.kodilla.stream.immutable;

public final class ForumUser {

    private final String username;
    private final String realName;

    public ForumUser(String username, String realName) {
        this.realName = realName;
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public String getUsername() {
        return username;
    }
}
