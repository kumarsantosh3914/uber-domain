package org.example.uberproject.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OTP extends BaseModel {
    private String code;
    private String sentToNumber;

    public static OTP make(String phoneNumber) {
        // Initialize a Random object somewhere; you should only need one
        Random random = new Random();

        // Generate a random integer between 0 to 899, then add 100
        Integer code = random.nextInt(9000) + 100;

        return OTP.builder().code(code.toString()).sentToNumber(phoneNumber).build();
    }
}
