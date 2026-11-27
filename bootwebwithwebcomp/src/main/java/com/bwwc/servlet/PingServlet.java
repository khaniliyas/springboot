package com.bwwc.servlet;

import com.bwwc.bean.Config;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class PingServlet extends HttpServlet {
    @Autowired
    private Config config;

    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println("Pons !"+config.getAppVersion());
    }
}
