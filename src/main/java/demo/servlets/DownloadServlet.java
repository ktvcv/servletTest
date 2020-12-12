package demo.servlets;
import demo.repo.FileRepo;
import demo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/download"})
@Component
public class DownloadServlet extends HttpServlet {

    @Autowired
    private FileService fileService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try (PrintWriter writer = response.getWriter()) {
            Integer id = Integer.valueOf(request.getParameter("id"));
            writer.print("<h2>id: ");
            writer.print(id);
            writer.println("</h2>");
        }
    }


}
