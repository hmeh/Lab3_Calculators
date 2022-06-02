
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
 * @author Hayle
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        String numFirst = request.getParameter("first_num");
        String numSecond = request.getParameter("second_num");

        //validation
        if(numFirst.equals("") || numSecond.equals("")){
             String message = ("Invalid");
            //set the error mssge as the request object as an attribute 
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;  
        }
        
        int firstCalc = Integer.parseInt(numFirst);
        int secondCalc = Integer.parseInt(numSecond);
        request.setAttribute("first", firstCalc);
        request.setAttribute("second", secondCalc);
        
        //calculations
        int result = 0;
        
        if(request.getParameter("calcbtn").equals("+")){
            result = firstCalc + secondCalc;
        }else if(request.getParameter("calcbtn").equals("-")){
            result = firstCalc - secondCalc;
        }else if(request.getParameter("calcbtn").equals("*")){
            result = firstCalc * secondCalc;
        }else if(request.getParameter("calcbtn").equals("%")){
            result = firstCalc % secondCalc;
        }
        
        
        request.setAttribute("CalcMsg", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }
}
