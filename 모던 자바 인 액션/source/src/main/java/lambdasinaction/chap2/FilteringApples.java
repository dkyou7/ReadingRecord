package lambdasinaction.chap2;

import jdk.internal.org.jline.terminal.MouseEvent;

import java.awt.*;
import java.util.*;
import java.util.List;

public class FilteringApples{

	public static void main(String ... args){

		List<Apple> inventory = Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red"));	

		// [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
		List<Apple> greenApples = filterApplesByColor(inventory, "green");
		System.out.println(greenApples);

		// [Apple{color='red', weight=120}]
		List<Apple> redApples = filterApplesByColor(inventory, "red");
		System.out.println(redApples);

		// [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
		List<Apple> greenApples2 = filter(inventory, new AppleColorPredicate());
		System.out.println(greenApples2);

		// [Apple{color='green', weight=155}]
		List<Apple> heavyApples = filter(inventory, new AppleWeightPredicate());
		System.out.println(heavyApples);

		// []
		List<Apple> redAndHeavyApples = filter(inventory, new AppleRedAndHeavyPredicate());
		System.out.println(redAndHeavyApples);

		// [Apple{color='red', weight=120}]
		List<Apple> redApples2 = filter(inventory, new ApplePredicate() {
			public boolean test(Apple a){
				return a.getColor().equals("red"); 
			}
		});
		System.out.println(redApples2);

		List<Apple> greenAndBad = filter(inventory, new AppleGreenAndBad());
		System.out.println(greenAndBad);

		List<Apple> result = filter(inventory, (Apple apple) -> apple.getColor().equals("green"));
		System.out.println(result);

		List<Apple> pandan = pandan(inventory, new AppleGreen());
		List<Apple> pandan_lamda = pandan(inventory, (Apple apple) -> "green".equals(apple.getColor()));


		List<Apple> inventory2 = Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red"));
		List<Apple> filter = filterT(inventory2, (Apple apple) -> "green".equals(apple.getColor()));
		List<Integer> numers = Arrays.asList(1,2,3,4,5,6,7,8,9); // 배열 생성
		List<Integer> evenNumbers = filterT(numers, (Integer i) -> i % 2 == 0);

		System.out.println(inventory);
		inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
		System.out.println(inventory);
		MouseEvent.Button button = new MouseEvent.Button("send");
		button.se
	}

	public static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory){
			if("green".equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApplesByColor(List<Apple> inventory, String color){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory){
			if(apple.getColor().equals(color)){
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory){
			if(apple.getWeight() > weight){
				result.add(apple);
			}
		}
		return result;
	}


	public static List<Apple> filter(List<Apple> inventory, ApplePredicate p){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory){
			if(p.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> pandan(List<Apple> appleList, ApplePandan p){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : appleList){
			if(p.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}

	public static class Apple {
		private int weight = 0;
		private String color = "";

		public Apple(int weight, String color){
			this.weight = weight;
			this.color = color;
		}

		public Integer getWeight() {
			return weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String toString() {
			return "Apple{" +
					"color='" + color + '\'' +
					", weight=" + weight +
					'}';
		}
	}

	interface ApplePredicate{
		public boolean test(Apple a);
	}

	interface ApplePandan{
		public boolean test(Apple apple);
	}

	public interface Predicate<T>{
		public boolean test(T t);
	}

	public static <T> List<T> filterT(List<T> list, Predicate<T> p){
		List<T> res = new ArrayList<>();
		for(T t : list){
			if(p.test(t)){
				res.add(t);
			}
		}
		return res;
	}

	static class AppleGreen implements ApplePandan{
		public boolean test(Apple apple){
			return "green".equals(apple.getColor());
		}
	}
	static class AppleHeavy implements ApplePandan{
		public boolean test(Apple apple) {
			return apple.getWeight() > 150;
		}
	}

	static class AppleGreenAndBad implements ApplePredicate{
		public boolean test(Apple apple) {
			return "green".equals(apple.getColor()) && apple.getWeight()<90;
		}
	}

	static class AppleWeightPredicate implements ApplePredicate{
		public boolean test(Apple apple){
			return apple.getWeight() > 150; 
		}
	}
	static class AppleColorPredicate implements ApplePredicate{
		public boolean test(Apple apple){
			return "green".equals(apple.getColor());
		}
	}

	static class AppleRedAndHeavyPredicate implements ApplePredicate{
		public boolean test(Apple apple){
			return "red".equals(apple.getColor()) 
					&& apple.getWeight() > 150; 
		}
	}
}