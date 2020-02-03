package com.dtr.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dtr.drive.manager.DriveManager;
import com.dtr.pojo.Drive;
import com.dtr.utilities.JsonMapper;

/**
 * Servlet implementation class FetchDrives
 */
@WebServlet("/FetchDrives")
public class FetchDrives extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			response.setHeader("Access-Control-Allow-Origin","*");
			ArrayList<Drive> list=DriveManager.fetchDriveList();
			String jsonDriveList=JsonMapper.getJSONFromObject(list);
			response.getWriter().write(jsonDriveList);
			
		} catch (Exception e) {
			// TODO: handle exception
	}
		
		
		
	}

}
