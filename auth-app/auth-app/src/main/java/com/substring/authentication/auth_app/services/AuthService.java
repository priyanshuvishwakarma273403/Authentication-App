package com.substring.authentication.auth_app.services;

import com.substring.authentication.auth_app.payload.UserDto;

public interface AuthService {
    UserDto registerUser(UserDto userDto);
}
