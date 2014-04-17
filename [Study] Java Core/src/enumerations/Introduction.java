package enumerations;


public class Introduction
{
	/**
	 * ENUMERATIONS IN JAVA
	 */

	/*
	 * Start with a really simple example -- say we want to represents the suits in a deck o cards.
	 */





































	enum Suit
	{
		SPADES, HEARTS, DIAMONDS, CLUBS;
	}

	/**
	 * What this is doing is - defining a fixed set of specific values that we can use, for example
	 * inside a switch statement. The old way to simulate this in Java:
	 * TYPE-SAFE ENUMERATION PATTERN.
	 */

	/*
	 * Old way of simulating a variable which can take one of a number of specific values.
	 */
	static class SuitOld // static to allow me to declare the constants
	{
		public static final SuitOld SPADES = new SuitOld();
		public static final SuitOld HEARTS = new SuitOld();
		public static final SuitOld DIAMONDS = new SuitOld();
		public static final SuitOld CLUBS = new SuitOld();

		private SuitOld(){} // to ensure we cannot create any other new instances
	}

	/**
	 * ADVANTAGES :: USe '==' to test equality (e.g. I have a reference <s> to a SuitOld object.
	 *               Is 's == SPADES'?
	 *            :: SPADES, HEARTS, etc. are actual objects of class SuitOld
	 *               => can have other data or methods inside them, can even override methods
	 *                  for each type => flexibility
	 * DISADVANTAGES :: Can't use it in a switch statement (can only use scalar values)
	 *                  => need to have a lot of cascading if-then-else's
	 */

	/**
	 * ENUMS -- lets you keep this functionality
	 */

	class Card
	{
		private int value;
		//private Suit
	}




















}
