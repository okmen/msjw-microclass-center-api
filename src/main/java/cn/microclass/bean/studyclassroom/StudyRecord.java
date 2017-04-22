package cn.microclass.bean.studyclassroom;

import java.io.Serializable;

public class StudyRecord implements Serializable{
	
	private String answerDate; //答题日期
	
	//private  int isComplete; //是否完成  答题结果
	
	private String  isComplete; //答题结果
	
	private int  ansLogarithm; //答题对数
	
	private String answerBatch;//答题批次
	

	public String getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}

	public String getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(String isComplete) {
		this.isComplete = isComplete;
	}

	public int getAnsLogarithm() {
		return ansLogarithm;
	}

	public void setAnsLogarithm(int ansLogarithm) {
		this.ansLogarithm = ansLogarithm;
	}

	public String getAnswerBatch() {
		return answerBatch;
	}

	public void setAnswerBatch(String answerBatch) {
		this.answerBatch = answerBatch;
	}

	@Override
	public String toString() {
		return "StudyRecord [answerDate=" + answerDate + ", isComplete=" + isComplete + ", ansLogarithm=" + ansLogarithm
				+ ", answerBatch=" + answerBatch + ", getAnswerDate()=" + getAnswerDate() + ", getIsComplete()="
				+ getIsComplete() + ", getAnsLogarithm()=" + getAnsLogarithm() + ", getAnswerBatch()="
				+ getAnswerBatch() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
