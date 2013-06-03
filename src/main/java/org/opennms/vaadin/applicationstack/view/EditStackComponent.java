package org.opennms.vaadin.applicationstack.view;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import java.util.ArrayList;
import java.util.List;
import org.opennms.vaadin.applicationstack.model.ApplicationLayer;
import org.opennms.vaadin.applicationstack.model.ApplicationStack;

/**
 *
 * @author marskuh
 */
public class EditStackComponent extends CustomComponent {

    private final VerticalLayout layout;
    
    private TextField stackTextField = new TextField();
    
    private List<EditLayerComponent> rows = new ArrayList<EditLayerComponent>();
    
    private ApplicationStack model;
        
    public EditStackComponent() {
        setCaption("Edit");
        layout = new VerticalLayout();
        setCompositionRoot(layout);
    }
        
    public Component render(ApplicationStack stack) {
        this.model = stack;
        
        layout.removeAllComponents();
        TextField textField = new TextField("Application name", model.getLabel());
        textField.setDescription("The name of the application");
    
        Button addButton = new Button("+", new ClickListener() {

            @Override
            public void buttonClick(Button.ClickEvent event) {
                model.addLayer(new ApplicationLayer("new layer", model.getRowCount(), 0, model.getColumnCount(), 1));
                render(model);
            }
        });
        
        layout.addComponent(addButton);
        layout.addComponent(textField);
        
        for (ApplicationLayer eachLayer : model.getLayers()) {
            layout.addComponent(new EditLayerComponent(eachLayer));
        }
        
        layout.addComponent(new Button("ok", new ClickListener() {

            @Override
            public void buttonClick(Button.ClickEvent event) {
                ((ApplicationStackUI)getUI()).render(model);
            }
        }));
        return this;
    }

    private boolean isValid() {
        return false;
    }
    
    private class EditLayerComponent extends CustomComponent {
        private EditLayerComponent(final ApplicationLayer layer) {
            
            
            
            HorizontalLayout layout = new HorizontalLayout();
            
            TextField label = new TextField(null, layer.getLabel());
            TextField row = new TextField(null, Integer.toString(layer.getRow()));
            TextField column = new TextField(null, Integer.toString(layer.getColumn()));
            TextField width = new TextField(null, Integer.toString(layer.getWidth()));
            TextField height = new TextField(null, Integer.toString(layer.getHeight()));
            Button removeButton = new Button("-", new Button.ClickListener() {
                @Override
                public void buttonClick(Button.ClickEvent event) {
                    model.removeLayer(layer);
                    render(model);
                }
            });
            
            layout.addComponent(label);
            layout.addComponent(row);
            layout.addComponent(column);
            layout.addComponent(width);
            layout.addComponent(height);
            layout.addComponent(removeButton);
            
            setCompositionRoot(layout);
        }
    }
}
