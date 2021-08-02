package chap08_17;

public class Bar {
	int grade;
	boolean quest_flag;
	boolean quest_clear;
	int quest;
	public void irai(Hero h) {

		System.out.println("酒場に訪れた。");
	if(!quest_flag) {
		if(this.grade <= 100) {
			System.out.println("採取依頼！");
			this.quest_flag = true;

			this.quest = 1;
		}
		else if(this.grade <= 200) {
			System.out.println("洞窟に住むゴブリン退治！");
			this.quest_flag = true;
			this.quest = 2;
			}
		else  {
			System.out.println("山の奥地に住むドラゴン退治！");
			this.quest_flag = true;
			this.quest = 3;
			}
		if(quest == ture) {
		swich(quest){
			case 1
		}

	}
	}
}
