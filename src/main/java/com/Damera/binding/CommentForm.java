package com.Damera.binding;

import lombok.Data;



public class CommentForm {

	private Integer blogId;
	private String guestName;
	private String guestEmail;
	private String comment;
	/**
	 * @return the blogId
	 */
	public Integer getBlogId() {
		return blogId;
	}
	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}
	/**
	 * @return the guestName
	 */
	public String getGuestName() {
		return guestName;
	}
	/**
	 * @param guestName the guestName to set
	 */
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	/**
	 * @return the guestEmail
	 */
	public String getGuestEmail() {
		return guestEmail;
	}
	/**
	 * @param guestEmail the guestEmail to set
	 */
	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
