package com.itstep.academy.demo2.command;

import com.itstep.academy.demo2.entity.User;
import com.itstep.academy.demo2.storage.AppStorage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class AddUserCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        User user = new User(name, email);
        AppStorage.set("user", user);
//        request.getSession().setAttribute("user", user);
        request.setAttribute("name", name);
        request.setAttribute("email", email);
//        response.getWriter().println("User added");

        return "/user-profile.jsp";
    }
}
