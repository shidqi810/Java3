// linked list berguna untuk menghubungkan array yg berbeda
// jadi array nya pisah
// data nya dibaca satu arah kedepan untuk linked list
// untuk double linked list arah datanya bisa bolak balik ke depan dan belakang

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

class LinkListApp2
{
	public static void main(String[] args)
	{
		LinkList theList = new LinkList();		//make object list

		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);

		theList.displayList();		//display list

		Link  f = theList.find(44);		//find item
		if (f != null)
		{
			System.out.println("Found link with key " + f.iData);
		}
		else
		{
			System.out.println("Can't found the link!");
		}

		Link d = theList.delete(66);	//delete item
		if (d != null)
		{
			System.out.println("Deleted link with key " + d.iData);
		}
		else
		{
			System.out.println("Can't delete link!");
		}

		theList.displayList();
	}
}