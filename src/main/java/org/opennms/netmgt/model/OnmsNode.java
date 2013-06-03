/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opennms.netmgt.model;

/**
 *
 * @author marskuh
 */
public class OnmsNode {

    private String id;
    private String label;

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
