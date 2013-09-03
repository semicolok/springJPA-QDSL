package com.jknyou.work.model;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Board extends BaseEntity<Long>{
	private static final long serialVersionUID = -8752351843473449759L;
	private String title;
	private String content;
	private String writer;
	private Date updatedTime = new Date();
}
