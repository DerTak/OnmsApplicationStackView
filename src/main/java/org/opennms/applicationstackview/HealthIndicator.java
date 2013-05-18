package org.opennms.applicationstackview;

import com.vaadin.event.LayoutEvents;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;

/**
 *
 * @author tak
 */
public class HealthIndicator extends HorizontalLayout {
    
    public HealthIndicator(int good, int problems, int death) {
        setWidth(100, Unit.PERCENTAGE);
                        
        final Label goodLabel = createLabel("good", good);
        final Label problemsLabel = createLabel("problems", problems);
        final Label deathLabel = createLabel("death", death);
        
        if (good > 0) addComponent(goodLabel);
        if (problems > 0) addComponent(problemsLabel);
        if (death > 0) addComponent(deathLabel);
        
        for (int i=0; i<getComponentCount(); i++) {
            setExpandRatio(getComponent(i), getComponent(i).getWidth());
            getComponent(i).setWidth(100, Unit.PERCENTAGE);
        }
        
        addLayoutClickListener(new LayoutEvents.LayoutClickListener() {

            @Override
            public void layoutClick(LayoutEvents.LayoutClickEvent event) {
                if (event.getClickedComponent() == goodLabel) Notification.show("good pressed");
                if (event.getClickedComponent() == problemsLabel) Notification.show("problems pressed");
                if (event.getClickedComponent() == deathLabel) Notification.show("death pressed");
            }
        });
    }
    
    private Label createLabel(String description, int width) {
        Label label = new Label(" ");
        label.setStyleName(description);
        label.setDescription(description);
        label.setWidth(width, Unit.PERCENTAGE);
        label.setHeight(15, Unit.PIXELS);
        return label;
    }
    
}
