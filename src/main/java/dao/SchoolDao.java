package dao;

import java.util.Date;
import java.util.List;

import bean.School;

public interface SchoolDao {
	public void addSchool(School school);
	public void updateSchool(School school);
	public void deleteSchool(int sch_id);
	public School getSchoolbyId(int sch_id);
	public School getSchoolbyName(String sch_name);  //get School by school name
	public School getSchoolbyReligon(String sch_religon);
	public School getSchoolbyState(String sch_state);
	public School getSchoolbyDealLine(Date deadline);
	public School getSchoolbySat(int sch_Sat);
	public School getSchoolbyTuitionFee(int sch_fee);
	public List<School> getAllSchool();
	
	
	
	
}
