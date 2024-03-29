package org.example.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppConfig {
    private JwtConfig jwt;
    private DomainConfig domainConfig;

    // Standard getters and setters
}