package trees;

import java.util.ArrayList;
import java.util.List;

public class KNode <T>{

  public KNode parent;
  public List<KNode> children;
  public T info;


  public KNode (T info)
  {
    this.info=info;
    children  = new ArrayList<KNode>();
  }

  public void addChild(KNode childNode)
  {

        childNode.parent=this;
        this.children.add( childNode);

    }
  }

