/* $Id:$ */
/******************************************************************************
 |GTDModel.java|  -  TODO description

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
import java.util.Stack;

/**
 * @author root
 * 
 */
public class GTDModel {

	final private Stack<Action> inputList = new Stack<Action>();

	final private ArrayList<Action> actionList = new ArrayList<Action>();

	final private ArrayList<Action> historieList = new ArrayList<Action>();

	int sequenceId = 0;

	Action topAction;

	public int getInputQueueCount() {
		return inputList.size();
	}

	public Action getTopActionOfInputStack() {
		if (!inputList.isEmpty()) {
			topAction = inputList.peek();
		}
		return topAction;
	}

	public Action createNewTopActionOfInputStack() {
		topAction = createNewAction();
		inputList.push(topAction);
		return topAction;
	}

	/**
	 * @return
	 */
	protected Action createNewAction() {
		final Action action = new Action();
		action.setInput(true);
		action.setId(++sequenceId);
		return action;
	}

	// einsortieren
	public void addActionToList(final Action action) {
		actionList.add(action);
	}

	/**
	 * @return the actionList
	 */
	public ArrayList<Action> getActionList() {
		return actionList;
	}

	public ArrayList<Action> getInputListWithoutTop() {
		final ArrayList<Action> actions = new ArrayList<Action>();
		final int lastIndex = inputList.size() - 1;
		for (int i = 0; i < lastIndex; i++) {
			actions.add(inputList.elementAt(i));
		}
		return actions;
	}

	public void setTopActionDescription(final String description) {

		topAction.setDescription(description);
	}

	/**
	 * @return
	 */
	public boolean hasTopAction() {
		System.out.println("hasTopAction:" + topAction);
		if (topAction == null) {
			return false;
		}
		return true;
	}

}

/**
 * ChangeLog
 * 
 * $Revision:$
 * 
 */
