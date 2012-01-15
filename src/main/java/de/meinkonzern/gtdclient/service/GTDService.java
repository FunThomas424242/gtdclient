/* $Id:$ */
/******************************************************************************
 |GTDService.java|  -  TODO description

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
package de.meinkonzern.gtdclient.service;

import java.util.ArrayList;

import de.meinkonzern.gtdclient.model.Action;

/**
 * @author root
 *
 */
public interface GTDService {

    public int getQueuedInputCount();

    /**
     * @return
     */
    public Action getTopActionOfInputStack();

    /**
     * @return
     */
    public Action createNewTopActionOfInputStack();

    /**
     * @return
     */
    public ArrayList<Action> getInputListWithoutTop();

    /**
     * @param action
     * @param description
     */
    public void setTopActionDescription(String description);

    /**
     * @return
     */
    public boolean hasTopAction();

    /**
     * @param topAction
     * @param description
     */
    public void setTopActionDescription(Action topAction, String description);

    /**
     * @return
     */
    public String getActionDescriptionOfTopInputStack();

}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
