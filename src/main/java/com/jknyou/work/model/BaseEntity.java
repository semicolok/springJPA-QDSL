package com.jknyou.work.model;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity<PK extends Serializable> extends AbstractPersistable<PK>{

	private static final long serialVersionUID = -8669707500586538457L;
	
	@Override
	public void setId(PK id) {
		super.setId(id);
	}

}
