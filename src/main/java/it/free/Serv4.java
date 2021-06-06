package it.free;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Serv4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter= resp.getWriter();
        printWriter.println("<html>" +"<head><title>page 4</title></head>"+
                "<body><h1>Registered in web.xml</h1></body>" +
                "</html>");
    }
}
