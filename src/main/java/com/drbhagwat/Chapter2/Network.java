package com.drbhagwat.Chapter2;

import java.util.ArrayList;
import java.util.List;

/* 
 * Compile the Network class. Note that the inner class file is named Network$Member.class
 * Use the java program to spy on the generated code. 
 * The command 
 * javap -private Classname
 * displays the methods and instance variables. Where do you see the reference to the enclosing
 * class? (In Linux/Mac OS, you need to put a \ before the $ symbol when running javap.)
 */
public class Network {
  public class Member {
	private String name;
	private List<Member> friends;

	public Member(String name) {
	  this.name = name;
	  friends = new ArrayList<>();
	}
	
	public void deActivate() {
	  Network.this.members.remove(this);
	}

	public boolean belongsTo(Network n) {
	  return Network.this == n;
	}

  }
  private List<Member> members = new ArrayList<>();

  public Member enroll(String name) {
	Member newMember = this.new Member(name);
	members.add(newMember);
	return newMember;
  }

  public static void main(String args[]) {
	Network myFace = new Network();
	Network.Member fred = myFace.enroll("Fred");
	System.out.println(fred.belongsTo(myFace));
	fred.deActivate();
	Network.Member wilma = myFace.new Member("Wilma");
  }
}
