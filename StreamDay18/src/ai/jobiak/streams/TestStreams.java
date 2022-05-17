package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Hi");
		list.add("Hola");
		list.add("Bonjure");
		list.stream().forEach(System.out::println);
		
		Consumer<String> consumer=(String str)->{System.out.println(str);};
		list.stream().forEach(consumer);
		
		long count=list.stream().count();
		System.out.println(count);
		
		List<String> letterB=list.stream().filter(e->(e.charAt(0)=='H')).collect(Collectors.toList());
		System.out.println(letterB);
		
		Predicate<String> bLetter=(String str)->{return(str.charAt(0)=='H');};
		letterB=list.stream().filter(bLetter).collect(Collectors.toList());
		System.out.println(letterB);
		
		List<String> length=list.stream().filter(e->(e.length()>4)).collect(Collectors.toList());
		System.out.println(length);
		
		list.stream().map(e->(e.toUpperCase())).forEach(consumer);
		
		Function<String,String> upperCase=(e)->{return e.toUpperCase();}; //uppercase is done through function interface,we can use uppercase ref where we want uppercase  
		list.stream().map((upperCase)).forEach(consumer);
		
		list.stream().map(e->e.substring(0, 2)).forEach(consumer);
		
		
	}
	

}
