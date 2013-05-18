package org.opennms.applicationstackview;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
@Theme(value = "mytheme")
public class MyVaadinUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);
        setContent(layout);

        ApplicationStack stack = new ApplicationStack("Waschmaschine");

        ApplicationLayer topFull = new ApplicationLayer("topFull");
        ApplicationLayer middleA = new ApplicationLayer("middleA");
        ApplicationLayer middleB = new ApplicationLayer("middleB");
        ApplicationLayer bottumFull = new ApplicationLayer("bottumFull");
        
        
        stack.addLayer(topFull, 0, 0, 3, 0);
        stack.addLayer(middleA, 0, 1, 1, 1);
        stack.addLayer(middleB, 2, 1, 3, 1);
        stack.addLayer(bottumFull, 0, 2, 3, 2);

        layout.addComponent(stack);

    }
}