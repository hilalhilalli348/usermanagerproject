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

            resp.setContentType("text/html;charset=UTF-8");


            String name = req.getParameter("name");
            String surname = req.getParameter("surname");

            if (name.length()>=3 && surname.length()>=3){

                // burada eyni adli userin DB-de olub olmadigi yoxlanila biler ve ona fore control yazila biler.
                UserDAO userDAO = new UserDAO();

                try {

                    userDAO.addUser(new User(name, surname));

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                resp.sendRedirect("/userlist");

            }else{
                req.setAttribute("is_correct","Ad və ya Soyadın uzunluğu kifayət qədər deyil");
                req.getRequestDispatcher("/adduser")
                                        .forward(req,resp);
            }






    }

}
