package com.dtr.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dtr.drive.action.DriveAction;
import com.dtr.utilities.JsonMapper;

/**
 * Servlet implementation class DeleteDriveServlet
 */
@WebServlet("/DeleteDriveServlet")
public class DeleteDriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=request.getReader();
		String deldata=br.readLine();
		System.out.println(deldata);
		
		try {
			Map<String, String> mapresponse= DriveAction.doDeleteAction(deldata);
			String jsonResponse=JsonMapper.getJSONFromObject(mapresponse);
			response.getWriter().write(jsonResponse);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
