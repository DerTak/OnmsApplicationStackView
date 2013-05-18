package org.opennms.applicationstackview;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author mvrueden
 */
public class ApplicationLayer extends CustomComponent {
    
    public ApplicationLayer(final String name, int good, int problem, int death) {
        setStyleName("applicationLayer");
        
        Panel p = new Panel();
        p.setSizeFull();
        p.setStyleName("applicationLayer");
        VerticalLayout content = new VerticalLayout();
        content.setSizeFull();
        content.addComponent(new Label(name));
        content.addComponent(new HealthIndicator(good, problem, death));
        content.setComponentAlignment(content.getComponent(1), Alignment.BOTTOM_LEFT);
        p.setContent(content);
        setCompositionRoot(p);
    }
    
}
