package com.itstep.academy.demo2.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public interface Command {
    List<String> execute(HttpServletRequest request, HttpServletResponse response);
}
