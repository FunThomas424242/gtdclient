/* $Id:$ */
/******************************************************************************
 |MainDialogController.java|  -  TODO description

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

import java.awt.AWTException;
import java.awt.Font;
import java.awt.SystemTray;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;

import org.gui4j.Gui4j;
import org.gui4j.event.Gui4jEvent;


import de.meinkonzern.gtdclient.model.GuiControlModel;
import de.meinkonzern.gtdclient.service.GTDService;
import de.meinkonzern.gtdclient.service.GTDServiceImpl;

/**
 * @author SchubertT006
 *
 */
public class MainDialogController extends AbstractDialogController implements
        MainDialogConstants {

    final private GuiControlModel guiModel = new GuiControlModel();

    final private GTDService service = GTDServiceImpl.newInstance();

    public MainDialogController(final Gui4j gui4jEngine) {
        super(gui4jEngine);
        this.createView(PATH_LAYOUT_MAINDIALOG, LABEL_TITLE, IMAGE_APPLICATION
                .getImage());
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            try {
                tray.add(GuiConstants.TRAY_ICON);
            } catch (AWTException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public Reiter1DialogController getReiter1DialogController() {
        return new Reiter1DialogController(this.gui4jEngine, this.guiModel);
    }

    public Reiter2DialogController getReiter2DialogController() {
        return new Reiter2DialogController(this.gui4jEngine, this.guiModel);
    }

    public void changeVisibilityOfTab(final int tabIndex,
            final boolean isVisible) {
        guiModel.setVisibilityOfTab(tabIndex, isVisible);
        EventConstants.eventViewChanged.fireEvent();
    }

    public boolean isTabVisible(final int tabIndex) {
        return guiModel.getVisibilityOfTab(tabIndex);
    }

    public boolean isSelectedTab(final int tabIndex) {
        System.out.println("isSelectedTab(" + tabIndex + ")");
        return (tabIndex == guiModel.getSelectedTab());
    }

    public void doSave() {
        System.out.println("datas successful saved");
    }

    public String getTitle() {
        return "GTD Client Version 1.0-SNAPSHOT";
    }

    public String getTab1Title() {
        return "Übersicht";
    }

    public String getTab2Title() {
        return "Eingang";
    }

    public String getTab3Title() {
        return "Ausführbare Aufgaben";
    }

    public String getTab4Title() {
        return "Warteliste";
    }

    public String getTab5Title() {
        return "Überprüfung";
    }

    public String getTab6Title() {
        return "Verwaltung";
    }

    // evtl. nicht mehr benötigt

//    public void exportToPDF() {
//        final Date currentDate = new Date();
//        final SimpleDateFormat format = new SimpleDateFormat(
//                "dd.MM.yyyy kk:mm:ss");
//        final Document document = new Document();
//
//        try {
//            //final PdfReader reader = new PdfReader("existing.pdf");
//            final PdfWriter writer = PdfWriter.getInstance(document,
//                    new FileOutputStream("HelloWorld.pdf"));
//            document.open();
//            document.add(new Paragraph("Aktuelle Uhrzeit"
//                    + format.format(currentDate)));
//            //            final PdfImportedPage page1 = writer.getImportedPage(reader, 1);
//            //            document.add(page1);
//            //directContent.addTemplate(page1, 1, 0, 0, 1, 0, 0);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//        document.close();
//    }

    public Gui4jEvent eventSaved() {
        return EventConstants.eventSaved;
    }

    public String getPictureDescription() {
        return "Bildbeschreibung";
    }

    static public Font setBold(final Font font) {
        return font.deriveFont(Font.BOLD);
    }

    public boolean hasUnsavedChanges() {
        return true;
    }

    public ImageIcon getPicture() {
        return ICON_EXIT;
    }

}

/**
* ChangeLog
* 
* $Revision:$
* 
*/
