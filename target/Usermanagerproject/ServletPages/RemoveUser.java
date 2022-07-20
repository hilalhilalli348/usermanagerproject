package ServletPages;


import DAO.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/removeuser")
public class RemoveUser extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        UserDAO userDAO = new UserDAO();

        Long userID = Long.valueOf(req.getParameter("id"));

        try {

            userDAO.removeUser(userID);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/userlist");

    }
}
