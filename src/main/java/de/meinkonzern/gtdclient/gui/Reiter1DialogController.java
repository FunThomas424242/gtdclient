/* $Id:$ */
/******************************************************************************
 |Reiter1DialogController.java|  -  TODO description

 begin                : |12.05.2009|
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

import org.gui4j.Gui4j;

import de.meinkonzern.gtdclient.model.GuiControlModel;
import de.meinkonzern.gtdclient.service.GTDService;
import de.meinkonzern.gtdclient.service.GTDServiceImpl;

/**
 * @author root
 *
 */
public class Reiter1DialogController extends AbstractDialogController implements
        Reiter1DialogConstants {

    final private GuiControlModel guiModel;

    final private GTDService service = GTDServiceImpl.newInstance();

    public Reiter1DialogController(final Gui4j gui4jEngine,
            final GuiControlModel guiModel) {
        super(gui4jEngine);
        this.guiModel = guiModel;
    }

    public void selectTab(final int tabIndex) {
        guiModel.setSelectedTab(tabIndex);
        EventConstants.eventNavigationChanged.fireEvent();
        System.out.println("Event NavigationChanged fired");
    }

    public String getInputQueueText() {
        final int inputCount = service.getQueuedInputCount();
        final StringBuffer buf = new StringBuffer();
        buf.append(inputCount);
        buf.append(" Einzusortierende Ideen");
        return buf.toString();
    }

    public boolean hasInput() {
        return (0 < service.getQueuedInputCount());
    }
}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
