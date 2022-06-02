
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HayleY
 */


@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/AgeCalculatorServlet"})
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //this will load a sap
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        String age = request.getParameter("age_user");
        int ageCalc = Integer.parseInt(age);
        request.setAttribute("age", ageCalc);
        ageCalc++;
        //calculations
        String ageCalcMsg = ("Your age next birthday will be " + ageCalc);
        
        //validation
        if(ageCalc <= 0){
            String message = ("you must enter your current age");
            //set the error mssge as the request object as an attribute 
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
        }
        request.setAttribute("ageCalcMsg", ageCalcMsg);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }
}
