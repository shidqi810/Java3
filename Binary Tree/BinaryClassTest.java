import java.io.*;
import java.util.*;

class Node
{
	// Deklarasi data yang digunakan sebagai nilai kunci
	// Agar sederhana, datanya hanya berupa bilangan bulat (integer)

	int iData;
	Node leftChild;
	Node rightChild;
}

class BinaryTree
{
	// membentuk akar (root) BinaryTree
	private Node root;

	// metoda untuk melakukan pencarian elemen tertentu
	// dalam simpul berdasarkan kunci yang dimiliki simpul

	public Object find(int key)
	{
		// mulai dari akar (root)
		Node current = root;

		// selama kunci pencarian belum ditemukan
		while (current.iData != key)
		{
			// pergi ke caban kiri?
			if (key < current.iData)
			{
				current = current.leftChild;
			}
			else
			{
				// Atau pergi ke cabang kanan?
				current = current.rightChild;
			}
			if (current == null)
			{
				// jika tidak memiliki anak
				return null;
			}
		}
		// Jika data yang dicari ditemukan
		return current;
	}

	// metoda untuk melakukan penambahan (penyisipan) elemen tertentu ke BinaryTree

	public void insert(int id)
	{
		// Membuat Node yang akan disisipkan
		Node newNode = new Node();

		// menyisipkan data.
		newNode.iData = id;

		// Jika tidak ada Node di akar (root)
		// (pohon biner masih kosong)
		if (root == null)
		{
			root = newNode;
		}
		// pohon biner sudah berisi
		else
		{
			// mulai dari akar (root)
			Node current = root;
			Node parent;
			// Hadir secara internal

			while (true)
			{
				parent = current;
				if (id < current.iData)
				{
					// pergi ke kiri
					current = current.leftChild;

					// Akhir cabang kiri
					if (current == null)
					{
						// sisipkan di kiri
						// penyisipan dilakukan di bawah simpul terbawah

						parent.leftChild = newNode;
						return;
					}
				}

				else
				{
					current = current.rightChild;
					// akhir perjalanan ke kanan

					if (current == null)
					{
						// sisipkan di kanan
						// penyisipan dilakukan di bawah simpul terbawah

						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	// Metoda untuk melakukan penghapusan simpul tertentu
	public boolean delete(int id)
	{
		// Asumsi pohon tidak kosong
		Node current = root;
		Node parent = root;

		// pemeriksaannya apakah anak sebelah kiri masih ada?
		boolean isLeftChild = true;

		// Mencari node yang akan dihapus
		while(current.iData != id)
		{
			parent = current;

			// Pergi ke kiri?
			if (id < current.iData)
			{
				isLeftChild = true;
				current = current.leftChild;
			}

			// Atau pergi ke kanan?
			else
			{
				isLeftChild = false;
				current = current.leftChild;
			} // Akhir poohon biner

			if (current == null)
			{
				// Node yang dicari tidak ditemukan
				return false;
			}
		} //end while
			// Node yang akan dihapus ditemukan

		// Jika Node tidak memiliki anak di bawahnya, tidak ada kanan dan kiri, hapus!
		if (current.leftChild == null && current.rightChild == null)
		{
			// jika Node yang dihapus merupakan akar (Node)
			if (current == root)
			{
				// Pohon Biner menjadi kosong
				root = null;
			}
			else if (isLeftChild)
			{
				// pemutusan koneksi
				parent.leftChild = null;
			}
			// Jika Node yg akan dihapus adalah anak sebelah kanan
			else 
			{
				parent.rightChild = null;
			}
		}

		// Jika tidak ada kanan, ganti dengan subpohon kiri
		else if (current.rightChild == null)
		{
			if (current == root)
			{
				root = current.leftChild;
				// Anak sebelah kiri induk
			}
			else if (isLeftChild)
			{
				parent.leftChild = current.leftChild;
				// Anak sebelah kanan induk
			}
			else 
			{
				parent.rightChild = current.leftChild;
				// Jika tak ada anak kiri, gantikan denga subpohon sebelah kanan
			}
		}

		// Jika tidak ada kiri, ganti dengan subpohon kanan
		else if (current.leftChild == null)
		{
			if (current == root)
			{
				root = current.rightChild;
				// Anak sebelah kanan induk
			}
			else if (isLeftChild)
			{
				parent.leftChild = current.rightChild;
				// Anak sebelah kanan induk
			}
			else 
			{
				parent.rightChild = current.rightChild;
				// Jika tak ada anak kanan, gantikan denga subpohon sebelah kiri
			}
		}

		else
		{
			// mendapatkan successor Node untuk dihapus
			Node successor = getSuccessor(current);

			// menghubungkan induk Node saat ini ke successor
			if (current == root)
			{
				root = successor;
			}
			else if (isLeftChild)
			{
				parent.leftChild = successor;
			}
			else
			{
				// Menghubungkan successor ke anak sebelah kiri Node saat ini
				parent.rightChild = successor;
				successor.leftChild = current.leftChild;
			}
		}
		return true;
	} //akhir method delete

	private Node getSuccessor(Node delNode)
	{
		Node successorParent = delNode;

		Node successor = delNode;

		Node current = delNode.rightChild;

		while(current != null)
		{
			successorParent = successor;

			successor = current;

			current = current.leftChild;
		}

		if(successor != delNode.rightChild)
		{
			successorParent.leftChild = successor.rightChild;

			successor.rightChild = delNode.rightChild;
		}

		return successor;
	}

	public Node minimum()
	{
		Node current, last = null;

		current = root;

		while(current != null)
		{
			last = current;

			current = current.leftChild;
		}

		return last;
	}
} //akhir kelas binary tree

public class BinaryClassTest{

	private static int cari;
	
	private static int cacahData;

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();

		System.out.print("Berapa data yang akan dimasukkan kedalam Binary Tree ? : ");

		cacahData = inputData();

		for (int i = 0; i<cacahData; i++) {

			System.out.print("Data ke-" + (i+1) + " = ");

			bt.insert(inputData());
		}

		System.out.print("Data yang Anda cari ? :");

		cari = inputData();

		Node found = (Node) bt.find(cari);

		if(found != null)

			System.out.println("Node dengan key " + cari + " ditemukan.");

		else

			System.out.println("Node dengan key " + cari + "tidak dapat ditemukan");
	}

	private static int inputData(){

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		String angkaInput = null;

		try {
			angkaInput = bfr.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int Data = Integer.valueOf(angkaInput).intValue();

		return Data;
	}
}