package com.xxy.mvc.entity;

import java.util.List;
/**
 * 
 * @author xxy
 * </br>
 *课程pojo
 *</br> 
 *注意 各个属性前两个字母都不能大写
 *</br> 
 *否则JSP可能找不到对应的属性
 *
 */
public class Cours {
	private int coursId;//课程ID
	public String coursNm;//课程NM
	private  List<Chap>	chaplist;//课程大纲
	public int getCoursId() {
		return coursId;
	}
	public void setCoursId(int coursId) {
		this.coursId = coursId;
	}
	public String getCoursNm() {
		return coursNm;
	}
	public void setCoursNm(String coursNm) {
		this.coursNm = coursNm;
	}
	public List<Chap> getChaplist() {
		return chaplist;
	}
	public void setChaplist(List<Chap> chaplist) {
		this.chaplist = chaplist;
	}
	
}
