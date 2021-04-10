package comparator;

import java.util.Comparator;

import character.Hero;

public class HeroComparatorByHp implements Comparator<Hero>{
	public int compare(Hero o1, Hero o2) {
		if (o1.getHp() > o2.getHp())
			return 1;
		if (o2.getHp() > o1.getHp())
			return -1;
		else {
			return 0;
		}
	};

}
