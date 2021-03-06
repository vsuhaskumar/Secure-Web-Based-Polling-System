package com.login;

import com.database.conn.DBConnection;
import com.database.conn.Methods;
import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/* CLASS FOR MANAGER LOGIN */

public class Managerlogin extends HttpServlet
{

    public Managerlogin()
    {
        con = null;
        st = null;
        rs = null;
    }

/* METHOD FOR MANAGER LOGIN */    
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        String a_id = req.getParameter("manager_id");
        String a_pass = req.getParameter("manager_pwd");
        RequestDispatcher rd = null;
        boolean flag = false;
        HttpSession sessionid = req.getSession(true);
        sessionid.setAttribute("x_manager_id", a_id);
        try
        {
        	/* FUNCTION CALL FOR CHECK MANAGER USERNAME AND PASSWORD */
        	flag = Methods.Checkmanager(a_id, a_pass);
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println((new StringBuilder("Flag...")).append(flag).toString());
        if(flag)
        {
            resp.sendRedirect((new StringBuilder(String.valueOf(req.getContextPath()))).append("/Files/JSP/manager/Managerhome.jsp").toString());
        }
        else
        {
            rd = req.getRequestDispatcher("/index.jsp");
            req.setAttribute("Status", "Sorry, your id and password is mismatched");
            rd.forward(req, resp);
        }
        DBConnection.closeResoures(rs, st, con);
        System.out.println("connection closed");
    }

    Connection con;
    Statement st;
    ResultSet rs;
}
