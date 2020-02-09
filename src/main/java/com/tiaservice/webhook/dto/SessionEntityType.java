package com.tiaservice.webhook.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SessionEntityType {
	private String name;
	private EntityOverrideMode entityOverrideMode;
	private List<Entity> entities;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the entityOverrideMode
	 */
	public EntityOverrideMode getEntityOverrideMode() {
		return entityOverrideMode;
	}

	/**
	 * @param entityOverrideMode
	 *            the entityOverrideMode to set
	 */
	public void setEntityOverrideMode(EntityOverrideMode entityOverrideMode) {
		this.entityOverrideMode = entityOverrideMode;
	}

	/**
	 * @return the entities
	 */
	public List<Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entities
	 *            the entities to set
	 */
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

}
