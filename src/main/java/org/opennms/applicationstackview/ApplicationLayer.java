package org.opennms.applicationstackview;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Layout;

/**
 *
 * @author mvrueden
 */
public class ApplicationLayer extends CustomComponent {
    
    public ApplicationLayer(final String name, int good, int problem, int death) {
        setCaption(name);
        Layout layout = new HorizontalLayout(new HealthIndicator(good, problem, death));
        
//        VerticalLayout appLayerVerticalLayout = new VerticalLayout();
//        Panel appLayerMainPanel = new Panel(name);
//        HealthIndicator healthIndicator = new HealthIndicator(good, problem, death);
//        appLayerVerticalLayout.addComponent(appLayerMainPanel);
//        appLayerVerticalLayout.addComponent(healthIndicator);
        setCompositionRoot(layout);
    }
    
}
