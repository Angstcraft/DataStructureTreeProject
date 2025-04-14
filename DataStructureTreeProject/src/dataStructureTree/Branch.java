package dataStructureTree;


import java.util.TreeSet;
import java.util.Comparator;



/**
 * 
 */
public class Branch implements Comparable<Branch>
{
   private TreeSet<Twig> twigs;

   public Branch(int pNumTwigs, int pNumLeaves)
   {
	  twigs = new TreeSet<>();
	  for (int i = 0; i < pNumTwigs; i++)
	  {
		 twigs.add(new Twig(pNumLeaves));
	  }
   }
   
   @Override
   public boolean equals(Object pObj)
   {
	  if (this == pObj)
		 return true;
	  if (pObj == null || getClass() != pObj.getClass())
		 return false;
	  Branch branch = (Branch) pObj;
	  return twigs.equals(branch.twigs);
   }

   @Override
   public int compareTo(Branch pOther)
   {
	  return Integer.compare(this.twigs.size(), pOther.twigs.size());
   }
   public TreeSet<Twig> getTwigs()
   {
	  return twigs;
   }

 
}