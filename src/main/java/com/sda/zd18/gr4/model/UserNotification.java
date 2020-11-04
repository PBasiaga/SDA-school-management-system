package com.sda.zd18.gr4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usernotifications")
public class UserNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private List<Notification> Notifications;

    private List<Notification> seenNotification;
}
