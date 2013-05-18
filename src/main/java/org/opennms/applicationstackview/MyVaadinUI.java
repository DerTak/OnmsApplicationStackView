package org.opennms.applicationstackview;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
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

        ApplicationLayer heaven = new ApplicationLayer("heaven");
        ApplicationLayer auto = new ApplicationLayer("auto");
        ApplicationLayer bahn = new ApplicationLayer("bahn");
        
        stack.addLayer(heaven, 0, 0);
        stack.addLayer(auto, 1, 0);
        stack.addLayer(bahn, 1, 1);

        layout.addComponent(stack);

    }
}