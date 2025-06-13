package com.itstep.academy.demo2.command;

import com.itstep.academy.demo2.entity.User;
import com.itstep.academy.demo2.storage.AppStorage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class GetUserListCommand implements Command {


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Object> objects = AppStorage.getAll();
        List<User> users = objects.stream().map(o -> (User) o).toList();
        request.setAttribute("users", users);
        return "/user-list.jsp";
    }
}
