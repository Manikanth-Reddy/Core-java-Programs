package programs;

public class Xylom_Phloem {
public static void main(String[] args) {
	
	int num=12234;
	int extreme=0;
	int mean=0;
	int temp=num;
	int digits=0;
	while(temp>0) {
		temp/=10;
		digits++;
	}
	for(int i=1;i<=digits;i++) {
		if(i==1 || i==digits) {
			extreme+=num%10;
			num/=10;
		}
		else {
			mean+=num%10;
			num/=10;
		}
	}
	if(extreme==mean) System.out.println("Xylom");
	else System.out.println("Phloem");
}
}
