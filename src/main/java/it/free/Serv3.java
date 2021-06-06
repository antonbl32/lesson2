package it.free;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Third",urlPatterns = "/html")
public class Serv3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter= resp.getWriter();
        printWriter.println("<html>" +"<head><title>Last page</title></head>"+
                "<body><h1>Last servlet</h1></body>" +
                "</html>");
    }
}
