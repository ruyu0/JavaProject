package battle;

import character.Hero;

public class Attack implements Runnable {
	Hero attackHero;
	Hero attackedHero;

	public Attack(Hero h1, Hero h2) {
		// TODO Auto-generated constructor stub
		attackHero = h1;
		attackedHero = h2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int hurt = attackHero.getAggressivity() - attackedHero.getArmor();
		int attackSpeed = attackHero.getAttackSpeed();
		if (hurt > 0) {
			while (attackedHero.getHp() > 0 && attackHero.getHp() > 0) {
				attackedHero.setHp(attackedHero.getHp() - hurt);
				System.out.println(attackHero + "��" + attackedHero + "������һ�ι��������" + hurt + "���˺�," + attackedHero + "߀��" + attackedHero.getHp() + "�c����");
				try {
					Thread.sleep(attackSpeed * 100);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println(attackHero.getHp() > 0 ? attackedHero + "������" : attackHero + "������");
		} else {
			System.out.println(attackHero + "�򲻶�" + attackedHero);
		}
	}

}
