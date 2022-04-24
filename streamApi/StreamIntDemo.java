package org.Parker1.Shannu.stream;

import java.util.*;
import java.util.stream.*;

public class StreamIntDemo {
public static void main(String[] args) {
//	System.out.println(IntStream.range(1, 11).count());
	IntStream i=IntStream.range(1, 11);
	IntSummaryStatistics stat=i.summaryStatistics();
	System.out.println(stat);
	String ar[]= {"ani","AYR","bye","ayy"};
	String s="two";

	List<String> num=Arrays.asList(ar);
//	Stream s=Stream.of(ar).sorted();
//	System.out.println(s);
//Arrays.stream(ar).sorted().forEach(System.out::println);
//Arrays.stream(ar).map(i->i-2).average().ifPresent(System.out::println);
	num.stream().map(String::toUpperCase).filter(x->x.startsWith("a")).forEach(System.out::println);
}
}
