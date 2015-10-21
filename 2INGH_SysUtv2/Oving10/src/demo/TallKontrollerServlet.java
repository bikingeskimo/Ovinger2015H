package demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Roger on 21/10/2015.
 */
@WebServlet(name = "TallKontrollerServlet")
public class TallKontrollerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            String t1 = request.getParameter("tall1");
            String t2 = request.getParameter("tall2");

            int sum = 0;

            if (t1 != null && t2 != null){
                int tall1 = Integer.parseInt(t1);
                int tall2 = Integer.parseInt(t2);
                sum = tall1 + tall2;
            }
            request.setAttribute("summenAvTallene", new Integer(sum));

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/sum_jsp_view.jsp");
            dispatcher.forward(request,response);
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
