package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Maxim on 15.02.2016.
 */
public class Frontend extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // TODO: отправить не html страницу c ответом, а просто текст.
        // Все, что вам нужно - это использовать response.getWriter.println(ваша строка).
        // Ну и все остальное, что нужно в doGet.
        // Тогда у вас нормально отобразится строчка, которую подставили в key и вы все пройдете.
        
        String value = request.getParameter("key");
        response.getWriter().println(value == null ? "" : value);
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }

}
