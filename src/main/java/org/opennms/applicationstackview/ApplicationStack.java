package org.opennms.applicationstackview;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

/**
 *
 * @author mvrueden
 */
public class ApplicationStack extends CustomComponent {

    private final GridLayout gridLayout = new GridLayout(1, 1);
    
    public ApplicationStack(final String caption) {
        setWidth(400, Unit.PIXELS);
        setStyleName("applicationStack");
        setCaption(caption);
        setCompositionRoot(gridLayout);
        gridLayout.setMargin(true);
        gridLayout.addStyleName("applicationStackGrid");
        gridLayout.setWidth(300, Unit.PIXELS);
        gridLayout.setHeight(500, Unit.PIXELS);
    }
    
    public ApplicationStack addLayer(ApplicationLayer newLayer, int row, int column) {
        gridLayout.addComponent(newLayer);
        return this;
//        return addLayer(newLayer, row , column, 1, 1);
    }
 
    public ApplicationStack addLabel(Label newLabel) {
        gridLayout.addComponent(newLabel);
        return this;
    }
    
//    public ApplicationStack addLayer(ApplicationLayer newLayer, int row, int column, int rowSpan, int colSpan) {
//        gridLayout.addComponent(newLayer, column - 1, row - 1, column -1 + colSpan, row -1 + rowSpan);
//        return this;
//    }
}
