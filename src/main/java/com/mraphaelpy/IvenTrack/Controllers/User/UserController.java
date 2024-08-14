package com.mraphaelpy.IvenTrack.Controllers.User;

import com.mraphaelpy.IvenTrack.Interfaces.IUser;
import com.mraphaelpy.IvenTrack.Models.User.UserModel;
import org.springframework.stereotype.Controller;
import org.apache.tomcat.websocket.AuthenticationException;
import org.mindrot.jbcrypt.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class UserController implements IUser {

    private final Map<String, UserModel> userDatabase = new HashMap<>();
    private final Map<String, String> activeSessions = new HashMap<>();

    @Override
    public boolean login(String username, String password) throws AuthenticationException {
        UserModel user = userDatabase.get(username);
        if (user != null && BCrypt.checkpw(password, user.getPassword())) {
            String token = UUID.randomUUID().toString();
            activeSessions.put(username, token);
            return true;
        }
        throw new AuthenticationException("Invalid username or password");
    }

    @Override
    public boolean register(String username, String password, String role){
        if (userDatabase.containsKey(username)) {
            return false;
        }
        UserModel newUser = new UserModel();
        newUser.setId(UUID.randomUUID());
        newUser.setUsername(username);
        newUser.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
        newUser.setRole(role);
        userDatabase.put(username, newUser);
        return true;
    }

    @Override
    public void logout() throws AuthenticationException {
        String currentUser = getCurrentUsername();
        if (currentUser != null && activeSessions.containsKey(currentUser)) {
            activeSessions.remove(currentUser);
        } else {
            throw new AuthenticationException("Usuario nao logado");
        }
    }

    @Override
    public void refreshToken() throws AuthenticationException {
        String currentUser = getCurrentUsername();
        if (currentUser != null && activeSessions.containsKey(currentUser)) {
            String newToken = UUID.randomUUID().toString();
            activeSessions.put(currentUser, newToken);
        } else {
            throw new AuthenticationException("Usuario nao logado");
        }
    }

    private String getCurrentUsername() {
        return "currentUsername";
    }
}