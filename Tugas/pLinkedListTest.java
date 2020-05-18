import java.io.*;
import java.util.*;

class pOneChildNode
{
	protected Object data;

	protected pOneChildNode next;

		public pOneChildNode ()
		{
			next = null;

			data = null;
		}

		public pOneChildNode(Object d, pOneChildNode n)
		{
			data = d;

			next = n;
		}

		public void setNext(pOneChildNode n)
		{
			next = n;
		}

		public void setData(Object d)
		{
			data = d;
		}

		public pOneChildNode getNext()
		{
			return next;
		}

		public Object getData()
		{
			return data;
		}

		public String toString ()
		{
			return "" + data;
		}
	}


class pLinkedList
{
	protected pOneChildNode head;

	protected int number;

	//konstrukror

	public pLinkedList()
	{
		head = null;

		number = 0;

	}

	//metoda untuk menentukan linkedlist berisi atau kososng

	public boolean isEmpty()
	{
		return head == null;
	}

	//metoda untuk menentukan banyak node yang ada

	public int size()
	{
		return number;
	}

	//metoda untuk menambahkan node dibagian awal linkedlist

	public void insert(Object obj)
	{
		head = new pOneChildNode(obj, head);

		number++;
	}

	//metoda untuk menghapus node dibagiqan awal linkedlist

	public Object remove()
	{
		if (isEmpty()) 

		return null;

		pOneChildNode tmp = head;

		head = tmp.getNext();

		number--;

		return tmp.getData();
	}

	//metoda menambahkan node  dibagian akhir linked list

	public void insertEnd(Object obj)
	{
		if (isEmpty()) 
			
			insert (obj);

			else
			{
				pOneChildNode t = head;

				while (t.getNext() !=null)

					t = t.getNext();

					pOneChildNode tmp = new pOneChildNode(obj, t.getNext());

					t.setNext(tmp);

					number++;
			}
	}

	//metoda untuk menghapus dibagian akhir 

	public Object removeEnd()
	{
		if (isEmpty())

			return null;

		if(head.getNext() == null)

			return remove();

		pOneChildNode t = head;

		while (t.getNext().getNext() != null)

			t = t.getNext();

		Object obj = t.getNext().getData();

		t.setNext(t.getNext().getNext());

		number--;

		return obj;
	}

	public Object peek(int n)
	{
		pOneChildNode t = head;

		for (int i = 0; i<n && t !=null; i++) 
		
		t = t.getNext();

	return t.getData();
	}
}

class pLinkedListTest
{
	public static void main(String[] args) 
	{
		//menginstansiasi pLinkedList

		pLinkedList l = new pLinkedList();

		Integer j = null;

		int i;

		System.out.println("Starting ...");

		for (i = 0; i<5; i++) 
		{
			//membuat bil bulat acak

			j = Integer.valueOf((int) (Math.random () *100));

			//menyisipkan bil bulat

			//acak didepan list

			l.insert(j);

			System.out.println("insert : " + j);

		}

		for (i=0; i<10; i++) 
		{
			//membuat bil bulat acak

			j = Integer.valueOf((int) (Math.random () *100));	

			//menyisipkan bil bulat

			//acak didepan list

			l.insertEnd(j);

			System.out.println("insertEnd : " + j);

		}

		//menampilkan bil bulat

		//tanpa menghapusnya

		for (i = 0; i<l.size();i++)
		
		System.out.println("peek " + i + " : " + l.peek(i));

		//menampilkan bil bulatdidepan list sekaligus menghapusnya

		for (i=0; i<5; i++)

		System.out.println("remove : " + ((Integer)l.remove()));

		//menampilkan bil bulat dibelakang list sekaligus menghapusnya

		while(!l.isEmpty())

		System.out.println("removeEnd : " + ((Integer)l.removeEnd()));

		System.out.println("Done ; -");
	}
}