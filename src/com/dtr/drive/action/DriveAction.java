package com.dtr.drive.action;


import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.dtr.drive.manager.DriveManager;
import com.dtr.pojo.Drive;
import com.dtr.utilities.JsonMapper;

public class DriveAction {
	
	public static DriveAction getInstance() 
	{
		DriveAction driveAction=null;
		if(driveAction==null) 
		{
			driveAction=new DriveAction();
		}
			return driveAction;
	}
	
	public static Map<String,String> doAction(String angstring) throws SQLException
	{
		Drive driveObj=(Drive)JsonMapper.getObjectFromJSON(angstring,Drive.class);
		System.out.println("inside Action Layer"+driveObj);
		Map<String,String> mapResponse= DriveManager.createNewDrive(driveObj);
		return mapResponse;
	}

	public static Map<String, String> doUpdateAction(String angupdData) {
		// TODO Auto-generated method stub
		Drive driveUpdateObj=(Drive) JsonMapper.getObjectFromJSON(angupdData,Drive.class);
		Map<String,String> mapResponse=DriveManager.updateDriveManager(driveUpdateObj);
		return mapResponse;
	}

	public static Map<String, String> doDeleteAction(String deldata) {
		// TODO Auto-generated method stub
		int compId=Integer.parseInt(deldata);
		Map<String, String> mapresponse=DriveManager.deleteDriveManager(compId);
		return mapresponse;
	}	

}
