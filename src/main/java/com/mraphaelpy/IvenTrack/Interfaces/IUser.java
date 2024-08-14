package com.mraphaelpy.IvenTrack.Interfaces;

import org.apache.tomcat.websocket.AuthenticationException;

public interface IUser {
    boolean login(String username, String password) throws AuthenticationException;
    boolean register(String username, String password, String role);
    void logout() throws AuthenticationException;
    void refreshToken() throws AuthenticationException;
}