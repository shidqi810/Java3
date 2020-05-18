import java.io.*;

class Link
{
	public int iData;		//data item (key)
	public double dData;	//data item
	public Link next;		//next link in list

	//-------------------------------------------------------

	public Link(int id, double dd)		//constructor
	{
		iData = id;			//initialize Data
		dData = dd;			//('next' is auto set to null)
	}

	//-------------------------------------------------------

	public void displayLink()			//display ourself
	{
		System.out.print("{" + iData + ", " + dData + "} ");
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////

class LinkList
{
	private Link first;				//ret to first link on list

	//-------------------------------------------------------

	public LinkList()					//constructor
	{
		first = null;				//no item in list yet
	}

	//-------------------------------------------------------

	public void insertFirst(int id, double dd)		//insert at start of list
	{
		Link newLink = new Link(id,dd);
		newLink.next = first;		//newLink = old first
		first = newLink;			//first = newLink 
	}

	//-------------------------------------------------------

	public Link find(int key)		//find link with given key
	{
		Link current = first;		//start at first
		while (current.iData != key)
		{
			if (current.next == null)	//if end of list
			{
				return null;			//didn't find it
			}
			else
			{
				current = current.next;		//go to next link
			}
		}
		return current;		//found it
	}

	//-------------------------------------------------------

	public Link delete(int key)		//delete link with given key
	{
		Link current = first;			//search for link
		Link previous = first;
		while(current.iData != key)
		{
			if (current.next == null)
			{
				return null;			//didn't find it
			}
			else
			{
				previous = current;		//go to next link
				current = current.next;
			}							//found it
		}

		if (current == first)			//if first link
		{
			first = first.next;			//change first
		}
		else
		{
			previous.next = current.next;	//bypass it
		}

		return current;
	}

	//-------------------------------------------------------

	public void displayList()
	{
		System.out.print("List (first-->last) : ");
		Link current = first;		//start of beginning of list
		while (current != null)		//until end of list
		{
			current.displayLink();	//print data
			current = current.next;	//move to next link
		}
		System.out.println("");
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////

class LinkedListNimdanNilai
{
	public static void main(String[] args)
	{
		LinkList theList = new LinkList();		//make object list

		System.out.print("Masukkan Banyaknya data = ");
		int n = inputData();
		for (int i = 0; i < n; i++)
		{
			System.out.print("Nim = ");
			int nim = inputData();
			System.out.print("Nilai = ");
			double nilai = inputDouble();

			System.out.println("");
			theList.insertFirst(nim, nilai);
		}

		theList.displayList();		//display list

		System.out.print("Masukkan NIM Yang akan dicari = ");
		int cari = inputData();
		Link  f = theList.find(cari);		//find item
		if (f != null)
		{
			System.out.println("Found link with key " + f.iData);
		}
		else
		{
			System.out.println("Can't found the link!");
		}

		System.out.print("Masukkan Banyaknya data yang akan di hapus = ");
		int nDel = inputData();

		for (int k = 0; k < nDel; k++)
		{
			System.out.print("NIM Yang akan dihapus = ");
			int del = inputData();
			Link d = theList.delete(del);	//delete item
			if (d != null)
			{
				System.out.println("Deleted link with key " + d.iData);
			}
			else
			{
				System.out.println("Can't delete link!");
			}
		}


		theList.displayList();
	}

	public static int inputData()
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		try
		{
			angkaInput = dataIn.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}

	public static double inputDouble()
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		try
		{
			angkaInput = dataIn.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		
		double Data = Double.parseDouble(angkaInput);
		return Data;
	}
}