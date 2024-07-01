package com.devops;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student {

    @Id
    @GeneratedValue(generator = "custom-sequence")
    @GenericGenerator(
        name = "custom-sequence",
        strategy = "com.devops.CustomSequenceIdGenerator"
    )
    private Long id;

    private String name;
    private String email;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
