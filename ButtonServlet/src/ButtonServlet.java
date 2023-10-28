import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ButtonServlet")
public class ButtonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String[] buttonsClicked = request.getParameterValues("button");

        if (buttonsClicked != null) {
            for (String button : buttonsClicked) {
                if ("Click Me".equals(button)) {
                    response.getWriter().println("Button 1 Clicked");


                } else if ("Click Me 2".equals(button)) {
                    response.getWriter().println("Button 2 Clicked");
                }
            }
        }
    }
}
