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


@WebServlet("/getuser")
public class GetUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user;
        try {
            user  = new UserDAO().getUser(Integer.parseInt(req.getParameter("id")));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (user!=null){

                req.setAttribute("user",user);
                req.getRequestDispatcher("/update")
                        .forward(req,resp);


        }

    }
}
