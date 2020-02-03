package com.dtr.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.dtr.drive.action.DriveAction;
import com.dtr.drive.manager.DriveManager;
import com.dtr.pojo.Drive;
import com.dtr.utilities.JsonMapper;

/**
 * Servlet implementation class DriveServlet
 */
@WebServlet("/DriveServlet")
public class DriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =request.getReader();
		String angData=br.readLine();
		
//		try {
//			JSONObject jsonObjString=new JSONObject(angData);
			//System.out.println(jsonString);
//		} catch (JSONException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			Map<String, String> mapResponse=DriveAction.doAction(angData);
			String jsonResponse=JsonMapper.getJSONFromObject(mapResponse);
			response.getWriter().write(jsonResponse);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
