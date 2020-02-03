package com.dtr.drive.manager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import com.dtr.drive.dao.DriveDao;
import com.dtr.pojo.Drive;
import com.dtr.utilities.Dbconnection;

public class DriveManager {

	public static Map<String, String> createNewDrive(Drive driveObj) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=Dbconnection.getConnection();
		System.out.println("in manager="+driveObj);
		Map<String, String>mapResponse=DriveDao.insertDrive(driveObj,con);
		return mapResponse;
	}

	public static ArrayList<Drive> fetchDriveList() {
		// TODO Auto-generated method stub
		
		Connection con = null;
		ArrayList<Drive> drivesList =null;
		
		// show alt shift r
		try {
			con = Dbconnection.getConnection();
			drivesList = DriveDao.getDrivesFromDb(con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return drivesList;
	}

	public static Map<String, String> updateDriveManager(Drive driveUpdateObj) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Map<String, String>mapresponse=null;
		
		// show alt shift r
		try {
			con = Dbconnection.getConnection();
			mapresponse = DriveDao.updateDrive(driveUpdateObj,con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return mapresponse;
	}

	public static Map<String, String> deleteDriveManager(int compId) {
		// TODO Auto-generated method stub
		Connection con = null;
		Map<String, String>mapresponse=null;
		
		// show alt shift r
		try {
			con = Dbconnection.getConnection();
			mapresponse = DriveDao.deleteDrive(compId,con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return mapresponse;
		
		
	}
	}

	


