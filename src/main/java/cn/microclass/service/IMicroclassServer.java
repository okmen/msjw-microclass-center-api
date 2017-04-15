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
	 * 行人、非机动车驾驶人道路交通安全学习
	 */
	List<BaseBean> xrAnswerQuey(Study s);
	
	//********************************  行人、非机动车驾驶人道路交通安全学习所有方法  ********************************************************

}
