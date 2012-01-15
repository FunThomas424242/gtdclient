/* $Id:$ */
/******************************************************************************
 |GTDServiceImpl.java|  -  TODO description

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
import de.meinkonzern.gtdclient.model.GTDModel;

/**
 * @author root
 * 
 */
public class GTDServiceImpl implements GTDService {

    final private GTDModel model = new GTDModel();

    static final private GTDServiceImpl service = new GTDServiceImpl();

    public static GTDServiceImpl newInstance() {
        return service;
    }

    public int getQueuedInputCount() {
        return model.getInputQueueCount();
    }

    /* (non-Javadoc)
     * @see de.meinkonzern.gtdclient.service.GTDService#getTopActionOfInputStack()
     */
    @Override
    public Action getTopActionOfInputStack() {
        return model.getTopActionOfInputStack();
    }

    /* (non-Javadoc)
     * @see de.meinkonzern.gtdclient.service.GTDService#createNewTopActionOfInputStack()
     */
    @Override
    public Action createNewTopActionOfInputStack() {
        return model.createNewTopActionOfInputStack();
    }

    // einsortieren
    public void insertAction(final Action action) {
        model.addActionToList(action);
    }

    /* (non-Javadoc)
     * @see de.meinkonzern.gtdclient.service.GTDService#getInputList()
     */
    @Override
    public ArrayList<Action> getInputListWithoutTop() {
        return model.getInputListWithoutTop();
    }

    /* (non-Javadoc)
     * @see de.meinkonzern.gtdclient.service.GTDService#setActionDescription(de.meinkonzern.gtdclient.model.Action, java.lang.String)
     */
    @Override
    public void setTopActionDescription(String description) {
        model.setTopActionDescription(description);
    }

    /* (non-Javadoc)
     * @see de.meinkonzern.gtdclient.service.GTDService#hasTopAction()
     */
    @Override
    public boolean hasTopAction() {
        return model.hasTopAction();
    }

    /* (non-Javadoc)
     * @see de.meinkonzern.gtdclient.service.GTDService#setTopActionDescription(de.meinkonzern.gtdclient.model.Action, java.lang.String)
     */
    @Override
    public void setTopActionDescription(Action topAction, String description) {
        model.setTopActionDescription(description);
    }

    /* (non-Javadoc)
     * @see de.meinkonzern.gtdclient.service.GTDService#getActionDescriptionOfTopInputStack()
     */
    @Override
    public String getActionDescriptionOfTopInputStack() {
        Action action= model.getTopActionOfInputStack();
        String description="<none>";
        if( action!=null){
            action.getDescription();
        }
        return description;
    }
}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
