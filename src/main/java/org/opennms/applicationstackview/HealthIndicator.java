package org.opennms.applicationstackview;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Layout;

/**
 *
 * @author tak
 */
public class HealthIndicator extends CustomComponent {
    
    public HealthIndicator(int good, int problems, int death) {
        Layout healthLayout = new HorizontalLayout();
        
        Button goodButton = new Button("good");
        goodButton.setWidth(good, Unit.PERCENTAGE);
        goodButton.setStyleName("good");
        healthLayout.addComponent(goodButton);
        
        Button problemsButton = new Button("problems");
        problemsButton.setWidth(problems, Unit.PERCENTAGE);
        problemsButton.setStyleName("problems");
        healthLayout.addComponent(problemsButton);
        
        Button deathButton = new Button("death");
        deathButton.setWidth(death, Unit.PERCENTAGE);
        deathButton.setStyleName("death");
        healthLayout.addComponent(deathButton);
        
        setCompositionRoot(healthLayout);
    }
    
}
