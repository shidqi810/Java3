import java.io.*;
import java.util.*;

class pTwoChildNode
{
	// dapat menyimpan data string
	protected String data;
	protected pTwoChildNode left, right;

	public pTwoChildNode()
	{
		data = null;
		left = right  = null;
	}
	public pTwoChildNode (String d)
	{
		data = d;
		left = right = null;
	}
	public void setLeft (pTwoChildNode l)
	{
		left = l;
	}
	public void setRight(pTwoChildNode r)
	{
		right = r;
	}
	public void setData(String d)
	{
		data = d;
	}
	public pTwoChildNode getLeft()
	{
		return left;
	}
	public pTwoChildNode getRight()
	{
		return right;
	}
	public Object getData()
	{
		return data;
	}
	public String toString()
	{
		return " " + data;
	}
}

class pDoublyLinkedList
{
	// membuat pointer pointer
	private pTwoChildNode head, tail;

	protected long num;

	// mendapatkan rujukan ke head
	protected pTwoChildNode getHead() {
		return head;
	}

	// mendapatkan rujukan ke tail
	protected pTwoChildNode getTail() {
		return tail;
	}

	// melakukan pengaturan head
	protected void setHead(pTwoChildNode p) {
		head = p;
	}

	// melakukan pengaturan tail
	protected void setTail(pTwoChildNode p) {
		tail = p;
	}

	// konstruktor
	public pDoublyLinkedList() {
		// membuat simpul head
		setHead(new pTwoChildNode());

		// membuat simpul tail
		setTail(new pTwoChildNode());

		// menghubungkan head dan tail
		// Saat ini DoublyLinkedList kosong
		getTail().setLeft(head);
		getHead().setRight(tail);
		num = 0;
	}

	// mendapatkan ukuran list
	public long size() {
		return num;
	}

	// memeriksa apa ada elemen di list
	public boolean isEmpty() {
		return num == 0;
	}

	// menambahkan simpul di bagian depan list
	public void addHead(String o) {
		pTwoChildNode p = new pTwoChildNode(o);
		p.setLeft(getHead());
		p.setRight(getHead().getRight());
		getHead().setRight(p);
		p.getRight().setLeft(p);
		num++;
	}

	// menghapus simpul di bagian
	public Object removeHead() {
		Object o = null;
		if (!isEmpty()) {
			pTwoChildNode p = getHead().getRight();
			getHead().setRight(p.getRight());
			p.getRight().setLeft(getHead());
			o = p.getData();
			num--;
		}
		return o;
	}

	// menambahkan simpul di bagian belakang list
	public void addTail(String o) {
		pTwoChildNode p = new pTwoChildNode(o);
		p.setRight(getTail());
		p.setLeft(getTail().getLeft());
		getTail().setLeft(p);
		p.getLeft().setRight(p);
		num++;
	}

	// menghapus simpul di bagian belakang list
	public Object removeTail() {
		Object o = null;
		if (!isEmpty()) {
			pTwoChildNode p = getTail().getLeft();
			getTail().setLeft(p.getLeft());
			p.getLeft().setRight(getTail());
			o = p.getData();
			num--;
		}
		return o;
	}

	// menambah simpul di depan list
	public void add(String o) {
		addHead(o);
	}

	// menghapus simpul
	public Object remove() {
		return removeHead();
	}

	// penelusuran dari head ke tail
	public Enumeration<Object> elementsHeadToTail() {
		return new Enumeration<Object>() {
			// mendapatkan simpul kepala (head)
			pTwoChildNode p = getHead();

			// bergerak maju sepanjang Doubly Linked LIst
			public boolean hasMoreElements() {
				return p.getRight() != getTail();
			}

			// mengambil data dari elemen berikutnya
									// ini cara untuk java yg baru
									// java yg lama tidak bisa
			public Object nextElement() throws NoSuchElementException {
				synchronized(pDoublyLinkedList.this) {
					if (hasMoreElements()) {
						p = p.getRight();
						return p.getData();
					}
				}
				return("pDoublyLinkedList Enumeration");
			}
		};
	}

	// penelusuran dari tail ke head
	public Enumeration<Object> elementsTailToHead() {
		return new Enumeration<Object>() {
			// mendapatkan simpul ekor (tail)
			pTwoChildNode p = getTail();

			// bergerak mundur sepanjang DoublyLinkedList
			public boolean hasMoreElements() {
				return p.getLeft() != getHead();
			}

			// mengambil data dari elemen sebelumnya
									// ini cara untuk java yg baru
									// java yg lama tidak bisa
			public Object nextElement() throws NoSuchElementException {
				synchronized(pDoublyLinkedList.this) {
					if (hasMoreElements()) {
						p = p.getLeft();
						return p.getData();
					}
				}
				return("pDoublyLinkedList Enumeration");
			}
		};
	}
}

public class TesDoublyLinkedList
{
	private static pDoublyLinkedList list;

	public static void main(String[] args)
	{
		// membentuk objek DoublyLinkedList

		list = new pDoublyLinkedList();
		System.out.println("PROGRAM DOUBLY LINKED LIST : ");
		System.out.print("Ada berapa data ? ");

		// mendapat kan jumlah data yg akan dimasukkan ke objek double linked list

		int cacahData = inputData();
		String data;
		// membaca data data dan memasukkannya ke objek doublyLinkedList

		for (int i = 1; i <= cacahData; i++)
		{
			System.out.print("Memasukkan kalimat anda : ");
			data = bacaData();
			masukList(data);
		}
		// menuliskan isi objek DoublyLinkedList
		isiList();
	}

	private static Integer inputData()
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		String angkaInput = null;
		try {
			angkaInput = bfr.readLine();
		}
		catch ( IOException e ) {
			e.printStackTrace();
		}

		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}

	private static void isiList()
	{
		System.out.print("Mau tulis dari belakang - depan (1) atau depan - belakang (9) : ");
		int kendali = inputData();
		System.out.println("Isi List : ");

		// bergerak dari belakang ke depan
		if (kendali == 1) {
			int i = 1;
			Enumeration<Object> e = list.elementsHeadToTail();
			while (e.hasMoreElements()) {
				System.out.println("Kalimat " + (i++) + " : " + ((String) e.nextElement()) + " ");
			}
		}

		// bergerak dari depan ke belakang
		if (kendali == 9) {
			int i = 1;
			Enumeration<Object> e = list.elementsTailToHead();
			while (e.hasMoreElements()) {
				System.out.println("Kalimat " + (i++) + " : " + ((String) e.nextElement()) + " ");
			}
		}
	}

	// menambahkan elemen data dari arah depan
	private static void masukList(String data) {
		list.addHead(data);
	}

	private static String bacaData()
	{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String stringInput = null;

		try {
			stringInput = bfr.readLine();
		}
		catch ( IOException e ) {
			e.printStackTrace();
		}
		return stringInput;
	}
}