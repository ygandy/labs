

	import java.text.NumberFormat;

	/** 
	 * 
	 * @author Administrator
	 *
	 */
	public class Circle {
		public int radius;
		public static int count;
		
		public Circle(){
			
		}
		
		/**
		 * 
		 * @param radius
		 * @return circumference
		 */

			
		public Circle(int radius) {
			this.radius = radius;
		}

		public double getCircumference(int radius) {
			return 2 * Math.PI * radius;
		}

		public String getFormattedCircumference(int radius) {
			double circum = getCircumference(radius);
			String circumFormatted = formatNumber(circum);
			return circumFormatted;
		}

		public double getArea(int radius) {
			return Math.PI * (radius * radius);
		}

		public String getFormattedArea(int radius) {
			double area = getArea(radius);
			return formatNumber(area);
		}
		public String toString() {
			return "Circle: radius " + radius + " has a circumference of " + getFormattedCircumference(radius);
		}

		private String formatNumber(double value) {
			NumberFormat num = NumberFormat.getNumberInstance(); // created instance
			num.setMaximumFractionDigits(2);
			return num.format(value);
		}

		public static int getObjectCount() {
			int count = 0;
			count++;
			return count;
		}
		/*Created by java: 
		private static int objectCount = 0;
			public static int getObjectCount() {
			return objectCount;
		}*/
	}
