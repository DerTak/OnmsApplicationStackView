package org.opennms.vaadin.applicationstack.provider;

import java.util.ArrayList;
import org.opennms.netmgt.model.OnmsNode;
import org.opennms.vaadin.applicationstack.model.Criteria;

import java.util.List;

public class NodeListProvider {

    public List<OnmsNode> getNodesForCriterias(List<Criteria> criterias) {
       return new ArrayList<OnmsNode>();
    }
}
