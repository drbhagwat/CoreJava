package com.drbhagwat.chapters.two;

import java.util.ArrayList;
import java.util.List;

/* 
 * Fully implement the Invoice class in section 2.6.1, "Static Nested Classes" (page 85). 
 * Provide a method that prints the invoice and a demo program that constructs and prints 
 * a sample invoice. 
 */
public class Invoice {
  private static class Item {
	private String description;
	private int quantity;
	double unitPrice;
	
	public double price() {
	  return quantity * unitPrice;
	}

	@Override
	public String toString() {
	  return "[Item: " + description + ", quantity: " + quantity + ", Unit Price: " + unitPrice + ", Total Price: " + price()  + "]";
	}

  }
  private List<Item> items = new ArrayList<>();

  public void addItem(String description, int quanity, double unitPrice) {
	Item item = new Item();
	item.description = description;
	item.unitPrice = unitPrice;
	item.quantity = quanity;
	items.add(item);
  }

  @Override
  public String toString() {
	String invoiceString = "";
	
	for (Item item : items) {
	  invoiceString += item.toString();
	  invoiceString += "\n";
	}
	return invoiceString;
  }

  public static void main(String args[]) {
	Invoice invoice = new Invoice();
	invoice.addItem("Jeans Pant", 2, 100);
	invoice.addItem("T-Shirt", 4, 50);
	System.out.println(invoice);
  }
}
