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

/**
 * Servlet implementation class UpdateDrive
 */
@WebServlet("/UpdateDrive")
public class UpdateDrive extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =request.getReader();
		String angupdData=br.readLine();
		System.out.println(angupdData);
		
		try {
			
			Map<String,String> mapresponse=DriveAction.doUpdateAction(angupdData);
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}

}
