
public class guessgame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		
		boolean p1isRight=false;
		boolean p2isRight=false;
        boolean p3isRight=false;
        
        int targetNumber=(int) (Math.random()*10);
        System.out.println("I have a number between 0 and 9");
        while(true) {
        	System.out.println("Number to guess is "+targetNumber);
        	p1.guess();
        	p2.guess();
        	p3.guess();
        	
        	guessp1=p1.number;
        	System.out.println("player one guessed "+guessp1);
        	
        	guessp2=p2.number;
        	System.out.println("player two guessed "+guessp2);
        	
        	guessp3=p3.number;
        	System.out.println("player three guessed "+guessp3);
        	
        	if (guessp1==targetNumber) {
        		p1isRight=true;
        	}
        	if (guessp2==targetNumber) {
        		p2isRight=true;
        	}
        	if (guessp3==targetNumber) {
        		p3isRight=true;
        	}
        	
        	if (p1isRight || p2isRight ||p3isRight) {
        		System.out.println("Let's see who won ?");
        		System.out.println("player one got it "+p1isRight);
        		System.out.println("player two got it "+p2isRight);
        		System.out.println("player three got it "+p3isRight);
        		System.out.println("You win!");
        		break;//猜对，则跳出while循环
        		}else {
        			System.out.println("Game over!");//猜错，重复猜数
        		}
        }
				
	}

}
