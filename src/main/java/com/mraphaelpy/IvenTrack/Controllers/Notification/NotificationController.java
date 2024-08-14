package com.mraphaelpy.IvenTrack.Controllers.Notification;

import com.mraphaelpy.IvenTrack.Interfaces.INotification;
import com.mraphaelpy.IvenTrack.Models.Notification.NotificationModel;

import java.util.Date;
import java.util.UUID;

public class NotificationController implements INotification {

    @Override
    public String sendNotification() {
        // Placeholder for actual notification details
        NotificationModel notification = new NotificationModel();
        notification.setId(UUID.randomUUID());
        notification.setUserId(UUID.randomUUID());
        notification.setMessage("Essa é uma mensagem de notificação");
        notification.setType("Email");
        notification.setTimestamp(new Date());

        // Logic to send notification
        if ("Email".equals(notification.getType())) {
            // Send email logic
            return "Email enviado com Sucesso para" + notification.getUserId();
        } else if ("SMS".equals(notification.getType())) {
            // Send SMS logic
            return "SMS enviado com Sucesso para " + notification.getUserId();
        } else {
            return "Tipo de notificação inválido";
        }
    }
}