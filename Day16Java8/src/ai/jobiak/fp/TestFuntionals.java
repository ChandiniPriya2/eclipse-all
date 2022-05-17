package ai.jobiak.fp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class TestFuntionals {

	public static void main(String[] args) {
		Function<String,Integer> lengthFun=(String str)->{  return str.length();  };
		int result=lengthFun.apply("jobiak.com");
		System.out.println(result);
		
		ArrayList<String > list=new ArrayList<>();
		list.add("PineApple");list.add("Mango");list.add("orange");
		
		Predicate<Boolean> predicate=(Boolean)->{return 100<45;};
		System.out.println(predicate.test(true));
		
		List<Integer> lengthList=method(list,lengthFun);
		System.out.println(lengthList);
		
		Consumer<String> consumer=(String str)->{System.out.println(str);};
		consumer.accept("jobiak");
		
		Supplier<Double> supplier=()->Math.random();
		System.out.println(supplier.get());
		
		Supplier<Integer> supplier2=()->2*2*2;
		System.out.println(supplier2.get());
	}		
		
		
	

	private static List<Integer> method(ArrayList<String> list, Function<String, Integer> functionParam) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList=new ArrayList<>();
		for(String str:list) {
			int length=functionParam.apply(str);
			intList.add(length);
			
		}
		return intList;
	}

}