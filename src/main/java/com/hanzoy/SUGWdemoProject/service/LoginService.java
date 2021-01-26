package com.hanzoy.SUGWdemoProject.service;

import com.hanzoy.SUGWdemoProject.domain.User;

import java.util.Map;

public interface LoginService {
    public String login(String username, String password, int code);

    public User check(String token);
}
