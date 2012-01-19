/* $Id:$ */
/******************************************************************************
 |EventConstants.java|  -  TODO description

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

import org.gui4j.event.SimpleEvent;

/**
 * @author root
 *
 */
public interface EventConstants {

    // to mark modify of data
    public final SimpleEvent eventChanged = new SimpleEvent();

    public final SimpleEvent eventSaved = new SimpleEvent();

    public final SimpleEvent eventNavigationChanged = new SimpleEvent();

    
    // Reiter 1
    public final SimpleEvent eventInputActionChanged = new SimpleEvent();
    
    // evtl. nicht benötigt
    public final SimpleEvent eventViewChanged = new SimpleEvent();
}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
