package com.itstep.academy.demo2.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public interface Command {
    String execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
