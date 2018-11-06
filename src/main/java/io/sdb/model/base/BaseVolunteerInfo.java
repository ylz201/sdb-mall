package io.sdb.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseVolunteerInfo<M extends BaseVolunteerInfo<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setIdType(java.lang.Integer idType) {
		set("id_type", idType);
	}
	
	public java.lang.Integer getIdType() {
		return getInt("id_type");
	}

	public void setIdCard(java.lang.String idCard) {
		set("id_card", idCard);
	}
	
	public java.lang.String getIdCard() {
		return getStr("id_card");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setGender(java.lang.Integer gender) {
		set("gender", gender);
	}
	
	public java.lang.Integer getGender() {
		return getInt("gender");
	}

	public void setAge(java.lang.Integer age) {
		set("age", age);
	}
	
	public java.lang.Integer getAge() {
		return getInt("age");
	}

	public void setWork(java.lang.String work) {
		set("work", work);
	}
	
	public java.lang.String getWork() {
		return getStr("work");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public void setAreaId(java.lang.Integer areaId) {
		set("area_id", areaId);
	}
	
	public java.lang.Integer getAreaId() {
		return getInt("area_id");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setComment(java.lang.String comment) {
		set("comment", comment);
	}
	
	public java.lang.String getComment() {
		return getStr("comment");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setCardFront(java.lang.String cardFront) {
		set("card_front", cardFront);
	}
	
	public java.lang.String getCardFront() {
		return getStr("card_front");
	}

	public void setCardBack(java.lang.String cardBack) {
		set("card_back", cardBack);
	}
	
	public java.lang.String getCardBack() {
		return getStr("card_back");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}
	
	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setUpdateDate(java.util.Date updateDate) {
		set("update_date", updateDate);
	}
	
	public java.util.Date getUpdateDate() {
		return get("update_date");
	}

}