package com.dtr.constant;

public class ConstantDbQueries {
	
	public static String STR_DRIVE_INSERT="INSERT INTO drive(company_name, no_of_rsrcs, exp_req, ctc, join_crt, bond, position, follow_up, edu_crt, cur_status, nxt_act, nxt_date, ps_yr_req, gap_req, creation_date, tpoid) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static String STR_DRIVE_UPDATE="UPDATE `drive` SET `company_name` =?, `no_of_rsrcs` =?, `exp_req` =?, `ctc` =?, `join_crt` =?, `bond` =?, `position` =?, `follow_up` =?, `edu_crt` =?, `cur_status` =?, `nxt_act` =?, `nxt_date` =?, `ps_yr_req` =?, `gap_req` =?, `creation_date` =?, `tpoid` =? WHERE (`d_id` =?);";
}
