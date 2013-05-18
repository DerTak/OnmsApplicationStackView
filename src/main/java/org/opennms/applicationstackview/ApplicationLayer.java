package org.opennms.applicationstackview;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author mvrueden
 */
public class ApplicationLayer extends CustomComponent {
    
    public ApplicationLayer(final String name) {
        VerticalLayout appLayerVerticalLayout = new VerticalLayout();
        Panel appLayerMainPanel = new Panel(name);
        Panel appLayerHealthInidcatorPanel = new Panel("health");
        appLayerVerticalLayout.addComponent(appLayerMainPanel);
        appLayerVerticalLayout.addComponent(appLayerHealthInidcatorPanel);
        setCompositionRoot(appLayerVerticalLayout);
    }
    
}
