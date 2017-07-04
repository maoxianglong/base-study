package com.mxl.builder.model;

public class NutritionFacts {

	//创建该对象需要的属性
	private final int servingSize;
	private final String servingName;
	private final int number;
	private final int safeId;

	public int getServingSize() {
		return servingSize;
	}

	public String getServingName() {
		return servingName;
	}

	public int getNumber() {
		return number;
	}

	public int getSafeId() {
		return safeId;
	}

	/**
	 * 静态内部类，用来创建对象，并且对属性值设置
	 * @author user
	 *
	 */
	public static class Builder {
		private final int servingSize;
		private final String servingName;
		private int number;
		private int safeId;

		public Builder(int servingSize, String servingName) {
			this.servingSize = servingSize;
			this.servingName = servingName;
		}

		public Builder number(int number) {
			this.number = number;
			return this;
		}

		public Builder safeId(int safeId) {
			this.safeId = safeId;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	//构造器，传入内部类对象
	private NutritionFacts(Builder builder) {
		servingName = builder.servingName;
		servingSize = builder.servingSize;
		number = builder.number;
		safeId = builder.safeId;
	}

	public static void main(String[] args) {
		NutritionFacts nutritionFacts = new NutritionFacts.Builder(20, "Tom")
				.number(40).safeId(110).build();
		System.out.println(nutritionFacts.servingName);
		System.out.println(nutritionFacts.servingSize);
		System.out.println(nutritionFacts.number);
		System.out.println(nutritionFacts.safeId);
	}
}
