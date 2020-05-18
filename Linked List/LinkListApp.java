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

	public boolean isEmpty()		//true if list is empty
	{
		return (first == null);
	}

	//-------------------------------------------------------

	public void insertFirst(int id, double dd)		//insert at start of list
	{
		Link newLink = new Link(id,dd);
		newLink.next = first;		//newLink = old first
		first = newLink;			//first = newLink 
	}

	//-------------------------------------------------------

	public Link deleteFirst()		//delete first item
	{
		Link temp = first;			//save reference to link
		first = first.next;		//delete it: first = oldnext
		return temp;				//return deleted link
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

class LinkListApp
{
	public static void main(String[] args)
	{
		LinkList theList = new LinkList();		//make object list

		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);

		theList.displayList();		//display list

		while (!theList.isEmpty() )
		{
			Link aLink = theList.deleteFirst();		//delete link
			System.out.print("Deleted ");		//display
			aLink.displayLink();
			System.out.println("");
		}

		theList.displayList();		//display list
	}
}