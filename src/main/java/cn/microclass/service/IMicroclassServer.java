package cn.microclass.service;

import java.util.List;
import java.util.Map;

import cn.microclass.bean.DeviceBean;
import cn.microclass.bean.Token;
import cn.microclass.bean.UserOpenidBean;
import cn.microclass.bean.UserRegInfo;
import cn.microclass.bean.WechatUserInfoBean;
import cn.microclass.bean.studyclassroom.Study;
import cn.sdk.bean.BaseBean;

/**
 * @author suntao
 */
public interface IMicroclassServer {
	
	
	/**
	 * 查询消分业务相关信息  接口 exam003
	 * @return
	 */
	List<BaseBean> xfStudyQuery(Study s);
	
	/**
	 * 消分学习随机取题目
	 * @param s
	 * @return
	 */
	List<BaseBean> xfStudyAnswer(Study s);
	
	/**
	 * 消分学习答题
	 * @param s
	 * @return
	 */
	List<BaseBean> xfAnswerQuey(Study s);
	//********************************  以上为消分学习所有方法  ********************************************************
			
	/**
	 * 6.34.3	行人、非机动车驾驶人道路交通安全学习查询接口 
	 */
	List<BaseBean> xrStudyQuery(Study s);
	
	/**
	 * 行人、非机动车驾驶人道路交通安全学习随机取题接口 
	 */
	List<BaseBean> xrStudyAnswer(Study s);
	
	/**
	 * 行人、非机动车驾驶人道路交通安全学习答题
	 */
	List<BaseBean> xrAnswerQuey(Study s);
	
	//********************************  行人、非机动车驾驶人道路交通安全学习所有方法  ********************************************************
	
	/**
	 *  电动车违法学习查询
	 */
	List<BaseBean> ddcStudyQuery(Study s);
	
	/**
	 * 电动车违法随机取题
	 */
	List<BaseBean> ddcStudyAnswer(Study s);
	
	/**
	 * 电动车违法答题方法
	 */
	List<BaseBean> ddcAnswerQuey(Study s);
	//******************************** 以上为 电动车学习所有方法  ********************************************************
	
	/**
	 *  满学习查询
	 */
	List<BaseBean> mfStudyQuery(Study s);
	
	/**
	 * 满学习违法随机取题
	 */
	List<BaseBean> mfStudyAnswer(Study s);
	
	/**
	 * 满学习违法答题方法
	 */
	List<BaseBean> mfAnswerQuey(Study s);
	//******************************** 以上为 满分学习所有方法  ********************************************************
	
	/**
	 *  B类习查询
	 */
	List<BaseBean> blStudyQuery(Study s);
	
	/**
	 * B类学习违法随机取题
	 */
	List<BaseBean> blStudyAnswer(Study s);
	
	/**
	 * B类学习违法答题方法
	 */
	List<BaseBean> blAnswerQuey(Study s);
	//******************************** 以上为B类分学习所有方法  ********************************************************
	
	
	List<BaseBean> classroomStudyfind(Study s);
	
	
	

}
