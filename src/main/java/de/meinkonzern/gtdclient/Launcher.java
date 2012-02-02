package de.meinkonzern.gtdclient;

import java.net.URL;

import org.gui4j.Gui4j;
import org.gui4j.Gui4jFactory;

import de.meinkonzern.gtdclient.gui.GuiConstants;
import de.meinkonzern.gtdclient.gui.MainDialogController;
import de.meinkonzern.gtdclient.model.PreferencesModel;

public class Launcher {

    /* (non-Java-doc)
     * @see java.lang.Object#Object()
     */
    private Launcher() {
        super();

    }

    public static void main(final String args[]) {

        @SuppressWarnings("unused")
        final PreferencesModel preferencesModel = new PreferencesModel();
        //
        final boolean validateXML = true;
        final boolean logInvoke = false;
        final int numberOfWorkerThreads = -1;
        
        
        final URL gui4jPropertieUrl = Launcher
                .getResource("dialogLayouts/"+GuiConstants.PATH_GUI4J_PROPERTIES);
        System.out.println("URL:"+gui4jPropertieUrl.toString());
        final Gui4j gui4jEngine = Gui4jFactory.createGui4j(validateXML,
                logInvoke, numberOfWorkerThreads, gui4jPropertieUrl);
        @SuppressWarnings("unused")
        final MainDialogController mainDialog = new MainDialogController(
                gui4jEngine);
        System.out.println("main ende");

    }

     public static URL getResource(final String resourcePath) {
        final ClassLoader classLoader = Thread.currentThread()
                .getContextClassLoader();
    	//final ClassLoader classLoader = this.getClass().getClassLoader();
    	
        final URL resourceURL = classLoader.getResource(resourcePath);
        return resourceURL;
    }

}