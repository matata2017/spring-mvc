package com.xxy.mvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.xxy.mvc.entity.Chap;
import com.xxy.mvc.entity.Cours;
import com.xxy.mvc.service.CourseService;
/**
 * 
 * @author xxy
 * 实现接口  根据 coursId 来找到对应的课程
 * @version 1.0
 * 1.0 中暂时没有连接数据库 因此 直接SET值
 *
 *@return
 *返回的一个课程对象
 */
@Service("CourseService")
public class CoursServiceImpl implements CourseService {
	public Cours getCoursById(Integer CoursId) {
		// TODO Auto-generated method stub
		Cours cours = new Cours();//课程
		Chap chap = new Chap();//大纲
		Chap chap2 = new Chap();
		chap.setChapId(001);
		chap.setChapRmk("spring mvc");
		chap2.setChapId(002);
		chap2.setChapRmk("spring mvc2");
		List<Chap> chaplist = new ArrayList<Chap>();
		chaplist.add(chap);
		chaplist.add(chap2);
		cours.setCoursId(CoursId);
		cours.setCoursNm("xxy de  spring mvc");
		cours.setChaplist(chaplist);
		//cours.setChaplist(chaplist);
		return cours;
	}

}
