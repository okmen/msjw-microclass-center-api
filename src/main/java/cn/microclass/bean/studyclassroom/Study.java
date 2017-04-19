package cn.microclass.bean.studyclassroom;

import java.io.Serializable;
import java.util.List;

public class Study implements Serializable {
	
	private String classroomId; //列表ID
	
	private String userName; //用户名称
	
	private String drive; //用户行驶证
	
	private String identityCard; //用户身份证
	
	private String scoreStartDate; //计分开始周期
	
	private String scoreEndDate; //积分结束周期
	
	private String integral; //累计积分
	
	private List<StudyRecord> studyRecord; //学习记录0到多条
	
	private String answerDate; //答题时间
	
	private int isComplete;
	
	private String ansLogarithm;
	
	private String mobilephone;
	
	private String subjectId; //取题编号
	
	private String interfaceId; //接口编号
	private String answerDateTime;//取题时间
	
	private String subjectName;//题目名称
	private String answerA; //答案A
	private String answerB; //答案B
	private String answerC; //答案C
	private String answerD; //答案D
	
	private int subjecttype; //取题类型  1代表文字类型,2代表图片类型
	
	private String testQuestionsType; //试题类型  判断题，选择题
	
	private String serviceType; //业务类型
	
	private String subjectImg; //题目图片路径 
	
	//private String subjectAnswer;//答案选项
	
	private String answerTime;//答题时间
	
	private int answererror;//答题错数
	
	private int surplusAnswe;//剩余题数
	
	private int answerState; //答题状态  0代表当天无法再次进行消分学习 	1可以答题	2代表今天消分学习已答对10题，请明天继续 3.已经答满20题 不能继续答题了
	private String batchResult;//批次结果
	private List<Answeroptions> answeroptions; //答案选项
	
	private String subjectAnswer; //答题答案
	private int answerCount; //答题总数
	private int answerCorrect;//答对题数
	private String ipAddress;//IP地址
	private String userSource;
	private String code;
	private String msg;
	private Object data;
	private String decisionId;//决定书编号
	private String trainResult;// 培训结果  
	/**
	 * 用户id
	 */
	
    private String userid;
	/**
	 * 用户密码
	 */
   
    private String userpwd;
    /**
     * 请求地址
     */
   
    private String url;
    /**
     * 方法
     */
    
    private String method;
    /**
     * 秘钥
     */
    private String key;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(String classroomId) {
		this.classroomId = classroomId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getScoreStartDate() {
		return scoreStartDate;
	}

	public void setScoreStartDate(String scoreStartDate) {
		this.scoreStartDate = scoreStartDate;
	}

	public String getScoreEndDate() {
		return scoreEndDate;
	}

	public void setScoreEndDate(String scoreEndDate) {
		this.scoreEndDate = scoreEndDate;
	}



	
	public String getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}



	public String getAnsLogarithm() {
		return ansLogarithm;
	}

	public void setAnsLogarithm(String ansLogarithm) {
		this.ansLogarithm = ansLogarithm;
	}

	


	public int getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(int isComplete) {
		this.isComplete = isComplete;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjecttype() {
		return subjecttype;
	}



	public void setTestQuestionsType(String testQuestionsType) {
		this.testQuestionsType = testQuestionsType;
	}

	public String getSubjectImg() {
		return subjectImg;
	}

	public void setSubjectImg(String subjectImg) {
		this.subjectImg = subjectImg;
	}


	public String getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}

	public int getAnswererror() {
		return answererror;
	}

	public void setAnswererror(int answererror) {
		this.answererror = answererror;
	}

	public int getSurplusAnswe() {
		return surplusAnswe;
	}

	public void setSurplusAnswe(int surplusAnswe) {
		this.surplusAnswe = surplusAnswe;
	}

	public int getAnswerState() {
		return answerState;
	}

	public void setAnswerState(int answerState) {
		this.answerState = answerState;
	}

	public List<Answeroptions> getAnsweroptions() {
		return answeroptions;
	}

	public void setAnsweroptions(List<Answeroptions> answeroptions) {
		this.answeroptions = answeroptions;
	}

	public String getSubjectAnswer() {
		return subjectAnswer;
	}

	public void setSubjectAnswer(String subjectAnswer) {
		this.subjectAnswer = subjectAnswer;
	}

	public int getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}

	

	public List<StudyRecord> getStudyRecord() {
		return studyRecord;
	}

	public void setStudyRecord(List<StudyRecord> studyRecord) {
		this.studyRecord = studyRecord;
	}


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getInterfaceId() {
		return interfaceId;
	}
	public void setInterfaceId(String interfaceId) {
		this.interfaceId = interfaceId;
	}
	public String getAnswerDateTime() {
		return answerDateTime;
	}
	public void setAnswerDateTime(String answerDateTime) {
		this.answerDateTime = answerDateTime;
	}
	public String getTestQuestionsType() {
		return testQuestionsType;
	}
	public void setSubjecttype(int subjecttype) {
		this.subjecttype = subjecttype;
	}
	public String getIntegral() {
		return integral;
	}
	public void setIntegral(String integral) {
		this.integral = integral;
	}
	public int getAnswerCorrect() {
		return answerCorrect;
	}
	public void setAnswerCorrect(int answerCorrect) {
		this.answerCorrect = answerCorrect;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getAnswerA() {
		return answerA;
	}
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	public String getAnswerB() {
		return answerB;
	}
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	public String getAnswerC() {
		return answerC;
	}
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	public String getAnswerD() {
		return answerD;
	}
	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}
	public String getBatchResult() {
		return batchResult;
	}
	public void setBatchResult(String batchResult) {
		this.batchResult = batchResult;
	}
	public String getDecisionId() {
		return decisionId;
	}
	public void setDecisionId(String decisionId) {
		this.decisionId = decisionId;
	}
	public String getTrainResult() {
		return trainResult;
	}
	public void setTrainResult(String trainResult) {
		this.trainResult = trainResult;
	}

}
