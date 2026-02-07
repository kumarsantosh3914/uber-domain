package org.example.uberproject.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Color extends BaseModel{
    @Column(unique = true, nullable = false)
    private String name;
}
