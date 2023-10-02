
public class EnumEx{
	
	public static void main(String[] args) {
		enum Week {월,화,수,목,금,토,일};
		
		for(Week day : Week.values())
			System.out.println(day + "요일");
		
		System.out.println();
		
		for(Week day: Week.values())
			System.out.println(day + "요일 has value " + day.ordinal());
		
		System.out.println();
		
		Week weekTest1 = Week.목;
		Week weekTest2 = Week.valueOf("토");
		
		System.out.println(weekTest1);
		System.out.println(weekTest2);
		
		System.out.println();
		
		enum WeekEng{
			월("Mon"),
			화("Tue"),
			수("Wed"),
			목("Thu"),
			금("Fri"),
			토("Sat"),
			일("Sun");
			
			final private String engName;
			private WeekEng(String name) {
				this.engName = name;
			}
			
			public String getName() {
				return engName;
			}
		};
		
		for (WeekEng day : WeekEng.values()) {
			System.out.println(day.getName());
		}
		
		System.out.println();
		
		
//		Week weekTestjw = Week.월;
//		
//		System.out.println(weekTestjw);
//		System.out.println(weekTestjw.values());
//		System.out.println(weekTestjw.ordinal());
//		
//		Week weekarray[] = Week.values();
//		System.out.println(weekarray[2]);
	}
	
}