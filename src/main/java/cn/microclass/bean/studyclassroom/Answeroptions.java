package cn.microclass.bean.studyclassroom;

import java.io.Serializable;

public class Answeroptions implements Serializable {

	
	private String answerId; //答题ID
	
	private String  answerIds;//答题隐藏ID
	
	private String answerName; //答题名称

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	public String getAnswerName() {
		return answerName;
	}

	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	@Override
	public String toString() {
		return "Answeroptions [answerId=" + answerId + ", answerName=" + answerName + ", getAnswerId()=" + getAnswerId()
				+ ", getAnswerName()=" + getAnswerName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getAnswerIds() {
		return answerIds;
	}

	public void setAnswerIds(String answerIds) {
		this.answerIds = answerIds;
	}
	
}
