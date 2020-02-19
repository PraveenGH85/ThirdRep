package SampleScripts;
import java.util.ArrayList;
import java.util.HashSet;
public class HashDummy 
{
	public static void main(String[] args) 
	{
		ArrayList hs=new ArrayList();
		hs.add(10);
		hs.add(12);
		hs.add(15);
		hs.add(10);
		System.out.println(hs);
		HashSet hx=new HashSet();
		hx.addAll(hs);
		System.out.println(hx);
	}
}
