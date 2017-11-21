package cn.microclass.service;

import java.util.List;

import cn.microclass.bean.AppVersion;
import cn.microclass.bean.studyclassroom.Study;
import cn.sdk.bean.BaseBean;

/**
 * @author suntao
 */
public interface IMicroclassService {
	
	
	/**
	 * 查询消分业务相关信息  接口 exam003
	 * @return
	 * @throws Exception 
	 */
	List<BaseBean> xfStudyQuery(Study s) throws Exception;
	
	/**
	 * 消分学习随机取题目
	 * @param s
	 * @return
	 * @throws Exception 
	 */
	List<BaseBean> xfStudyAnswer(Study s) throws Exception;
	
	/**
	 * 消分学习答题
	 * @param s
	 * @return
	 */
	List<BaseBean> xfAnswerQuey(Study s) throws Exception;
	//********************************  以上为消分学习所有方法  ********************************************************
			
	/**
	 * 6.34.3	行人、非机动车驾驶人道路交通安全学习查询接口 
	 */
	List<BaseBean> xrStudyQuery(Study s) throws Exception;
	
	/**
	 * 行人、非机动车驾驶人道路交通安全学习随机取题接口 
	 */
	List<BaseBean> xrStudyAnswer(Study s) throws Exception;
	
	/**
	 * 行人、非机动车驾驶人道路交通安全学习答题
	 */
	List<BaseBean> xrAnswerQuey(Study s) throws Exception;
	
	//********************************  行人、非机动车驾驶人道路交通安全学习所有方法  ********************************************************
	
	
	/**
	 * 电动车违法随机取题
	 */
	List<BaseBean> ddcStudyAnswer(Study s)throws Exception;
	
	/**
	 * 电动车违法答题方法
	 */
	List<BaseBean> ddcAnswerQuey(Study s)throws Exception;
	//******************************** 以上为 电动车学习所有方法  ********************************************************
	

	/**
	 * 根据app系统获取对应最新版本
	 * @param system 系统
	 * @return
	 */
    public AppVersion queryNewestAppVersion(String system);
	
	

}
