package dataStructureTree;


import java.util.TreeSet;
import java.util.Comparator;


public class Stem
{
   private TreeSet<Branch> branches;

   public Stem(int pNumBranches, int pNumTwigs, int pNumLeaves)
   {
	  branches = new TreeSet<>();
	  for (int i = 0; i < pNumBranches; i++)
	  {
		 branches.add(new Branch(pNumTwigs, pNumLeaves));
	  }
   }



   @Override
   public boolean equals(Object pObj)
   {
	  if (this == pObj)
		 return true;
	  if (pObj == null || getClass() != pObj.getClass())
		 return false;
	  Stem stem = (Stem) pObj;
	  return branches.equals(stem.branches);
   }
   

   public TreeSet<Branch> getBranches()
   {
	  return branches;
   }

}