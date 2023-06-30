package com.Damera.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comments")

public class CommentsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	private String guestName;
	private String guestEmail;
	
	@Lob
	private String comment;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	
	
	/**
	 * @return the commentId
	 */
	public Integer getCommentId() {
		return commentId;
	}



	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
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



	/**
	 * @return the createdDate
	 */
	public LocalDate getCreatedDate() {
		return createdDate;
	}



	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}



	/**
	 * @return the blog
	 */
	public BlogsEntity getBlog() {
		return blog;
	}



	/**
	 * @param blog the blog to set
	 */
	public void setBlog(BlogsEntity blog) {
		this.blog = blog;
	}



	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "blog_id")
	private BlogsEntity blog;

}
