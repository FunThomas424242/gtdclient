/* $Id:$ */
/******************************************************************************
 |PreferencesModel.java|  -  TODO description

 begin                : |19.05.2009|
 copyright            : (C) |2009| by |SchubertT006|
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.prefs.Preferences;

/**
 * @author SchubertT006
 *
 */
public class PreferencesModel {

    /**
     * 
     */
    private static final String PATH_GTDCLIENT_XML = "\\.gtdclient.xml";

    /**
     * 
     */
    private static final String USER_HOME = "user.home";

    final static Preferences preferences = loadPreferences();

    public static final String PREF_TAB = "tab";

    public static final String ATTR_VISIBLE = "visible";

    public PreferencesModel() {
        // only to create a instance for init the static context
        
    }

    /**
     * @throws IOException
     * @throws InvalidPreferencesFormatException
     * @throws FileNotFoundException
     */
    private static Preferences loadPreferences() {
        Properties prop = System.getProperties();
        String userHome = prop.getProperty(PreferencesModel.USER_HOME);
        final Preferences preferences = Preferences.userRoot();
        final File configFile = new File(userHome
                + PreferencesModel.PATH_GTDCLIENT_XML);
        if (!configFile.exists()) {
            try {
                configFile.createNewFile();
            } catch (IOException e) {
                //TODO
                e.printStackTrace();
            }
        }
        try {
            Preferences.importPreferences(new FileInputStream(configFile));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidPreferencesFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return preferences;
    }

    public static void exportPreferences() {
        final Properties prop = System.getProperties();
        String userHome = prop.getProperty(PreferencesModel.USER_HOME);
        final File configFile = new File(userHome
                + PreferencesModel.PATH_GTDCLIENT_XML);
        if (!configFile.exists()) {
            try {
                configFile.createNewFile();
            } catch (IOException e) {
                //TODO
                e.printStackTrace();
            }
        }
        try {
            final FileOutputStream fileOutputStream=new FileOutputStream(configFile);
            preferences.exportSubtree(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BackingStoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * @param string
     * @param isVisible
     */
    public static void setPreference(final String key, final boolean value) {
        preferences.putBoolean(key, value);

    }

    public static boolean getPreference(final String key,
            final boolean defaultValue) {
        return preferences.getBoolean(key, defaultValue);
    }

}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
