package com.example.demo.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
@Builder
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    private String id;
    private String username;
    private String email;
}
