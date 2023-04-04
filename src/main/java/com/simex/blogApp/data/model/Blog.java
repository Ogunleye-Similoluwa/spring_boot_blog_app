package com.simex.blogApp.data.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Blog {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String  description;
//    private LocalDateTime date;


}
