package com.itstep.academy.demo2.controller;

import com.itstep.academy.demo2.command.CommandContainer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/controller")
public class ServletController extends HttpServlet {

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String command = (String) req.getParameter("command");
            String result = CommandContainer.getCommand(command).execute(req, resp);
            req.getRequestDispatcher(result).forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace(); // todo: redirect to error page with error message
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
