package dataStructureTree;


public abstract class Tree
{
   protected Stem	  stem;
   protected TreeType treeType;

   public Tree(TreeType pTreeType, int pNumBranches, int pNumTwigs, int pNumLeaves)
   {
	  this.treeType = pTreeType;
	  this.stem = new Stem(pNumBranches, pNumTwigs, pNumLeaves);
   }
   
   @Override
   public boolean equals(Object pObj)
   {
	  if (this == pObj)
		 return true;
	  if (pObj == null || getClass() != pObj.getClass())
		 return false;
	  Tree tree = (Tree) pObj;
	  return stem.equals(tree.stem) && treeType == tree.treeType;
   }

   public abstract void displayInfo();

   public Stem getStem()
   {
	  return stem;
   }


}