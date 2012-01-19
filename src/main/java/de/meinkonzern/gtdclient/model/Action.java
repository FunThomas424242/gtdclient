/* $Id:$ */
/******************************************************************************
 |Action.java|  -  TODO description

 begin                : |15.05.2009|
 copyright            : (C) |2009| by |root|
 email                : |development@thomas-michel.info|
 ******************************************************************************/
/******************************************************************************
 *                                                                            *
 *   This program is free software; you can redistribute it and/or modify     *
 *   it under the terms of the Lesser GNU General Public License as published *
 *   by the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                      *
 *                                                                            *
 ******************************************************************************/
package de.meinkonzern.gtdclient.model;

import java.util.ArrayList;
import java.util.Date;

//import de.meinkonzern.gtdclient.constraints.DescriptionConstraint;

/**
 * @author root
 * 
 */
public class Action {

	private Integer id;

	//@DescriptionConstraint
	private String description;

	private Integer projectId;

	private Date doDate;

	private ArrayList<Place> placeList = new ArrayList<Place>();

	private boolean executeable = false;

	private boolean solved = false;

	private boolean waiting = false;

	private boolean input = true;

	// nur das Model soll Instanzen erstellen können
	protected Action() {

	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId
	 *            the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the doDate
	 */
	public Date getDoDate() {
		return doDate;
	}

	/**
	 * @param doDate
	 *            the doDate to set
	 */
	public void setDoDate(Date doDate) {
		this.doDate = doDate;
	}

	/**
	 * @return the placeList
	 */
	public ArrayList<Place> getPlaceList() {
		return placeList;
	}

	/**
	 * @param placeList
	 *            the placeList to set
	 */
	public void setPlaceList(ArrayList<Place> placeList) {
		this.placeList = placeList;
	}

	/**
	 * @return the executeable
	 */
	public boolean isExecuteable() {
		return executeable;
	}

	/**
	 * @param executeable
	 *            the executeable to set
	 */
	public void setExecuteable(boolean executeable) {
		this.executeable = executeable;
	}

	/**
	 * @return the solved
	 */
	public boolean isSolved() {
		return solved;
	}

	/**
	 * @param solved
	 *            the solved to set
	 */
	public void setSolved(boolean solved) {
		this.solved = solved;
	}

	/**
	 * @return the waiting
	 */
	public boolean isWaiting() {
		return waiting;
	}

	/**
	 * @param waiting
	 *            the waiting to set
	 */
	public void setWaiting(boolean waiting) {
		this.waiting = waiting;
	}

	/**
	 * @return the input
	 */
	public boolean isInput() {
		return input;
	}

	/**
	 * @param input
	 *            the input to set
	 */
	public void setInput(boolean input) {
		this.input = input;
	}

}

/**
 * ChangeLog
 * 
 * $Revision:$
 * 
 */
