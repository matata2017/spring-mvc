package com.xxy.mvc.entity;

import java.util.List;
/**
 * 
 * @author xxy
 * </br>
 *�γ�pojo
 *</br> 
 *ע�� ��������ǰ������ĸ�����ܴ�д
 *</br> 
 *����JSP�����Ҳ�����Ӧ������
 *
 */
public class Cours {
	private int coursId;//�γ�ID
	public String coursNm;//�γ�NM
	private  List<Chap>	chaplist;//�γ̴��
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
