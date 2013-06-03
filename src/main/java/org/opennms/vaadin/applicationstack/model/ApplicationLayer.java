package org.opennms.vaadin.applicationstack.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author mvrueden
 */
@XmlRootElement
public class ApplicationLayer {

    private int width;
    private int height;
    private int column;
    private int row;
    private String label;
    
    private List<Criteria> criterias = new ArrayList<Criteria>();

    public ApplicationLayer() {
        
    }
    
    public ApplicationLayer(String label, int row, int column, int width, int height) {
        this.row = row;
        this.column = column;
        this.width = width;
        this.height = height;
        this.label = label;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @XmlAttribute
    public String getLabel() {
        return label;
    }

    public Coordinates getCoordinates() {
        return new Coordinates(column, row, column + width - 1, row + height - 1);
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setCriterias(List<Criteria> criterias) {
        this.criterias = criterias;
    }

    public ApplicationLayer addCriteria(Criteria criteria) {
        criterias.add(criteria);
        return this;
    }

    public void removeCriteria(Criteria criteria) {
        criterias.remove(criteria);
    }

    public void removeAllCriterias() {
        criterias.clear();
    }

    @XmlElement(name="criteria")
    @XmlElementWrapper(name="criterias")
    public List<Criteria> getCriterias() {
        return criterias;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
