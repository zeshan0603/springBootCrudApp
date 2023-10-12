package com.crudApp.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Entity
@Getter
@Setter

/*Instead of writing getters and setters, we can directly use them with
* the help of lombok dependency*/
@Table(name ="user")
public class UserEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username", length = 755)
    private String userName;

    @Column(name ="usertime")
    private LocalTime userTime;
}
