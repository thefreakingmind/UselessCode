package GraphTheory;

import java.util.HashMap;
import java.util.LinkedList;

public class GraphTheory {
    HashMap<Integer,NodeClass> nodeLookup = new HashMap();

    class NodeClass{
        private int id;
        LinkedList<NodeClass> adjacent = new LinkedList<>();
        private NodeClass(int id){
            this.id = id;
        }
    }
    private NodeClass getNode(int id){
        NodeClass node = new NodeClass(id);
        return node;
    }
    public void addEdge(int source, int destination){
        NodeClass s = getNode(source);
        NodeClass d = getNode(destination);
        s.adjacent.add(d);
    }

}
