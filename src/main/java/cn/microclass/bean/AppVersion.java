package cn.microclass.bean;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AppVersion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6912462288333390729L;

	private Integer id;
	private String system;//系统
	private String version;//版本号
	private String forceUpdate;//是否强制更新 0-否 1-是
	private String url;//下载地址
	private String createTime;//创建时间
	private String description;//描述
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getForceUpdate() {
		return forceUpdate;
	}
	public void setForceUpdate(String forceUpdate) {
		this.forceUpdate = forceUpdate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
