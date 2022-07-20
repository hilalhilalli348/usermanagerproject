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


        if (req.getParameter("name").length() >= 3 && req.getParameter("surname").length() >= 3) {

            UserDAO userDAO = new UserDAO();

            int id = Integer.parseInt(req.getParameter("id"));
            try {
                userDAO.updateUser(new User(id, req.getParameter("name"), req.getParameter("surname")));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


            resp.sendRedirect("/userlist");

        } else {
            req.setAttribute("user",
                    new User(
                            Integer.parseInt(req.getParameter("id")),
                            req.getParameter("name"),
                            req.getParameter("surname")
                    )
            );

            req.setAttribute("is_correct", "Ad və ya Soyadın uzunluğu kifayət qədər deyil");
            req.getRequestDispatcher("/update")
                    .forward(req, resp);
        }
    }
}
