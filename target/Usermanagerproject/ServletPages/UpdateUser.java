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

@WebServlet("/updateuser")
public class UpdateUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        UserDAO userDAO = new UserDAO();

        try {
            userDAO.updateUser(new User(id, req.getParameter("name"), req.getParameter("surname")));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        resp.sendRedirect("/userlist");

    }
}
