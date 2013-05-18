package org.opennms.applicationstackview;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;

/**
 *
 * @author mvrueden
 */
public class ApplicationStack extends CustomComponent {

    private final GridLayout gridLayout = new GridLayout(4, 3);
    
    public ApplicationStack(final String caption) {
        setWidth(420, Unit.PIXELS);
        setStyleName("applicationStack");
        setCaption(caption);
        setCompositionRoot(gridLayout);
        gridLayout.addStyleName("applicationStack");
        gridLayout.setWidth(420, Unit.PIXELS);
    }
    
    public ApplicationStack addLayer(ApplicationLayer newLayer, int column1, int row1, int column2, int row2) {
        gridLayout.addComponent(newLayer, column1, row1, column2, row2);
        int colSpan = column2 - column1 + 1;
        int rowSpan = row2 - row1 + 1;
        newLayer.setWidth(100 * colSpan, Unit.PIXELS);
        newLayer.setHeight(rowSpan * 100, Unit.PIXELS);
        return this;
//        return addLayer(newLayer, row , column, 1, 1);
    }
    
//    public ApplicationStack addLayer(ApplicationLayer newLayer, int row, int column, int rowSpan, int colSpan) {
//        gridLayout.addComponent(newLayer, column - 1, row - 1, column -1 + colSpan, row -1 + rowSpan);
//        return this;
//    }
}
