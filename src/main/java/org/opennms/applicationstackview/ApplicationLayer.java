package org.opennms.applicationstackview;

import com.vaadin.ui.CustomComponent;

/**
 *
 * @author mvrueden
 */
public class ApplicationLayer extends CustomComponent {
    
    public ApplicationLayer(final String caption) {
        setCaption(caption);
        setWidth(200, Unit.PIXELS);
        setStyleName("applicaitonLayer");
    }
    
}
