package com.cts.product;

import java.util.List;
import java.util.Scanner;

import com.cts.product.dao.DBUtils;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;

public class Use {

	public static void main(String[] args) {

		ProductDaoImpl prodDao = new ProductDaoImpl(); // Not Recommended for direct Dao access
		Scanner sc = new Scanner(System.in);
		Product prod = null;
		boolean flag = true;
		while (flag) { // Infinite loop

			System.out.println("-- MENU --");
			System.out.println("1.Add Product");
			System.out.println("2.Find Product");
			System.out.println("3.List Products");
			System.out.println("4.Delete Product");
			System.out.println("5.Update Product");
			System.out.println("6.Exit");

			System.out.println("Enter your CHoice: ");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				prod = new Product();
				System.out.println("Enter Prouct Id:");
				prod.setProdId(sc.nextLine());

				System.out.println("Enter Product Name: ");
				prod.setProdName(sc.nextLine());
				System.out.println("Enter price: ");
				prod.setPrice(sc.nextDouble());

				prodDao.saveProduct(prod);

				break;
			case 2:

				System.out.println("Enter  Product Id: ");
				prod = prodDao.findProduct(sc.nextLine());
				if (prod != null) {
					System.out.println("Product Id\tProduct Name\tPrice");
					System.out.println("------------------------------------");
					System.out.print(prod.getProdId() + "\t\t");
					System.out.print(prod.getProdName() + "\t\t");
					System.out.print(prod.getPrice());
					System.out.println();
					System.out.println("------------------------------------");
				} else
					System.out.println("No Records found");
				break;
			case 3:

				List<Product> prods = prodDao.listAll();
				if (prods.size() != 0) {
					System.out.println("Product Id\tProduct Name\tPrice");
					System.out.println("------------------------------------");
					for (Product product : prods) {
						System.out.print(product.getProdId() + "\t\t");
						System.out.print(product.getProdName() + "\t\t");
						System.out.print(product.getPrice());
						System.out.println();
					}
				} // end of if
				else
					System.out.println("No Records available");
				System.out.println("------------------------------------");
				break;
			case 4:
				System.out.println("Enter  Product Id: ");
				boolean status = prodDao.deleteProduct(sc.nextLine());
				if (status)
					System.out.println("Record Deleted");
				else
					System.out.println("No record found with given Product Id");
				break;
			case 5:
				System.out.println("Enter product Id for Update: ");
				prod = prodDao.findProduct(sc.nextLine());
				if (prod != null) {
					System.out.println("Enter New Product Name: ");
					prod.setProdName(sc.nextLine());
					System.out.println("Enter New Price: ");
					prod.setPrice(sc.nextDouble());
					
					prodDao.updateProduct(prod);
					System.out.println("Product Updated");
				} else {
					System.out.println("No record found");
				}
				break;
			case 6:
				System.out.println("Thank you. Visit again");
				DBUtils.closeConnection();
				System.exit(0);
			default:
				System.out.println("Invalid Choice. try again");
			}

		}

	}

}
