package org.opennms.applicationstackview;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author mvrueden
 */
public class ApplicationLayer extends CustomComponent {
    
    public ApplicationLayer(final String name, int good, int problem, int death) {
        VerticalLayout appLayerVerticalLayout = new VerticalLayout();
        Panel appLayerMainPanel = new Panel(name);
        HealthIndicator healthIndicator = new HealthIndicator(good, problem, death);
        appLayerVerticalLayout.addComponent(appLayerMainPanel);
        appLayerVerticalLayout.addComponent(healthIndicator);
        setCompositionRoot(appLayerVerticalLayout);
    }
    
}
