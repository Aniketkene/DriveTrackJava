package com.dtr.drive.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.dtr.constant.ConstantDbQueries;
import com.dtr.pojo.Drive;

public class DriveDao {

	 
	public static Map<String, String> insertDrive(Drive driveObj, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		int affectedRows=0;
		HashMap<String, String> mapResponse=new HashMap<>();
				
			System.out.println("in insert drive="+driveObj);
			PreparedStatement pst=con.prepareStatement(ConstantDbQueries.STR_DRIVE_INSERT);
			pst.setString(1,driveObj.getCompanyName());
			pst.setInt(2,driveObj.getResourcesNo());
			pst.setInt(3,driveObj.getExperienceReq());
			pst.setFloat(4,driveObj.getCtcOffer());
			pst.setInt(5,driveObj.getJoinCriterion());
			pst.setFloat(6,driveObj.getBondYrs());
			pst.setInt(7,driveObj.getPositionDesc());
			pst.setDate(8,driveObj.getDateFollowup());
			pst.setInt(9,driveObj.getEducationCtr());
			pst.setInt(10,driveObj.getCurrentStats());
			pst.setInt(11,driveObj.getNxtAction());
			pst.setDate(12,driveObj.getDtNxtAction());
			pst.setInt(13,driveObj.getReqPassYr());
			pst.setInt(14,driveObj.getReqGap());
			pst.setDate(15,driveObj.getDtDrivCreation());
			pst.setInt(16,driveObj.getIdTpo());
			
			System.out.println("before excute update");
			
			affectedRows = pst.executeUpdate();
			
			System.out.println("after excute update="+affectedRows);
			if (affectedRows == 1)
			{
				mapResponse.put("Msg", "SuccessFul Insertion");
			}
			else
			{
				mapResponse.put("Msg", "Error_In_Insertion");
			}
	
		
		System.out.println("map response="+mapResponse);
		return mapResponse;
	}

	public static ArrayList<Drive> getDrivesFromDb(Connection con) {
		// TODO Auto-generated method stub
		ArrayList<Drive> list = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			list = new ArrayList<Drive>();
			pstmt = con.prepareStatement("select * from drive");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Drive s = new Drive();
				s.setDriveId(rs.getInt(1));
				s.setCompanyName(rs.getString(2));
				s.setResourcesNo(rs.getInt(3));
				s.setExperienceReq(rs.getInt(4));
				s.setCtcOffer(rs.getFloat(5));
				s.setJoinCriterion(rs.getInt(6));
				s.setBondYrs(rs.getFloat(7));
				s.setPositionDesc(rs.getInt(8));
				s.setDateFollowup(rs.getDate(9));
				s.setEducationCtr(rs.getInt(10));
				s.setCurrentStats(rs.getInt(11));
				s.setNxtAction(rs.getInt(12));
				s.setDtNxtAction(rs.getDate(13));
				s.setReqPassYr(rs.getInt(14));
				s.setReqGap(rs.getInt(15));
				s.setDtDrivCreation(rs.getDate(16));
				s.setIdTpo(rs.getInt(17));
								
				list.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				// pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public static Map<String, String> updateDrive(Drive driveUpdateObj, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		
		int affectedRows=0;
		HashMap<String, String> mapResponse=new HashMap<>();
				
			System.out.println("in insert drive="+driveUpdateObj);
			PreparedStatement pst=con.prepareStatement(ConstantDbQueries.STR_DRIVE_UPDATE);
			pst.setString(1,driveUpdateObj.getCompanyName());
			pst.setInt(2,driveUpdateObj.getResourcesNo());
			pst.setInt(3,driveUpdateObj.getExperienceReq());
			pst.setFloat(4,driveUpdateObj.getCtcOffer());
			pst.setInt(5,driveUpdateObj.getJoinCriterion());
			pst.setFloat(6,driveUpdateObj.getBondYrs());
			pst.setInt(7,driveUpdateObj.getPositionDesc());
			pst.setDate(8,driveUpdateObj.getDateFollowup());
			pst.setInt(9,driveUpdateObj.getEducationCtr());
			pst.setInt(10,driveUpdateObj.getCurrentStats());
			pst.setInt(11,driveUpdateObj.getNxtAction());
			pst.setDate(12,driveUpdateObj.getDtNxtAction());
			pst.setInt(13,driveUpdateObj.getReqPassYr());
			pst.setInt(14,driveUpdateObj.getReqGap());
			pst.setDate(15,driveUpdateObj.getDtDrivCreation());
			pst.setInt(16,driveUpdateObj.getIdTpo());
			pst.setInt(17, driveUpdateObj.getDriveId());
			
			System.out.println("before excute update");
			
			affectedRows = pst.executeUpdate();
			
			System.out.println("after excute update="+affectedRows);
			if (affectedRows == 1)
			{
				mapResponse.put("Msg", "SuccessFul updation");
			}
			else
			{
				mapResponse.put("Msg", "Error_In_Updation");
			}
	
		
		System.out.println("map response="+mapResponse);
		return mapResponse;
	}

	public static Map<String, String> deleteDrive(int compId, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		int affectedRows=0;
		HashMap<String, String> mapResponse=new HashMap<>();
				
			
			PreparedStatement pst=con.prepareStatement("Delete from drive where d_id=?");
			
			pst.setInt(1,compId);
				
			affectedRows = pst.executeUpdate();
			
			System.out.println("after excute update="+affectedRows);
			if (affectedRows == 1)
			{
				mapResponse.put("Msg", "SuccessFul Deleted");
			}
			else
			{
				mapResponse.put("Msg", "Error_In_Deletion");
			}
	
		
		System.out.println("map response="+mapResponse);
		return mapResponse;
	}
		
}


