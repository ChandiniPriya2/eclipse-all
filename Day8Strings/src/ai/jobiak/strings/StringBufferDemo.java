package ai.jobiak.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("jobiaik.ai");
		StringBuffer buffer1=new StringBuffer("jobiak.ai");
		System.out.println(buffer1);
		System.out.println(buffer);
		System.out.println(buffer.equals(buffer1));//false
		System.out.println(buffer.capacity());//26
		//System.out.println(buffer.ensureCapacity(27));
		System.out.println(buffer.append("vizag"));
		System.out.println(buffer.charAt(3));
		System.out.println(buffer.indexOf("ai"));
		System.out.println(buffer.lastIndexOf("ai"));
		System.out.println((buffer.indexOf("a", 5)));
      System.out.println(buffer.substring(8));
      System.out.println(buffer.substring(0, 3));
      System.out.println(buffer.delete(0, 2));
      System.out.println(buffer.getClass());
      System.out.println(buffer.insert(2,"hyd"));
      System.out.println(buffer.replace(1, 4, "chandini"));
      System.out.println(buffer.reverse());
      System.out.println(buffer.length());
  //    System.out.println(buffer.trimToSize());
      
	}

}
