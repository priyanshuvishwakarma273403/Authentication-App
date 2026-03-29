package com.substring.authentication.auth_app.payload;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDto {
    private UUID id;
    private String name;
}
