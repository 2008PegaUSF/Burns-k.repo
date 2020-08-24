package Assignments;

public class Triangle {
	public void binary() {
		//setting up the starting condition so that 0 is up top
		int yes=0;
		//setting up the inner and outer loops
		for(int i = 0; i<=4;i++) {
			for(int j=1;j<=i;j++) {
				//since we are starting at 0, you need to do the opposite
				//and vise versa
				if(yes==0) {
					System.out.print(yes);
					yes=1;
				}else {
					System.out.print(yes);
					yes=0;
				}
			}
			//so that after a cycle it moves down one
			System.out.println();
		}
	}
}