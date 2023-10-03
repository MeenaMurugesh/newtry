package org.array;
public class StringTry {
public static void main(String[] args) {
	String s=" Java Application is simple ";
	char charAt = s.charAt(5);
	System.out.println(charAt);
	int indexOf = s.indexOf('A');
	System.out.println(indexOf);
	int lastIndexOf = s.lastIndexOf('m');
	System.out.println(lastIndexOf);
	int length = s.length();
	System.out.println(length);
	boolean empty = s.isEmpty();
	System.out.println(empty);
	boolean startsWith = s.startsWith("Ja");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("e");
	System.out.println(endsWith);
	boolean contains = s.contains("simple");
	System.out.println(contains);
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	String trim = s.trim();
	System.out.println(trim);

	String a="English";
	String b="english";
	boolean equals = a.equals(b);
	System.out.println(equals);
	boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
	System.out.println(equalsIgnoreCase);
	String replace = a.replace("Eng", "than");
	System.out.println(replace);
	String replaceAll = a.replaceAll("English", "Tamil");
	System.out.println(replaceAll);
	String substring = a.substring(2);
	System.out.println(substring);
	String substring2 = s.substring(6, 17);
	System.out.println(substring2);
	int compareTo = b.compareTo(a);
	System.out.println(compareTo);
	String concat = a.concat(b);
	System.out.println(concat);
	
	
	
	
}
}
