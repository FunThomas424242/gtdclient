/* $Id:$ */
/******************************************************************************
 |Reiter1DialogConstants.java|  -  TODO description

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

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * @author root
 *
 */
public interface Reiter1DialogConstants extends GuiConstants, KeyConstants,
        EventConstants {

    public final Icon ICON_INPUT = new ImageIcon(GuiConstants.class
            .getResource("/img/BlätterStapel_32x32.gif"));

    public final Icon ICON_PASTTICKLER = new ImageIcon(GuiConstants.class
            .getResource("/img/greminus.gif"));

    public final Icon ICON_INFO = new ImageIcon(GuiConstants.class
            .getResource("/img/greplus.gif"));

    public final Icon ICON_WAITLIST = new ImageIcon(GuiConstants.class
            .getResource("/img/gremail.gif"));

    public final Icon ICON_REVIEW = new ImageIcon(GuiConstants.class
            .getResource("/img/grequest.gif"));
    
    public final Icon ICON_MANAGEMENT = new ImageIcon(GuiConstants.class
            .getResource("/img/greinfo.gif"));

    public final Icon ICON_NEXTSTEP = new ImageIcon(GuiConstants.class
            .getResource("/img/grenext20x20.gif"));
}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
