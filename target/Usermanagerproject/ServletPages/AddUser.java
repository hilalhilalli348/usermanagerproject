package ServletPages;

import DAO.UserDAO;
import Models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "aduser", urlPatterns = "/aduser")
public class AddUser extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        UserDAO userDAO = new UserDAO();

        try {

            userDAO.addUser(new User(name, surname));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/userlist");
    }
}
