package com.itstep.academy.demo2.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public class GetUserCommand implements Command {
    @Override
    public List<String> execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        return List.of("id: " + id);
    }
}
