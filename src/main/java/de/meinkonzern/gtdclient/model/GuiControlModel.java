/* $Id:$ */
/******************************************************************************
 |GuiControlModel.java|  -  TODO description

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


/**
 * @author root
 *
 */
public class GuiControlModel {

    // erfordert Restart der Applikation (GUI bedingt - geht nicht zur Laufzeit)
    private boolean[] tabVisibility = { true, true, true, true, true, true };

    private int selectedTab = 0;

    /**
     * 
     */
    public GuiControlModel() {

        for (int i = 0; i < 6; i++) {
            int tabIndex = i + 1;
            tabVisibility[i] = PreferencesModel.getPreference(
                    PreferencesModel.PREF_TAB + tabIndex
                            + PreferencesModel.ATTR_VISIBLE, true);
        }

    }

    /**
     * @return the selectedTab
     */
    public int getSelectedTab() {
        return selectedTab + 1;
    }

    /**
     * @param selectedTab the selectedTab to set
     */
    public void setSelectedTab(int selectedTab) {
        this.selectedTab = selectedTab - 1;
    }

    /**
     * @param tabIndex
     * @param isVisible
     */
    public void setVisibilityOfTab(int tabIndex, boolean isVisible) {
        int index = tabIndex - 1;
        this.tabVisibility[index] = isVisible;
        PreferencesModel.setPreference(PreferencesModel.PREF_TAB + tabIndex
                + PreferencesModel.ATTR_VISIBLE, isVisible);
        System.out.println("setVisibilityOfTab: " + (index) + " to "
                + isVisible);
    }

    /**
     * @param tabIndex
     * @return
     */
    public boolean getVisibilityOfTab(int tabIndex) {
        System.out.println("getVisibilityOfTab: " + (tabIndex - 1) + " to "
                + tabVisibility[tabIndex - 1]);
        return tabVisibility[tabIndex - 1];
    }

}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
