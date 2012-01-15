/* $Id:$ */
/******************************************************************************
 |GuiConstants.java|  -  TODO description

 begin                : |12.10.2008|
 copyright            : (C) |2008| by |SchubertT006|
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

import java.awt.Color;
import java.awt.Font;
import java.awt.TrayIcon;

import javax.swing.ImageIcon;

/**
 * @author SchubertT006
 *
 */
public interface GuiConstants {

    public final boolean TRUE = Boolean.TRUE;

    public final boolean FALSE = Boolean.FALSE;
    
    
    public final Font FONT_PLAIN = new Font("Arial",Font.PLAIN,12);
    public final Font FONT_BOLD = FONT_PLAIN.deriveFont(Font.BOLD);
    public final Font FONT_ITALIC = FONT_PLAIN.deriveFont(Font.ITALIC);

    public final String PATH_GUI4J_PROPERTIES = "gui4jComponents.properties";

    public final String LABEL_EXIT = "Schlieﬂen         ESC";

    public final String TOOLTIP_EXIT = "Raus hier";

    public final String LABEL_SAVE = "Speichern         Ctrl+S";

    public final String TOOLTIP_SAVE = "Daten speichern";

    public final String LABEL_COPYRIGHT = "Erstellt (c) 2009 von Thomas Schubert unter GNU Public License.";

    public final String PATH_APPLICATION_GIF = "/img/appIcon.gif";

    public final ImageIcon IMAGE_APPLICATION = new ImageIcon(GuiConstants.class
            .getResource(PATH_APPLICATION_GIF));

    public final TrayIcon TRAY_ICON = new TrayIcon(GuiConstants.IMAGE_APPLICATION
            .getImage());
    
    public final ImageIcon ICON_SAVE = new ImageIcon(GuiConstants.class
            .getResource("/img/gredisk.gif"));

    public final ImageIcon ICON_EXIT = new ImageIcon(GuiConstants.class
            .getResource("/img/tueren-27800-32x32.gif"));

    public final String PATH_BACKGROUND_IMG = "/img/aqua.jpg";

    public final Color PATH_BACKGROUND_COLOR = Color.CYAN;

}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
