package io.sdb.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysLog<M extends BaseSysLog<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setOperation(java.lang.String operation) {
		set("operation", operation);
	}
	
	public java.lang.String getOperation() {
		return getStr("operation");
	}

	public void setMethod(java.lang.String method) {
		set("method", method);
	}
	
	public java.lang.String getMethod() {
		return getStr("method");
	}

	public void setParams(java.lang.String params) {
		set("params", params);
	}
	
	public java.lang.String getParams() {
		return getStr("params");
	}

	public void setTime(java.lang.Long time) {
		set("time", time);
	}
	
	public java.lang.Long getTime() {
		return getLong("time");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}
	
	public java.lang.String getIp() {
		return getStr("ip");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}
	
	public java.util.Date getCreateDate() {
		return get("create_date");
	}

}
