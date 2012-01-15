/* $Id:$ */
/******************************************************************************
 |Reiter2DialogController.java|  -  TODO description

 begin                : |14.05.2009|
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
package de.meinkonzern.gtdclient.gui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.gui4j.Gui4j;

import de.meinkonzern.gtdclient.model.Action;
import de.meinkonzern.gtdclient.model.GuiControlModel;
import de.meinkonzern.gtdclient.service.GTDService;
import de.meinkonzern.gtdclient.service.GTDServiceImpl;

/**
 * @author root
 *
 */
public class Reiter2DialogController extends AbstractDialogController {

    final private GuiControlModel guiModel;

    final private GTDService service = GTDServiceImpl.newInstance();

    // private Action topAction = null;

    private String doDate = "";

    /**
     * constructor method
     * 
     * @param gui4jEngine
     * @param guiModel
     */
    public Reiter2DialogController(final Gui4j gui4jEngine,
            final GuiControlModel guiModel) {
        super(gui4jEngine);
        this.guiModel = guiModel;
    }

    public boolean hasTopAction() {
        return service.hasTopAction();
    }

    public String getActionDescriptionOfTopInputStack() {
        return service.getActionDescriptionOfTopInputStack();
    }

    public void createNewTopActionOfInputStack() {
        service.createNewTopActionOfInputStack();
        System.out.println("createNewTopActionOfInputStack ");
        EventConstants.eventInputActionChanged.fireEvent();
    }

    public void setActionDescription(final String description) {
        System.out.println("setActionDescription of ");
        service.setTopActionDescription(description);
        EventConstants.eventInputActionChanged.fireEvent();
    }

    public Collection<String> getInputList() {
        final ArrayList<Action> list = service.getInputListWithoutTop();
        final Iterator<Action> iterator = list.iterator();

        final Collection<String> collection = new ArrayList<String>(list.size());
        while (iterator.hasNext()) {
            final Action action = iterator.next();
            collection.add(action.getId() + ":" + action.getDescription());
        }
        return collection;
    }

    // old

    public Collection<String> getProjectList() {
        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 30; i++) {
            list.add("Projekt" + Integer.toString(i));
        }
        return list;
    }

    /**
     * @return the doDate
     */
    public String getDoDate() {
        return doDate;
    }

    /**
     * @param doDate the doDate to set
     */
    public void setDoDate(String doDate) {
        this.doDate = doDate;
    }
}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
